import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class MenuPanel extends JPanel {
    public Image menuImage = ImageIO.read(MenuPanel.class.getResourceAsStream("Menu_Image.jpg"));


    public MenuPanel() throws IOException {

    }

    public String checkClick(MouseEvent e, String whichIsOn){
        if ((e.getX() < 430)&&(e.getX() > 200) && (e.getY() < 340)&&(e.getY() > 200)){
            whichIsOn = "world";
        }
        if ((e.getX() < 440)&&(e.getX() > 200) && (e.getY() < 520)&&(e.getY() > 420)){
            whichIsOn = "choice";
        }
        return whichIsOn;
    }

    public void draw(Graphics2D g2d, Painter p){
        g2d.drawImage(menuImage, 0, 0,600,1000, null);

    }
}
