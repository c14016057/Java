package java_final_project;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow extends JFrame{
	public MainWindow(){
		setSize(1100,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBackground(Color.yellow);
		/*add panel*/
		ChessBorad chessborad=new ChessBorad();	
		add(chessborad);
		
		
		setVisible(true);
	}
	
}
