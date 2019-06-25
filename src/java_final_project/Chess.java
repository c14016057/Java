package java_final_project;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;


public class Chess extends JButton {
	public Chess(){
		/*Dimension size = getPreferredSize();
        size.width = 100;
        size.height = 100;
        setPreferredSize(size);*/
		/**/
		/*Mypanel jp=new Mypanel();
		setLayout(null);
		add(jp);*/
		//setText("123");
		setSize(80,80);
        //setLocation(0, 0);
        setBackground(Color.yellow);
        setContentAreaFilled(false);
	}

	/* protected void paintComponent(Graphics g) {
	
		        g.setColor(Color.ORANGE);
		        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
		        g.setColor(Color.red);
		        Font f=new Font("標楷體",Font.BOLD,70);
		        g.setFont(f);
		        g.drawString("將", 5, 60);
		        super.paintComponent(g);
	 }*/
	 protected void paintBorder(Graphics g) {
	        g.setColor(Color.black);
	        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
	    }
	 public boolean leagleMove(int x,int y){
			return true;
		}

	  Shape shape;
	 
     public boolean contains(int x, int y) {
	 
	        if ((shape == null) || (!shape.getBounds().equals(getBounds()))) {
	         
	            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
	        }
	      
	        return shape.contains(x, y);
	    }
     public void mysetLocation(int x,int y){
    	 setLocation(x+10,y+10);
    	 X=x;
    	 Y=y;
     }
     public void newXY(int x,int y){
    	 X=x;
    	 Y=y;
     }
     public void recover(){
    	 mysetLocation(staticX,staticY);
    	 setVisible(true);
    	 visible=true;
     }
     public void fixState(){
    	 tempX=X;
    	 tempY=Y;
    	 tempvisible=visible;
     }
     public void recoverState(){
    	 X=tempX;
    	 Y=tempY;
    	 visible=tempvisible;
     }
     public int get_X(){
    	 return X;
     }
     public int get_Y(){
    	 return Y;
     }
     public void myhide(){
    	 visible=false;
    	 setVisible(false);
     }
     public void setDown(Chess d){
    	 
     }
     public int power;
     protected int X;
 	 protected int Y;
 	 public Color color;
 	 protected int staticX;
 	 protected int staticY;
 	 protected int tempX;
 	 protected int tempY;
 	 protected boolean tempvisible;
 	 public boolean visible=true;

}
