import java.awt.*;
import java.util.ArrayList;

public class WaterLilyRiver {
    public int x;
    public int y;
    public int w;
    public int h;
    public int level;
    public double speed = 0.01;
    public ArrayList<WaterLily> waterLilies;

    public WaterLilyRiver(int level, int y, int h){
        this.x = 0;
        this.y = y;
        this.w = 600;
        this.h = h;
        this.level = level;
        if (Math.random() > 0.5){
            speed = -speed;
        }
        waterLilies = new ArrayList<>();
        addLily(level);
    }
    public void addLily(int level){
        int otstup = this.h;
        int t = (int)(Math.random() * 7);
        waterLilies.add(new WaterLily((t + 1) * otstup, this.y, speed));
        while (true){
            t = (int)(Math.random() * 7);
            if (waterLilies.get(waterLilies.size() - 1).x + 1.5 * waterLilies.get(waterLilies.size() - 1).w > 600){
                break;
            } else {
                waterLilies.add(new WaterLily((t + 1) * otstup +  waterLilies.get(waterLilies.size() - 1).x + waterLilies.get(waterLilies.size() - 1).w, this.y, speed));
            }
        }
    }
    public void updateState(long dt){
        for(int i = 0; i < waterLilies.size(); i++){
            waterLilies.get(i).updateState(speed, this.w, dt);
        }
    }
    public void draw(Graphics2D g2d, Painter p, boolean b){
        p.drawWaterLilyRiver(g2d, this, b);
    }
}
