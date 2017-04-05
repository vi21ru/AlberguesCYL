package ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;

import bbdd.manager.ManagerAlbergues;
import beans.Albergue;
import ui.InsertarAlbergueGUI;

public class AddAlbergueListener implements ActionListener {

	InsertarAlbergueGUI guiInsertar;
	public AddAlbergueListener(InsertarAlbergueGUI jf) {
		// TODO Auto-generated constructor stub
		guiInsertar =jf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ManagerAlbergues ma=new ManagerAlbergues();
		try {
			Albergue a=crearAlbergue();
			System.out.println(a.toString());
			ma.insert(a);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private Albergue crearAlbergue(){
		Albergue a =new Albergue();
		
		a.setTipo(guiInsertar.getTfTipo().getText());
		a.setNombre(guiInsertar.getTfNombre().getText());
		//TODO 		Rellenar
		
		return a;
	}

}
