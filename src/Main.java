import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Frame frame = new Frame();
        while (true){
            frame.repaint();
            frame.updateState();
            Thread.sleep(20);
        }
    }
}
