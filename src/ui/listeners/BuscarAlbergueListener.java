package ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.BusquedaAlbergueGUI;

public class BuscarAlbergueListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new BusquedaAlbergueGUI();
	}

}
