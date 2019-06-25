package java_final_project;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
public class ComputerButton extends GameButton implements ActionListener{
	public ComputerButton(ChessBorad p){
		super("computer",p);
		setLocation(910, 250);
	}
	public void actionPerformed(ActionEvent e){
		parent.computerClick();
	}
}
