package ui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainMenu extends JFrame{
	
	public void createMenu(){
		
		this.setSize(new Dimension(300,600));
		
		//Creamos Grid
		GridLayout grid=new GridLayout(4, 1);
		this.setLayout(grid);
		
		barraMenu();
		//JPanel
		JPanel panel=new JPanel();
		
		//Botones
		JButton boton=new JButton("Ver lista Albergues");
		this.add(boton, 0);
		this.setVisible(true);
	}

	public void barraMenu(){
		JMenuBar barraMenu=new JMenuBar();
		JMenuItem archivo=new JMenuItem("Archivo");
		JMenuItem ver=new JMenuItem("Ver");
		JMenuItem editar=new JMenuItem("Editar");
		barraMenu.add(archivo, 1);
		barraMenu.add(ver, 2);
		barraMenu.add(editar, 3);
		this.add(barraMenu);
		barraMenu.setVisible(true);
	}
}
