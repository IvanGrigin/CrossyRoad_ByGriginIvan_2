import java.awt.*;
import java.util.ArrayList;

public class Road {
    public int x;
    public int y;
    public int w;
    public int h;
    public double speed;
    public ArrayList<Car> cars;

    public Road( int level, int y, int h){
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
        double minSpeed = 0;
        if (level <= 3){
            minSpeed = 0.007;
        } else if (level <= 6) {
            minSpeed = 0.015;
        } else if (level <= 9) {
            minSpeed = 0.03;
        } else if (level <= 12) {
            minSpeed = 0.04;
        } else if (level <= 15) {
            minSpeed = 0.05;
        } else {
            minSpeed = 0.07;
        }
        speed = sign*(minSpeed + Math.random()*5/1000);
    }
    public void addCars(int level){
        int otstup = this.h;
        cars.add(new Car(Math.random() * otstup, this.y));
        while (true) {
            if (level <= 3) {
                cars.add(new Car((Math.random()+2) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y));
            } else if (level <= 6) {
                cars.add(new Car((Math.random()+7) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y));
            } else if (level <= 9) {
                cars.add(new Car((Math.random()+3) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y));
            } else if (level <= 12) {
                cars.add(new Car((Math.random()+4) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y));
            } else if (level <= 15) {
                cars.add(new Car((Math.random()+5) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y));
            } else {
                cars.add(new Car((Math.random()+7) * otstup + cars.get(cars.size()-1).x + cars.get(cars.size()-1).w, this.y));
            }
            if (cars.get(cars.size()-1).x + cars.get(cars.size()-1).w > this.w){
                break;
            }
        }
    }
    public void updateState(long dt){
        for(int i = 0; i < cars.size(); i++){
            cars.get(i).updateState(speed, this.w, dt);
        }
    }
    public void draw(Graphics2D g2d, Painter p){
        p.drawRoad(g2d, this);
    }
}
