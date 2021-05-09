import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class MenuPanel extends JPanel {
    public Image startImage = ImageIO.read(new File("data//Start.jpg"));
    public Image choiceImage = ImageIO.read(new File("data//Choice.jpg"));

    public MenuPanel() throws IOException {

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
        g2d.drawImage(startImage, 200, 400,100,100, null);
        g2d.drawImage(choiceImage, 400, 400,100,100, null);
    }
}
