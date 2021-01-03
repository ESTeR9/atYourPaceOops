import processing.core.PApplet;

public class AtYourPace extends PApplet {
    public static final int windowWidth= 640;
    public static final int windowHeight=480;
    public static final Color myGrey=new Color(87,87,87);
    public static final Color color1=new Color(255,0,100);
    public static final Color color2=new Color(20,240,200);
    public static final Color color3=new Color(200,240,20);
    public static final Color color4=new Color(180,210,255);
    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;
    public static void main(String[] args) {
        PApplet.main("AtYourPace", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(windowWidth,windowHeight);
    }

    @Override
    public void setup(){
        background(myGrey.red,myGrey.green,myGrey.blue);
        b1=new Ball(0,windowHeight/5,10,1,color1);
        b2=new Ball(0,2*windowHeight/5,10,2,color2);
        b3=new Ball(0,3*windowHeight/5,10,3,color3);
        b4=new Ball(0,4*windowHeight/5,10,4,color4);
    }

    @Override
    public void draw(){
        drawBall(b1);
        drawBall(b2);
        drawBall(b3);
        drawBall(b4);
    }

    public void drawBall(Ball b){
        stroke(b.color.red,b.color.green,b.color.blue);
        fill(b.color.red,b.color.green,b.color.blue);
        ellipse(b.xPosition,b.yPosition,b.Dia,b.Dia);
        b.xPosition+=b.speed;
    }

}
