import java.awt.*;
import java.util.ArrayList;

public class Road {
    public int x;
    public int y;
    public int w;
    public int h;
    public int level;
    public double speed;
    public ArrayList<Car> cars;

    public Road( int level, int y, int h){
        this.level = level;
        this.x = 0;
        this.y = y;
        this.w = 600;
        this.h = h;
        cars = new ArrayList<>();

        addSpeed(level);
        addCars(level);
    }
    public void addSpeed(int level){
        int sign = 1;
        for(int i = 1; i < (Math.random()*10); i = i + 1){
            sign = sign * (-1);
        }
        double dv = Math.random()/100;
        double minSpeed = 0;
        if (level <= 3){
            minSpeed = 0.007 + dv;
        } else if (level <= 6) {
            minSpeed = 0.015 + dv;
        } else if (level <= 9) {
            minSpeed = 0.03 + dv;
        } else if (level <= 12) {
            minSpeed = 0.04 + dv;
        } else if (level <= 15) {
            minSpeed = 0.06 + dv;
        } else {
            minSpeed = 0.13 + dv + 0.0035 * level;
        }
        speed = sign*(minSpeed + Math.random()*5/1000);
    }
    public void addCars(int level){
        int otstup = this.h;
        cars.add(new Car(Math.random() * otstup, this.y, level));
        while (true) {
            if (level <= 3) {
                cars.add(new Car((Math.random()+1) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y, level));
            } else if (level <= 6) {
                cars.add(new Car((Math.random()+1.5) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y, level));
            } else if (level <= 9) {
                cars.add(new Car((Math.random()+2.5) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y, level));
            } else if (level <= 12) {
                cars.add(new Car((Math.random()+3) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y, level));
            } else if (level <= 15) {
                cars.add(new Car((Math.random()+4) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y, level));
            } else {
                cars.add(new Car((Math.random()+4.7) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y, level));
            }
            if (cars.get(cars.size()-1).x + 3 * cars.get(cars.size()-1).w > this.w){
                break;
            }
        }
    }
    public void updateState(long dt){
        for(int i = 0; i < cars.size(); i++){
            cars.get(i).updateState(speed, this.w, dt);
        }
    }
    public void draw(Graphics2D g2d, Painter p, boolean b){
        p.drawRoad(g2d, this, b);
    }
}
