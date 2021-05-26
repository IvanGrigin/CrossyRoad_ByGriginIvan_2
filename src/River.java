import java.awt.*;
import java.util.ArrayList;

public class River {
    public int x;
    public int y;
    public int w;
    public int h;
    public int level;
    public ArrayList<Bridge> bridges;

    public River(int level, int y, int h){
        this.x = 0;
        this.y = y;
        this.w = 600;
        this.h = h;
        this.level = level;
        bridges = new ArrayList<>();
        addBridges(level);
    }
    public void addBridges(int level){
        int otstup = this.h;
        int t = (int)(Math.random() * 7);
        bridges.add(new Bridge((t + 1) * otstup, this.y, otstup, level));
        while (true){
            t = (int)(Math.random() * 7);
            if (bridges.get(bridges.size() - 1).x + 1.5 * bridges.get(bridges.size() - 1).w > 600){
                break;
            } else {
                bridges.add(new Bridge((t + 1) * otstup +  bridges.get(bridges.size() - 1).x + bridges.get(bridges.size() - 1).w, this.y, otstup, level));
            }
        }
    }
    public void draw(Graphics2D g2d, Painter p, boolean b){
        p.drawRiver(g2d, this, b);
    }
}
