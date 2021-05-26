import java.awt.*;

public class Car {
    public double x;
    public double y;
    public int w;
    public int h;
    public int number;
    public int level;
    public double speed;

    public Car(double x, double y, int level){
        this.level = level;
        this.x = x;
        this.y = y;
        number = (int) (Math.random() * 45);
        int k = (int) (Math.random() * 10);
        w = 75 + k;
        h = 30;
    }
    public void draw(Graphics2D g2d, Painter p){
        //p.drawCar(g2d, this, speed);
        g2d.setColor(Color.MAGENTA);
        g2d.drawRect((int) x,(int) y,w,h);
    }
    public void updateState(double speed0, int w0, long dt){
        if(x > w0){ x = x - w0; }
        if(x < 0){ x = x + w0; }
        this.x += speed0 * dt;
    }
}
