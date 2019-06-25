package java_final_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class Nothing extends Chess implements ActionListener{
	 public Nothing(ChessBorad p,int x,int y){
		 parent=p;
		 X=x;
		 Y=y;
		 staticX=x;
		 staticY=y;
		 setLocation(x+10, y+10);
		 addActionListener(this);
		 color=Color.yellow;
	 }
	 protected void paintBorder(Graphics g) {
	       // g.setColor(Color.yellow);
	       // g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
	    }
	 public void actionPerformed(ActionEvent e){
		 System.out.printf("Nothing %d,%d be pushed\n",X,Y);
		 parent.getSignal(this,X,Y,Color.yellow);
			
		}
	 public void setDown(Chess d){
		 down=d;
	 }
	 public void newXY(int x,int y){
		 if(down!=null) down.newXY(x, y);
		 X=x;
    	 Y=y;
	 }
	 public void mysetLocation(int x,int y){
		 setLocation(x+10,y+10);
		 newXY(x,y);
	 }
	
	 private ChessBorad parent;
	 private Chess down;
}
