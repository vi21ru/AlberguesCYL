package ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.InsertarAlbergueGUI;

public class InsertarAlbergueListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new InsertarAlbergueGUI();
	}

}
