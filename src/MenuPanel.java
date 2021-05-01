import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class MenuPanel extends JPanel {
    public Image manImage = ImageIO.read(new File("data//Man.jpg"));
    public Image womanImage = ImageIO.read(new File("data//Woman.jpg"));
    public Image startImage = ImageIO.read(new File("data//Start.jpg"));
    public Image choiceImage = ImageIO.read(new File("data//Choice.jpg"));

    public MenuPanel() throws IOException {

    }

    public int checkClick(MouseEvent e, int numberOfCharacter){
        if ((e.getX() < 300)&&(e.getX() > 200) && (e.getY() < 300)&&(e.getY() > 200)){
            numberOfCharacter = 0;
        }
        if ((e.getX() < 500)&&(e.getX() > 400) && (e.getY() < 300)&&(e.getY() > 200)){
            numberOfCharacter = 1;
        }
        return numberOfCharacter;
    }
    public String checkClick(MouseEvent e, String whichIsOn){
        if ((e.getX() < 300)&&(e.getX() > 200) && (e.getY() < 500)&&(e.getY() > 400)){
            whichIsOn = "world";
        }
        if ((e.getX() < 500)&&(e.getX() > 400) && (e.getY() < 500)&&(e.getY() > 400)){
            whichIsOn = "choice";
        }
        return whichIsOn;
    }

    public void draw(Graphics2D g2d, Painter p){
        g2d.drawImage(manImage, 200, 200,100,100, null);
        g2d.drawImage(womanImage, 400, 200,100,100, null);
        g2d.drawImage(startImage, 200, 400,100,100, null);
        g2d.drawImage(choiceImage, 400, 400,100,100, null);
    }
}
