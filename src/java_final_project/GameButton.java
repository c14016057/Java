package java_final_project;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
public class GameButton extends JButton implements ActionListener{
	public GameButton(String title,ChessBorad p){
		super(title);
		parent=p;
		setSize(180,100);
		addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
	
	}
	protected ChessBorad parent;
}
