import java.awt.*;
import java.awt.event.MouseEvent;

public class ClickObject {
    public int x;
    public int y;
    public int w;
    public int h;
    public Image image;
    public ClickObject(int x, int y, int w, int h, Image image){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.image = image;
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(image, x,y,w,h,null);
    }
    public boolean checkClick(MouseEvent e){
        if ((x < e.getX())&&(x + w > e.getX())&&(y < e.getY())&&(y + h > e.getY())){
            return true;
        } else {
            return false;
        }
    }

}
