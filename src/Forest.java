import java.awt.*;

public class Forest {
    public int x;
    public int y;
    public int w;
    public int h;
    public int number;
    public int level;


    public Forest(int level, int y, int h){
        this.level = level;
        this.x = 0;
        this.y = y;
        this.w = 600;
        this.h = h;
        this.number = (int) (Math.random() * 3);
    }
    public void draw(Graphics2D g2d, Painter p){
        p.drawForest(g2d, this);
    }
}
