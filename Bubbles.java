import java.awt.Color;
import java.awt.Graphics;
 
 
public class Bubbles{
     
     int x;
	 int y;
	 
	
	 Color blue;
	 
	 public Bubbles(){
		 x= (int)(Math.random()*799); 
		 y= (int)(Math.random()*596); 
		 blue = new Color (70,130,180);
	 }
	 
	 public void drawMe(Graphics g){
        
        g.setColor(blue);
        g.drawOval(x,y,5,5);
        
        
	 }
	 
	 public void move(){
		 y++;
		 
		 if(y > 600){
			 y = -5;
			 x = (int)(Math.random()*799);
		 }
		 
	 }
     
}










