import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class WorldPanel extends JPanel {
    public Man man;
    public ArrayList<Road> roads = new ArrayList<>();
    public ArrayList<Forest> forests = new ArrayList<>();
    public ArrayList<River> rivers = new ArrayList<>();
    public int level;
    public int roadHeight = 30;
    public int numberOfDeath = 0;
    public boolean needNewLevel = false;
    public InventarPanel inventarPanel = new InventarPanel();
    public int otstup = 150;
    public int n = 20;
    public boolean isGod = false;

    public WorldPanel(int level) throws IOException {
        this.level = level;
        man = new Man();
        start();
    }

    public void start(){
        roads.clear();
        forests.clear();
        rivers.clear();
        man.start();
        needNewLevel = false;

        for(int i = 0; i < n; i = i + 1){
            double d1 = Math.random();
            if(d1 > 0.66){
                forests.add(new Forest(level, otstup + i * roadHeight, roadHeight));
                roads.add(new Road(level,otstup + (i+1) * roadHeight, roadHeight));
                roads.add(new Road(level,otstup + (i+2) * roadHeight, roadHeight));
            }else if(d1 < 0.33){
                roads.add(new Road(level,otstup + i * roadHeight, roadHeight));
                roads.add(new Road(level,otstup + (i+1) * roadHeight, roadHeight));
                forests.add(new Forest(level,otstup + (i+2) * roadHeight, roadHeight));
            }else{
                roads.add(new Road(level,otstup + i * roadHeight, roadHeight));
                forests.add(new Forest(level,otstup + (i+1) * roadHeight, roadHeight));
                roads.add(new Road(level,otstup + (i+2) * roadHeight, roadHeight));
            }
            if(Math.random() > 0.5){
                rivers.add(new River(level, otstup + (i + 3) * roadHeight, roadHeight));
                i = i + 1;
            }
            forests.add(new Forest(level, otstup + (i + 3) * roadHeight, roadHeight));
            i = i + 3;
        }
        int t = roads.size() + forests.size() + rivers.size();
        while (t < n + 3){
            forests.add(new Forest(level, otstup + t * roadHeight, roadHeight));
            t = t + 1;
        }
        t = roads.size() + forests.size() + rivers.size();
        rivers.add(new River(level, otstup + t * roadHeight, roadHeight));
    }
    public void CheckKeyEvent(KeyEvent e){
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            if ((e.getKeyCode() == KeyEvent.VK_ESCAPE)||(e.getKeyCode() == KeyEvent.VK_Q)) {
                inventarPanel.isOn = !inventarPanel.isOn;
            } else {
                man.CheckKeyEvent(e);
            }
            if (e.getKeyCode() == KeyEvent.VK_G){
                isGod = !isGod;
            }
        }
    }
    public void draw(Graphics2D g2d, Painter p){
        p.drawWorld(g2d, level, this);
        for (int i = 0; i < forests.size(); i = i + 1) {
            forests.get(i).draw(g2d, p);
        }
        for (int i = 0; i < roads.size(); i = i + 1) {
            roads.get(i).draw(g2d, p);
        }
        if (rivers != null) {
            for (int i = 0; i < rivers.size(); i = i + 1) {
                rivers.get(i).draw(g2d, p);
            }
        }
        man.draw(g2d, p);
        g2d.setColor(Color.BLACK);
        g2d.drawString(""+numberOfDeath, 30,50);
        g2d.drawString("level: " + level, 30,70);
        g2d.drawString("- Are you God?  - " + isGod, 30, 90);
        if (inventarPanel.isOn == true){
            inventarPanel.draw(g2d);
        }

    }

    public void updateState(long dt) {
        if (inventarPanel.isOn == false) {
            for (int i = 0; i < roads.size(); i++) {
                roads.get(i).updateState(dt);
            }
            for (int i = 0; i < roads.size(); i = i + 1) {
                roads.get(i).updateState(dt);
                if (man.checkCollisionRoad(roads.get(i))) {
                    if (isGod == false) {
                        man.start();
                        numberOfDeath = numberOfDeath + 1;
                    }
                }
            }
            for (int i = 0; i < rivers.size(); i = i + 1) {
                if ((man.y >= rivers.get(i).y) && (man.y <= rivers.get(i).y + 10)) {
                    if (man.checkCollisionRiver(rivers.get(i))) {
                        if (isGod == false) {
                            man.start();
                            numberOfDeath = numberOfDeath + 1;
                        }
                    }
                }
            }
            if (man.y < 55) {
                needNewLevel = true;
            }
            man.x = man.x + 2 * 600;
            man.x = man.x % 600;
        }
    }
}
