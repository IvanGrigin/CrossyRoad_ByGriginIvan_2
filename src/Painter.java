import java.awt.*;

public class Painter {
    public Painter(){}



    public void drawMan(Graphics2D g2d, Man man){
        if (man.numberOfImage.equals("01")) {
            g2d.setColor(Color.RED);
        } else if (man.numberOfImage.equals("02")){
            g2d.setColor(Color.YELLOW);
        } else {
            g2d.setColor(Color.BLACK);
        }
        g2d.fillOval(man.x, man.y, man.w, man.h);
    }
    public void drawRoad(Graphics2D g2d, Road road){
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(road.x, road.y, road.w, road.h);
        for(int i = 0; i < road.cars.size(); i++){
            drawCar(g2d, road.cars.get(i));
        }
    }
    public void drawCar(Graphics2D g2d, Car car){
        g2d.setColor(Color.BLUE);
        g2d.fillRect((int)car.x, (int)car.y, car.w, car.h);
        g2d.fillRect((int)car.x + 600, (int)car.y, car.w, car.h);
        g2d.fillRect((int)car.x - 600, (int)car.y, car.w, car.h);
    }
    public void drawForest(Graphics2D g2d, Forest forest){
        g2d.setColor(Color.GREEN);
        g2d.fillRect(forest.x, forest.y, forest.w, forest.h);
    }
    public void drawRiver(Graphics2D g2d, River river){
        g2d.setColor(new Color(0,255,255));
        g2d.fillRect(river.x, river.y, river.w, river.h);
        for (int i = 0; i < river.bridges.size(); i++){
            drawBridge(g2d, river.bridges.get(i));
        }
    }
    public void drawBridge(Graphics2D g2d, Bridge bridge){
        g2d.setColor(Color.ORANGE);
        g2d.fillRect(bridge.x, bridge.y, bridge.w, bridge.h);
    }
}
