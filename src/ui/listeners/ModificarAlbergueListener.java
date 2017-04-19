package ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import processes.IReader;
import processes.ReaderManager;
import ui.ModificarAlbergueGUI;

public class ModificarAlbergueListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ReaderManager rm=new ReaderManager();
		
		
		//La idea seria mostrar un comboBox con un selector por id... o seleccionar desde DateTable...
		try {
			IReader reader=rm.getReader();
			reader.read();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		new ModificarAlbergueGUI();
	}

}
