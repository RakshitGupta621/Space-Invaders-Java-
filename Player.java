import java.awt.Color;
import java.awt.Graphics;
 
public class Player{
	int x;
	int y;
	int width;
	int height;
	
	Color blue;
	Color tan;
	Color brown;
	Color green;
	Color black;
	Color red;
	Color pink;
	Color darkblue;
	
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
		
		this.width = 60;
		this.height= 75;
		
		this.blue = new Color(0,0,255);
		this.tan = new Color(245,222,179);
		this.brown = new Color(160,82,45);
		this.green = new Color(107,142,35);
		this.black = new Color(0,0,0);
		this.red = new Color(255,69,0);
		this.pink = new Color(219,112,147);
		this.darkblue = new Color(72,61,139);
	
	}
 
 
 	public void drawMe(Graphics g){
 		
 		g.setColor(blue);
 		g.fillOval(x,y,width,height);
 		g.setColor(darkblue);
 		g.fillOval(x+5,y+4,width-10,height);
 		
 		g.setColor(blue);
 		g.fillOval(x-15,y+60,width+25,height-30);
 		g.setColor(red);
 		g.fillOval(x-3,y+70,width-53,height-62);
 		g.fillOval(x+17,y+73,width-53,height-62);
 		g.fillOval(x+37,y+73,width-53,height-62);
 		g.fillOval(x+57,y+70,width-53,height-62);
 		
 		g.setColor(red);
 		g.fillRect(x-10,y+50,width-50,height-60);
 		g.fillRect(x+57,y+50,width-50,height-60);
 			
 		g.setColor(green);
 		g.fillOval(x+11,y+20,width-20,height-35);
 		
 		g.setColor(blue);
 		g.fillOval(x+18,y+35,width-50,height-65);
 		g.fillOval(x+36,y+35,width-50,height-65);
 		
 		g.setColor(black);
 		g.fillOval(x+20,y+37,width-55,height-68);
 		g.fillOval(x+38,y+37,width-55,height-68);
 		
 		g.setColor(red);
 		g.fillOval(x+22,y+45,width-40,height-65);
 		g.setColor(green);
 		g.fillOval(x+21,y+42,width-38,height-65);
 		
 		
 		
 	}
 	
 	public void moveRight(){
 		x = x+15;
 	}
 	
 	public void moveLeft(){
 		x = x-15;
 	}
 	
 	public int getX(){
        return x;
    }
     
    public int getY(){
        return y;
    }
 
     
    public int getWidth(){
        return width;
    }
     
    public int getHeight(){
        return height;
    }
    
    public void levelCostume2(){
    	blue = new Color(255,255,153);
    	green = new Color(255,218,185);
    }
    
    public void levelCostume1(){
    	blue = new Color(0,0,255);
    	green = new Color(107,142,35);
    }
 	
}