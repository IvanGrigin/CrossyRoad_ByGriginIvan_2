import java.awt.*;
import java.util.ArrayList;

public class Forest {
    public int x;
    public int y;
    public int w;
    public int h;
    public int number;
    public int level;
    public ArrayList<Integer> numberOfForest = new ArrayList<>();


    public Forest(int level, int y, int h) {
        this.level = level;
        this.x = 0;
        this.y = y;
        this.w = 600;
        this.h = h;
        this.number = (int) (Math.random() * 3);
        newNumbers();
    }

    public void draw(Graphics2D g2d, Painter p, boolean b) {
        p.drawForest(g2d, this, b);
    }

    public void newNumbers() {
        for (int i = 0; i < (this.w / this.h + 2); i = i + 1) {
            double d = Math.random();
            if (d > 0.5) {
                numberOfForest.add(0);
            } else if (d > 0.2) {
                numberOfForest.add(1);
            } else {
                numberOfForest.add(2);
            }
        }
    }
}
