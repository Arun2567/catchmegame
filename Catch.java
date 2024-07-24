import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class Catch extends Frame implements MouseMotionListener{

    int ballx=200,bally=200,ballRadius=20;
    

   Catch(){
      addMouseMotionListener(this);

      setSize(400,400);
      setLayout(null);
      setTitle("Catch me");
      setVisible(true);
    
      setLayout(new FlowLayout());
      setVisible(true);
      setSize(100,100);
   }

   public void paint(Graphics g){
      super.paint(g);
      g.setColor(Color.CYAN);
      g.fillOval(ballx, bally, 2*ballRadius, 2*ballRadius);
   }

@Override
public void mouseDragged(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();

    if(x < ballx+ballRadius){
      ballx++;
    }

    
    if(x > ballx+ballRadius){
        ballx--;
      }

    
    if(y < bally+ballRadius){
        bally++;
    }
      
      
      
    if(y > bally+ballRadius){
        bally--;
      }

      repaint();
}

@Override
public void mouseMoved(MouseEvent e) {
 
}

public static void main(String[] args) {
    new Catch();
   }
    
}