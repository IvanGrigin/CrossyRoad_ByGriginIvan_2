import java.awt.*;
import java.awt.event.KeyEvent;

public class Man {
    public int x;
    public int y;
    public int w;
    public int h;
    public int speed;
    public String numberOfImage = "01";

    public Man() {
        start();
        w = 30;
        h = 30;
        speed = 30;
    }

    public void CheckKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_PRESSED) { // Если кнопка была нажата (т.е. сейчас она зажата)
            if ((e.getKeyCode() == KeyEvent.VK_LEFT) || (e.getKeyCode() == KeyEvent.VK_A)) {
                x = x - speed;
            } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_D)) {
                x = x + speed;
            } else if ((e.getKeyCode() == KeyEvent.VK_UP) || (e.getKeyCode() == KeyEvent.VK_W)) {
                y = y - speed;
            } else if ((e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_S)) {
                y = y + speed;
            }
        }
    }

    public void start() {
        x = 300;
        y = 930;
    }

    public void draw(Graphics2D g2d, Painter p) {
        p.drawMan(g2d, this);
        g2d.setColor(Color.MAGENTA);
        g2d.drawRect((int) x,(int) y,w,h);
    }

    public boolean checkCollisionRoad(Road r) {
        boolean ret = false;
        if (Math.abs(this.y - r.y) < 35) {
            for (int i = 0; i < r.cars.size(); i++) {
                if (checkCollisionCar(r.cars.get(i))) {
                    ret = true;
                }
            }
        }
        return ret;
    }

    public boolean checkCollisionCar(Car t) {
        if (((this.x < t.x + t.w) && (this.x > t.x) || (this.x + this.w > t.x) && (this.x + this.w < t.x + t.w)) && (this.y + 2 < t.y + t.h) && (this.y + 2 > t.y)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCollisionRiver(River r) {
        boolean ret = false;
        for (int i = 0; i < r.bridges.size(); i++) {
            if (r.bridges.get(i) != null) {
                if (checkCollisionBridge(r.bridges.get(i))) {
                    ret = true;
                }
            }
        }
        return !ret;
    }

    public boolean checkCollisionBridge(Bridge b) {
        if ((this.x + this.w/2 < b.x + b.w) && (this.x + this.w/2 > b.x) && (this.y + 2 < b.y + b.h) && (this.y + 2 > b.y)) {
            return true;
        } else {
            return false;
        }
    }

}
