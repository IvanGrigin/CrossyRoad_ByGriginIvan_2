import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.io.IOException;

public class Frame extends JFrame implements MouseListener, KeyEventDispatcher {
    public WorldPanel worldPanel;
    public ChoicePanel choicePanel;
    public MenuPanel menuPanel;

    public int level;
    public Painter painter;
    public String whichIsOn = "menu";

    public long previousWorldUpdateTime = System.currentTimeMillis();

    public Frame() throws IOException {
        level = 1;
        worldPanel = new WorldPanel(level);
        choicePanel = new ChoicePanel();
        menuPanel = new MenuPanel();

        painter = new Painter();

        this.setTitle("Crossy_Road");
        this.setSize(600, 1000);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(this);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g){
        BufferStrategy bufferStrategy = getBufferStrategy();
        if (bufferStrategy == null) {
            createBufferStrategy(2);
            bufferStrategy = getBufferStrategy();
        }
        g = bufferStrategy.getDrawGraphics();
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0,getWidth(),getHeight());

        if (whichIsOn.equals("menu")) {
            menuPanel.draw(g2d, painter);
        }
        if (whichIsOn.equals("choice")) {
            choicePanel.draw(g2d, painter);
        }
        if (whichIsOn.equals("world")) {
            worldPanel.draw(g2d, painter);
            g2d.setColor(Color.BLACK);
        }


        g.dispose();
        bufferStrategy.show();
    }

    public void updateState(){
        long currentTime = System.currentTimeMillis();
        long dt = currentTime - previousWorldUpdateTime;
        if (!whichIsOn.equals("inventar")) {
            worldPanel.updateState(dt);
            if (worldPanel.needNewLevel) {
                level++;
                worldPanel.level = level;
                worldPanel.start();
            }
        }

        previousWorldUpdateTime = currentTime;
    }


    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        if (whichIsOn.equals("world")) {
            worldPanel.CheckKeyEvent(e);
        }
        return false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (whichIsOn.equals("choice")) {
            level = choicePanel.checkClick(e, level);
            try {
                worldPanel = new WorldPanel(level);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (whichIsOn.equals("menu")) {
            whichIsOn = menuPanel.checkClick(e, whichIsOn);
        }
        if ((whichIsOn.equals("choice"))){
            if ((e.getX() < 200) && (e.getY() < 150)) {
                whichIsOn = "menu";
            }
            if ((e.getX() > 400) && (e.getY() < 150)) {
                whichIsOn = "world";
            }
        }
        if ((whichIsOn.equals("world")) && (worldPanel.inventarPanel.isOn)) {
            String s = worldPanel.inventarPanel.checkClick(e);
            if (s.equals("exit")) {
                whichIsOn = "menu";
                try {
                    worldPanel = new WorldPanel(1);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            } else if (!s.equals("")){
                worldPanel.man.numberOfImage = s;
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
