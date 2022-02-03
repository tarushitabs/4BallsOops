import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int DIAMETER = 20;
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    public static final int frameDivisor=5;

    public static void main(String[] args) {
        PApplet.main("FourBalls");
    }
    Ball[]b;
    public void settings(){
        size(WIDTH,HEIGHT);
        }
        public void setup() {
            b = new Ball[4];
            for (int i = 0; i<4; i++) {
                b[i] = new Ball(i);
            }
        }

    public void draw() {
        //background(255);
        for (int i = 0; i < 4; i++) {
            b[i].draw();
            b[i].move();

        }
    }
    public class Ball{
        int x;
        int y;
        int velocity;
        int frame;
        Ball(int i){
            velocity=i+1;
            x=0;
            frame=velocity*HEIGHT;
            y=frame/frameDivisor;
        }
        public void draw(){
            ellipse(x,y,DIAMETER,DIAMETER);
        }
        public void move(){
            x+=velocity;
        }


    }


    }

