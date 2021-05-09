import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class InventarPanel {
    public boolean isOn = false;
    public ClickObject character_01 = new ClickObject(50,50,30,30,ImageIO.read(new File("data//Character//Character (1).png")));
    public ClickObject character_02 = new ClickObject(100,50,30,30,ImageIO.read(new File("data//Character//Character (2).png")));
    public ClickObject character_03 = new ClickObject(150,50,30,30,ImageIO.read(new File("data//Character//Character (3).png")));
    public ClickObject exit = new ClickObject(50,100,30,30,ImageIO.read(new File("data//Exit.jpg")));

    public InventarPanel() throws IOException {
    }
    public String checkClick(MouseEvent e){
        if (character_01.checkClick(e)) return "01";
        else if (character_02.checkClick(e)) return "02";
        else if (character_03.checkClick(e)) return "03";
        else if (exit.checkClick(e)) return "exit";
        else return "";
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(0,0,600,200);
        character_01.draw(g2d);
        character_02.draw(g2d);
        character_03.draw(g2d);
        exit.draw(g2d);
    }
}
