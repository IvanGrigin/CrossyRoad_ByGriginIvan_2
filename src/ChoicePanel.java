import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class ChoicePanel {

    public ClickObject choice_01 = new ClickObject(50,100,500,100,ImageIO.read(new File("data//Level_01-03//Start_Image.jpg")));
    public ClickObject choice_04 = new ClickObject(50,280,500,100,ImageIO.read(new File("data//Level_04-06//Start_Image.jpg")));
    public ClickObject choice_07 = new ClickObject(50,460,500,100,ImageIO.read(new File("data//Level_07-09//Start_Image.jpg")));
    public ClickObject choice_10 = new ClickObject(50,640,500,100,ImageIO.read(new File("data//Level_10-12//Start_Image.jpg")));
    public ClickObject choice_13 = new ClickObject(50,820,500,100,ImageIO.read(new File("data//Level_13-15//Start_Image.jpg")));

    public ChoicePanel() throws IOException {

    }

    public int checkClick(MouseEvent e, int numberOfStartLevel){
        if (choice_01.checkClick(e)){
            numberOfStartLevel = 1;
        }
        if (choice_04.checkClick(e)){
            numberOfStartLevel = 4;
        }
        if (choice_07.checkClick(e)){
            numberOfStartLevel = 7;
        }
        if (choice_10.checkClick(e)){
            numberOfStartLevel = 10;
        }
        if (choice_13.checkClick(e)){
            numberOfStartLevel = 13;
        }
        return numberOfStartLevel;
    }

    public void draw(Graphics2D g2d, Painter p){
        g2d.setColor(new Color(100,200,200));
        g2d.fillRect(0,0,600,1000);

        choice_01.draw(g2d);
        choice_04.draw(g2d);
        choice_07.draw(g2d);
        choice_10.draw(g2d);
        choice_13.draw(g2d);
    }
}
