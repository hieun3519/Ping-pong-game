import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{

    int id; // 1 or 2 for player
    int yVelocity; // how fast the paddle move
    int speed = 10;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }

    public void keyPressed(KeyEvent e){
        switch(id){
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(-speed); //move in y direction if w pressed
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(speed); //move in y direction if s pressed
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP){
                    setYDirection(-speed); //move in y direction if w pressed
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    setYDirection(speed); //move in y direction if s pressed
                    move();
                }   
                break;
            }
    }
    public void keyReleased(KeyEvent e){
        switch(id){
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(0); //move in y direction if w pressed
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(0); //move in y direction if s pressed
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP){
                    setYDirection(0); //move in y direction if w pressed
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    setYDirection(0); //move in y direction if s pressed
                    move();
                }   
                break;
        }
    }
    
    public void setYDirection(int yDirection){
        yVelocity = yDirection;
    }
    public void move() {
        y= y + yVelocity;
    }

    public void draw(Graphics g){
        if(id==1){
            g.setColor(Color.blue);
        }
        else {
            g.setColor(Color.red);
        }
        g.fillRect(x, y, width, height);
    }
}
