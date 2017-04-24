package ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import bbdd.manager.ManagerAlbergues;
import beans.Albergue;
import processes.ReaderManager;

public class GuardarCambiosListener implements ActionListener{

	Albergue albergue;
	public GuardarCambiosListener(Albergue aux) {
		// TODO Auto-generated constructor stub
		albergue=aux;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ManagerAlbergues ma=new ManagerAlbergues();
		try {
			ma.update(albergue);
			//Llamada a una ventana de confirmacion de cambios
			//LLamada a MAinPanel
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			//Llamada a un mensaje de error
			//Volver a MainPanel
		}
		
	}

}
