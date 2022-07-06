import java.awt.Color;
import java.awt.Graphics;
 
 
public class Background{
     
   int x;
	 int y;
	 
	 int x2;
	 int y2;
	 Color white;
	 Color black;
	 
	 public Background(){
		 x= (int)(Math.random()*799); 
		 y= (int)(Math.random()*596); // 	generating random numbers in between the specified range
		 white= new Color(255,255,255);
		 black = new Color (0,0,0);
	 }
	 
	 public void drawMe(Graphics g){
	 	// adding clouds in the background
		g.setColor(white);
        g.fillOval(x,y,25,12);
        g.fillOval(x+3,y-2,18,15);
        
        g.setColor(black);
        g.fillOval(x2,y2,2,2);
        
        
	 }
	 
	 public void move(){
		 y++;
		 
		 if(y > 600){
			 y = -5;
			 x = (int)(Math.random()*799);
		 }
		 
		 y2++;
		 
		 if(y2 > 600){
			 y2 = -5;
			 x2 = (int)(Math.random()*799);
		 }
	 }
     
}










