import java.awt.*;
import java.awt.event.KeyEvent;

public class Man {
    public double x;
    public int y;
    public int w;
    public int h;
    public int speed;
    public double lilySpeed = 0;
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
                x = x - x % w;
            } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_D)) {
                x = x + speed;
                if (!(x % w == 0)) {
                    x = x + w - x % w;
                }
            } else if ((e.getKeyCode() == KeyEvent.VK_UP) || (e.getKeyCode() == KeyEvent.VK_W)) {
                y = y - speed;
            } else if ((e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_S)) {
                y = y + speed;
            }
            if (x % w > w/2) {
                x = x - x % w + w;
            } else {
                x = x - x % w;
            }
        }
    }

    public void start() {
        x = 300;
        y = 930;
    }

    public void draw(Graphics2D g2d, Painter p, boolean b, boolean isGod) {
        p.drawMan(g2d, this, b);
        if (isGod == true){
            g2d.setColor(Color.YELLOW);
            g2d.drawOval((int) (x-10), (int) (y-10), w + 20, h + 20);
            g2d.drawOval((int) (x-11), (int) (y-11), w + 22, h + 22);
            g2d.drawOval((int) (x-12), (int) (y-12), w + 24, h + 24);
        }
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
    public boolean checkCollisionWaterLilyRiver(WaterLilyRiver r) {
        boolean ret = false;
        if (Math.abs(this.y - r.y) < 35) {
            for (int i = 0; i < r.waterLilies.size(); i++) {
                if (checkCollisionLily(r.waterLilies.get(i))) {
                    ret = true;
                }
            }
        }
        return ret;
    }

    public boolean checkCollisionLily(WaterLily b) {
        if ((this.x + this.w/2 < b.x + b.w) && (this.x + this.w/2 > b.x) && (this.y + 2 < b.y + b.h) && (this.y + 2 > b.y)) {
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
