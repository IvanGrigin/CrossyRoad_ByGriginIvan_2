import java.awt.*;

public class Bridge {
    public int x;
    public int y;
    public int w;
    public int h;
    public int level;

    public Bridge(int x, int y, int h, int level){
        this.x = x;
        this.y = y;
        this.w = h + ((int) (Math.random() * 4)) * h;
        this.h = h;
        this.level = level;
    }
    public void draw(Graphics2D g2d, Painter p){
        p.drawBridge(g2d, this);
    }
}
