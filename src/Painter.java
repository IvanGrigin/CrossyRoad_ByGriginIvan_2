import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Painter {
    // Character
    public ArrayList<Image> characters = new ArrayList<>();
    // Level 01 - 03
    public Image level_0103_background_up = ImageIO.read(new File("data//Level_01-03//Background_up.png"));
    public Image level_0103_background_down = ImageIO.read(new File("data//Level_01-03//Background_down.png"));
    public Image level_0103_river = ImageIO.read(new File("data//Level_01-03//River.png"));
    public Image level_0103_bridge = ImageIO.read(new File("data//Level_01-03//Bridge.png"));
    public Image level_0103_lily = ImageIO.read(new File("data//Level_01-03//Lily.png"));
    public Image level_0103_road = ImageIO.read(new File("data//Level_01-03//Road.png"));
    public ArrayList<Image> level_0103_cars = new ArrayList<>();
    public ArrayList<Image> level_0103_forest = new ArrayList<>();

    // Level 04 - 06
    public Image level_0406_background_up = ImageIO.read(new File("data//Level_04-06//Background_up.png"));
    public Image level_0406_background_down = ImageIO.read(new File("data//Level_04-06//Background_down.png"));
    public Image level_0406_river = ImageIO.read(new File("data//Level_04-06//River.png"));
    public Image level_0406_bridge = ImageIO.read(new File("data//Level_04-06//Bridge.png"));
    public Image level_0406_lily = ImageIO.read(new File("data//Level_01-03//Lily.png"));
    public Image level_0406_road = ImageIO.read(new File("data//Level_04-06//Road.png"));
    public ArrayList<Image> level_0406_cars = new ArrayList<>();
    public ArrayList<Image> level_0406_forest = new ArrayList<>();

    // Level 07 - 09
    public Image level_0709_background_up = ImageIO.read(new File("data//Level_07-09//Background_up.png"));
    public Image level_0709_background_down = ImageIO.read(new File("data//Level_07-09//Background_down.png"));
    public Image level_0709_river = ImageIO.read(new File("data//Level_07-09//River.png"));
    public Image level_0709_bridge = ImageIO.read(new File("data//Level_07-09//Bridge.png"));
    public Image level_0709_lily = ImageIO.read(new File("data//Level_07-09//Lily.png"));
    public Image level_0709_road = ImageIO.read(new File("data//Level_07-09//Road.png"));
    public ArrayList<Image> level_0709_cars = new ArrayList<>();
    public ArrayList<Image> level_0709_forest = new ArrayList<>();

    // Level 10 - 12
    public Image level_1012_background_up = ImageIO.read(new File("data//Level_10-12//Background_up.png"));
    public Image level_1012_background_down = ImageIO.read(new File("data//Level_10-12//Background_down.png"));
    public Image level_1012_river = ImageIO.read(new File("data//Level_10-12//River.png"));
    public Image level_1012_bridge = ImageIO.read(new File("data//Level_10-12//Bridge.png"));
    public Image level_1012_lily = ImageIO.read(new File("data//Level_10-12//Lily.png"));
    public Image level_1012_road = ImageIO.read(new File("data//Level_10-12//Road.png"));
    public ArrayList<Image> level_1012_cars = new ArrayList<>();
    public ArrayList<Image> level_1012_forest = new ArrayList<>();

    // Level 13 - 15
    public Image level_1315_background_up = ImageIO.read(new File("data//Level_13-15//Background_up.png"));
    public Image level_1315_background_down = ImageIO.read(new File("data//Level_13-15//Background_down.png"));
    public Image level_1315_river = ImageIO.read(new File("data//Level_13-15//River.png"));
    public Image level_1315_bridge = ImageIO.read(new File("data//Level_13-15//Bridge.png"));
    public Image level_1315_lily = ImageIO.read(new File("data//Level_13-15//Lily.png"));
    public Image level_1315_road = ImageIO.read(new File("data//Level_13-15//Road.png"));
    public ArrayList<Image> level_1315_cars = new ArrayList<>();
    public ArrayList<Image> level_1315_forest = new ArrayList<>();

    // Level 16 - 18
    public Image level_1618_background_up = ImageIO.read(new File("data//Level_16-18//Background_up.png"));
    public Image level_1618_background_down = ImageIO.read(new File("data//Level_16-18//Background_down.png"));
    public Image level_1618_river = ImageIO.read(new File("data//Level_16-18//River.png"));
    public Image level_1618_bridge = ImageIO.read(new File("data//Level_16-18//Bridge.png"));
    public Image level_1618_lily = ImageIO.read(new File("data//Level_16-18//Lily.png"));
    public Image level_1618_road = ImageIO.read(new File("data//Level_16-18//Road.png"));
    public ArrayList<Image> level_1618_cars = new ArrayList<>();
    public ArrayList<Image> level_1618_forest = new ArrayList<>();


    public Painter() throws IOException {
        // Characters
        for (int i = 1; i < 10; i++){
            characters.add(ImageIO.read(new File("data//Character//Character ("+i+").png")));
        }

        // Level 01 - 03
        for (int i = 1; i < 10; i++){
            level_0103_cars.add(ImageIO.read(new File("data//Level_01-03//Cars//Car ("+i+").png")));
        }
        for (int i = 1; i < 4; i++){
            level_0103_forest.add(ImageIO.read(new File("data//Level_01-03//Forest//Forest ("+i+").png")));
        }

        // Level 04 - 06
        for (int i = 1; i < 10; i++){
            level_0406_cars.add(ImageIO.read(new File("data//Level_04-06//Cars//Car ("+i+").png")));
        }
        for (int i = 1; i < 4; i++){
            level_0406_forest.add(ImageIO.read(new File("data//Level_04-06//Forest//Forest ("+i+").png")));
        }
        // Level 07 - 09
        for (int i = 1; i < 10; i++){
            level_0709_cars.add(ImageIO.read(new File("data//Level_07-09//Cars//Car ("+i+").png")));
        }
        for (int i = 1; i < 4; i++){
            level_0709_forest.add(ImageIO.read(new File("data//Level_07-09//Forest//Forest ("+i+").png")));
        }

        // Level 10 - 12
        for (int i = 1; i < 10; i++){
            level_1012_cars.add(ImageIO.read(new File("data//Level_10-12//Cars//Car ("+i+").png")));
        }
        for (int i = 1; i < 4; i++){
            level_1012_forest.add(ImageIO.read(new File("data//Level_10-12//Forest//Forest ("+i+").png")));
        }

        // Level 13 - 15
        for (int i = 1; i < 10; i++){
            level_1315_cars.add(ImageIO.read(new File("data//Level_13-15//Cars//Car ("+i+").png")));
        }
        for (int i = 1; i < 4; i++){
            level_1315_forest.add(ImageIO.read(new File("data//Level_13-15//Forest//Forest ("+i+").png")));
        }

        // Level 16 - 18
        for (int i = 1; i < 10; i++){
            level_1618_cars.add(ImageIO.read(new File("data//Level_16-18//Cars//Car ("+i+").png")));
        }
        for (int i = 1; i < 4; i++){
            level_1618_forest.add(ImageIO.read(new File("data//Level_16-18//Forest//Forest ("+i+").png")));
        }

    }



    public void drawMan(Graphics2D g2d, Man man){
        int p = Integer.parseInt(man.numberOfImage) - 1;
        Image test = characters.get(p);
        g2d.drawImage(test, (int) man.x, man.y, man.w, man.h, null);
    }
    public void drawRoad(Graphics2D g2d, Road road){
        int level = road.level;
        Image test;

        if (level <= 3){
            test = level_0103_road;
        } else if (level <= 6) {
            test = level_0406_road;
        } else if (level <= 9) {
            test = level_0709_road;
        } else if (level <= 12) {
            test = level_1012_road;
        } else if (level <= 15) {
            test = level_1315_road;
        } else {
            test = level_1618_road;
        }
        int k = 0;
        while (true){
            g2d.drawImage(test, road.x + k * road.h, road.y, road.h, road.h, null);
            k++;
            if (road.x + road.h * k > 800){
                break;
            }
        }
        for(int i = 0; i < road.cars.size(); i++){
            drawCar(g2d, road.cars.get(i), road.speed);
        }
    }
    public void drawCar(Graphics2D g2d, Car car, double speed){
        int level = car.level;
        Image test;

        if (level <= 3){
            test = level_0103_cars.get(car.number);
        } else if (level <= 6) {
            test = level_0406_cars.get(car.number);
        } else if (level <= 9) {
            test = level_0709_cars.get(car.number);
        } else if (level <= 12) {
            test = level_1012_cars.get(car.number);
        } else if (level <= 15) {
            test = level_1315_cars.get(car.number);
        } else {
            test = level_1618_cars.get(car.number);
        }
        if (speed  > 0) {
            g2d.drawImage(test, (int) car.x, (int) car.y, car.w, car.h, null);
            g2d.drawImage(test, (int) car.x - 600, (int) car.y, car.w, car.h, null);
            g2d.drawImage(test, (int) car.x + 600, (int) car.y, car.w, car.h, null);
        } else {
            g2d.drawImage(test, (int) car.x + car.w, (int) car.y, -car.w, car.h, null);
            g2d.drawImage(test, (int) car.x + car.w - 600, (int) car.y, -car.w, car.h, null);
            g2d.drawImage(test, (int) car.x + car.w + 600, (int) car.y, -car.w, car.h, null);
        }
        g2d.setColor(Color.MAGENTA);
        g2d.drawRect((int) car.x,(int) car.y,car.w,car.h);
    }
    public void drawForest(Graphics2D g2d, Forest forest){
        int level = forest.level;
        Image test;

        if (level <= 3){
            test = level_0103_forest.get(forest.number);
        } else if (level <= 6) {
            test = level_0406_forest.get(forest.number);
        } else if (level <= 9) {
            test = level_0709_forest.get(forest.number);
        } else if (level <= 12) {
            test = level_1012_forest.get(forest.number);
        } else if (level <= 15) {
            test = level_1315_forest.get(forest.number);
        } else {
            test = level_1618_forest.get(forest.number);
        }

        int k = 0;
        while (true){
            g2d.drawImage(test, forest.x + k * forest.h, forest.y, forest.h, forest.h, null);
            k++;
            if (forest.x + forest.h * k > 800){
                break;
            }
        }
    }
    public void drawRiver(Graphics2D g2d, River river){
        int level = river.level;
        Image test;

        if (level <= 3){
            test = level_0103_river;
        } else if (level <= 6) {
            test = level_0406_river;
        } else if (level <= 9) {
            test = level_0709_river;
        } else if (level <= 12) {
            test = level_1012_river;
        } else if (level <= 15) {
            test = level_1315_river;
        } else {
            test = level_1618_river;
        }
        int k = 0;
        while (true){
            g2d.drawImage(test, river.x + k  * river.h, river.y, river.w, river.h, null);
            k++;
            if (river.x + river.h * k > 800){
                break;
            }
        }
        for (int i = 0; i < river.bridges.size(); i++){
            drawBridge(g2d, river.bridges.get(i));
        }
    }
    public void drawBridge(Graphics2D g2d, Bridge bridge){
        int level = bridge.level;
        Image test;

        if (level <= 3){
            test = level_0103_bridge;
        } else if (level <= 6) {
            test = level_0406_bridge;
        } else if (level <= 9) {
            test = level_0709_bridge;
        } else if (level <= 12) {
            test = level_1012_bridge;
        } else if (level <= 15) {
            test = level_1315_bridge;
        } else {
            test = level_1618_bridge;
        }

        g2d.drawImage(test, bridge.x, bridge.y, bridge.w, bridge.h, null);
    }
    public void drawWaterLilyRiver(Graphics2D g2d, WaterLilyRiver waterLilyRiver){
        int level = waterLilyRiver.level;
        Image test;

        if (level <= 3){
            test = level_0103_river;
        } else if (level <= 6) {
            test = level_0406_river;
        } else if (level <= 9) {
            test = level_0709_river;
        } else if (level <= 12) {
            test = level_1012_river;
        } else if (level <= 15) {
            test = level_1315_river;
        } else {
            test = level_1618_river;
        }
        int k = 0;
        while (true){
            g2d.drawImage(test, waterLilyRiver.x + k  * waterLilyRiver.w, waterLilyRiver.y, waterLilyRiver.w, waterLilyRiver.h, null);
            k++;
            if (waterLilyRiver.x + waterLilyRiver.h * k > 800){
                break;
            }
        }
        for (int i = 0; i < waterLilyRiver.waterLilies.size(); i++){
            drawWaterLily(g2d, waterLilyRiver.waterLilies.get(i));
        }
        g2d.drawString("lily", (int) waterLilyRiver.x + 5, (int) waterLilyRiver.y);

    }
    public void drawWaterLily(Graphics2D g2d, WaterLily waterLily) {
        int level = waterLily.level;
        Image test;

        if (level <= 3) {
            test = level_0103_lily;
        } else if (level <= 6) {
            test = level_0406_lily;
        } else if (level <= 9) {
            test = level_0709_lily;
        } else if (level <= 12) {
            test = level_1012_lily;
        } else if (level <= 15) {
            test = level_1315_lily;
        } else {
            test = level_1618_lily;
        }
        g2d.drawImage(test, (int) waterLily.x, (int) waterLily.y, waterLily.w, waterLily.h, null);

    }
    public void drawWorld(Graphics2D g2d, int level, WorldPanel w){
        Image test_up;
        Image test_down;
        if (level <= 3){
            test_up = level_0103_background_up;
            test_down = level_0103_background_down;
        } else if (level <= 6) {
            test_up = level_0406_background_up;
            test_down = level_0406_background_down;
        } else if (level <= 9) {
            test_up = level_0709_background_up;
            test_down = level_0709_background_down;
        } else if (level <= 12) {
            test_up = level_1012_background_up;
            test_down = level_1012_background_down;
        } else if (level <= 15) {
            test_up = level_1315_background_up;
            test_down = level_1315_background_down;
        } else {
            test_up = level_1618_background_up;
            test_down = level_1618_background_down;
        }

        g2d.drawImage(test_up, 0,20,600,w.otstup - 20,null);
        int t = w.roads.size() + w.forests.size() + w.rivers.size();
        g2d.drawImage(test_down, 0,w.otstup + t * 30, 600,100,null);
    }
}
