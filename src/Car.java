import java.awt.*;

public class Car {
    public double x;
    public double y;
    public int w;
    public int h;
    public int number;

    public Car(double x, double y){
        this.x = x;
        this.y = y;
        number = (int) (Math.random() * 3);
        w = 56;
        h = 30;
    }
    public void draw(Graphics2D g2d, Painter p){
        p.drawCar(g2d, this);
    }
    public void updateState(double speed0, int w0, long dt){
        if(x > w0){ x = x - w0; }
        if(x < 0){ x = x + w0; }
        this.x += speed0 * dt;
    }
}
