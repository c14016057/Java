package java_final_project;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
public class Cannon extends Chess implements ActionListener{
	public Cannon(ChessBorad p,Color co,int x,int y){
		color=co;
		parent=p;
		X=x;
		Y=y;
		staticX=x;
		staticY=y;
		power=6;
		addActionListener(this);
		setLocation(x+10, y+10);
	}
	protected void paintComponent(Graphics g) {
		
        g.setColor(Color.ORANGE);
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        g.setColor(color);
        Font f=new Font("標楷體",Font.BOLD,70);
        g.setFont(f);
        if(color==Color.BLACK) g.drawString("包", 5, 60);
        else g.drawString("炮", 5, 60);
        super.paintComponent(g);
}
	protected void paintBorder(Graphics g) {
        g.setColor(color);
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }
	public void actionPerformed(ActionEvent e){
		System.out.printf("Cannon %d %d be pushed\n",X,Y);
		parent.getSignal(this,X,Y,color);
		
	}
	public boolean leagleMove(int x,int y){
		if(x==X||y==Y) return parent.leagleMove(this, x, y);
		return false;
	}
	private ChessBorad parent;
	
}
