package ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import processes.IReader;
import processes.ReaderManager;
import ui.DataTableAlbergues;

public class ListarAlberguesListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ReaderManager rm=new ReaderManager();
		try {
			IReader reader=rm.getReader();
			List albergues=reader.read();
			
			//Crear gui donde envio la lista
			new DataTableAlbergues(albergues);
		} catch (Exception e) {
			// TODO Mostrar panel error
			e.printStackTrace();
			
		}
		
		
	}

}
