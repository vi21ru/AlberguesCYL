package ui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoguinGUI extends JFrame{
	
	public void initComponents(){
		JPanel panelTitle=new JPanel();
		FlowLayout fLayout=new FlowLayout();
		panelTitle.setLayout(fLayout);
		JLabel lbTitle=new JLabel("Introduce tus credenciales");
		panelTitle.add(lbTitle);
		
		JPanel panelLogin=new JPanel();
		GridLayout gLayout=new GridLayout(2, 2);
		panelLogin.setLayout(gLayout);
		
		
		JLabel lUser=new JLabel("Usuario");
		panelLogin.add(lUser,0);
		JLabel lPass=new JLabel("Password");
		panelLogin.add(lPass,1);
		JTextField tfUser=new JTextField();
		panelLogin.add(tfUser,2);
		JPasswordField pfPass=new JPasswordField();
		panelLogin.add(pfPass,3);
	}
	
	public static void main(String[] args) {
		
	}

}
