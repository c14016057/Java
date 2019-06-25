package java_final_project;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
public class RestartButton extends GameButton implements ActionListener{
	public RestartButton(ChessBorad p){
		super("restart",p);
		setLocation(910, 10);
	}
	public void actionPerformed(ActionEvent e){
		parent.restartClick();
	}
}
