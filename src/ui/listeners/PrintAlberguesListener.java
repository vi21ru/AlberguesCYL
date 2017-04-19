package ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import processes.PrintAlberguesProcess;

public class PrintAlberguesListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		PrintAlberguesProcess pap=new PrintAlberguesProcess();
		//llamada a imprimir en pdf...
		//pap.print();
	}

}
