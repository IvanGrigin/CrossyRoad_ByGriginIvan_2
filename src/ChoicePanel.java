import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class ChoicePanel {
    public Image choice_01_Image = ImageIO.read(new File("data//Choice_01.jpg"));
    public Image choice_02_Image = ImageIO.read(new File("data//Choice_02.jpg"));
    public Image choice_03_Image = ImageIO.read(new File("data//Choice_03.jpg"));
    public Image choice_04_Image = ImageIO.read(new File("data//Choice_04.jpg"));
    public Image choice_05_Image = ImageIO.read(new File("data//Choice_05.jpg"));

    public ChoicePanel() throws IOException {

    }

    public int checkClick(MouseEvent e, int numberOfStartLevel){
        if ((e.getX() > 100)&&(e.getX() < 600) && (e.getY() > 100)&&(e.getY() < 200)){
            numberOfStartLevel = 1;
        }
        if ((e.getX() > 100)&&(e.getX() < 600) && (e.getY() > 300)&&(e.getY() < 400)){
            numberOfStartLevel = 4;
        }
        if ((e.getX() > 100)&&(e.getX() < 600) && (e.getY() > 500)&&(e.getY() < 600)){
            numberOfStartLevel = 7;
        }
        if ((e.getX() > 100)&&(e.getX() < 600) && (e.getY() > 700)&&(e.getY() < 800)){
            numberOfStartLevel = 10;
        }
        if ((e.getX() > 100)&&(e.getX() < 600) && (e.getY() > 900)&&(e.getY() < 1000)){
            numberOfStartLevel = 13;
        }
        return numberOfStartLevel;
    }

    public void draw(Graphics2D g2d, Painter p){
        g2d.drawImage(choice_01_Image, 100, 100,400,100, null);
        g2d.drawImage(choice_02_Image, 100, 300,400,100, null);
        g2d.drawImage(choice_03_Image, 100, 500,400,100, null);
        g2d.drawImage(choice_04_Image, 100, 700,400,100, null);
        g2d.drawImage(choice_05_Image, 100, 900,400,100, null);
    }
}
