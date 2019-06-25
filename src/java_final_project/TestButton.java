package java_final_project;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
public class TestButton extends GameButton implements ActionListener{
	public TestButton(ChessBorad p){
		super("test",p);
		setLocation(910, 130);
	}
	public void actionPerformed(ActionEvent e){
		parent.testClick();
	}
}
