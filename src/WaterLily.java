public class WaterLily {
    public double x;
    public double y;
    public int w;
    public int h;
    public int number;
    public int level;
    public double speed;

    public WaterLily(double x, double y, double speed){
        this.x = x;
        this.y = y;
        this.w = 35;
        this.h = 30;
    }
    public void updateState(double speed0, int w0, long dt){
        if(x > w0){ x = x - w0; }
        if(x < 0){ x = x + w0; }
        this.x += speed0 * dt;
    }


}
