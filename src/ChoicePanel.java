import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class ChoicePanel {
    public ClickObject back_to_menu = new ClickObject(20,35,250,150, ImageIO.read(ChoicePanel.class.getResourceAsStream("Menu.png")));
    public ClickObject go_to_game = new ClickObject(330,35,250,150, ImageIO.read(ChoicePanel.class.getResourceAsStream("Start.png")));
    public ClickObject choice_01 = new ClickObject(50,200,500,100,ImageIO.read(ChoicePanel.class.getResourceAsStream("Level_01-03/Start_Image.png")));
    public ClickObject choice_04 = new ClickObject(50,350,500,100,ImageIO.read(ChoicePanel.class.getResourceAsStream("Level_04-06/Start_Image.png")));
    public ClickObject choice_07 = new ClickObject(50,500,500,100,ImageIO.read(ChoicePanel.class.getResourceAsStream("Level_07-09/Start_Image.png")));
    public ClickObject choice_10 = new ClickObject(50,650,500,100,ImageIO.read(ChoicePanel.class.getResourceAsStream("Level_10-12/Start_Image.png")));
    public ClickObject choice_13 = new ClickObject(50,800,500,100,ImageIO.read(ChoicePanel.class.getResourceAsStream("Level_13-15/Start_Image.png")));

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

        back_to_menu.draw(g2d);
        go_to_game.draw(g2d);

        choice_01.draw(g2d);
        choice_04.draw(g2d);
        choice_07.draw(g2d);
        choice_10.draw(g2d);
        choice_13.draw(g2d);
    }
}
