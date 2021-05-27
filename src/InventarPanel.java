import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class InventarPanel {
    public boolean isOn = false;
    public ClickObject character_01 = new ClickObject(50,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(1).png")));
    public ClickObject character_02 = new ClickObject(100,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(2).png")));
    public ClickObject character_03 = new ClickObject(150,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(3).png")));
    public ClickObject character_04 = new ClickObject(200,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(4).png")));
    public ClickObject character_05 = new ClickObject(250,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(5).png")));
    public ClickObject character_06 = new ClickObject(300,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(6).png")));
    public ClickObject character_07 = new ClickObject(350,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(7).png")));
    public ClickObject character_08 = new ClickObject(400,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(8).png")));
    public ClickObject character_09 = new ClickObject(450,50,30,30,ImageIO.read(InventarPanel.class.getResourceAsStream("Character/Character(9).png")));
    public ClickObject exit = new ClickObject(150,100,250,130,ImageIO.read(InventarPanel.class.getResourceAsStream("Menu.png")));

    public InventarPanel() throws IOException {
    }
    public String checkClick(MouseEvent e){
        if (character_01.checkClick(e)) return "01";
        else if (character_02.checkClick(e)) return "02";
        else if (character_03.checkClick(e)) return "03";
        else if (character_04.checkClick(e)) return "04";
        else if (character_05.checkClick(e)) return "05";
        else if (character_06.checkClick(e)) return "06";
        else if (character_07.checkClick(e)) return "07";
        else if (character_08.checkClick(e)) return "08";
        else if (character_09.checkClick(e)) return "09";
        else if (exit.checkClick(e)) return "exit";
        else return "";
    }
    public void draw(Graphics2D g2d, int level){
        g2d.setColor(new Color( 100,200,200));
        g2d.fillRect(0,0,600,250);
        character_01.draw(g2d);
        character_02.draw(g2d);
        character_03.draw(g2d);
        character_04.draw(g2d);
        character_05.draw(g2d);
        character_06.draw(g2d);
        character_07.draw(g2d);
        character_08.draw(g2d);
        character_09.draw(g2d);
        exit.draw(g2d);
        g2d.setColor(Color.YELLOW);
        g2d.drawString("Your level: " + level, 20, 150);
    }
}
