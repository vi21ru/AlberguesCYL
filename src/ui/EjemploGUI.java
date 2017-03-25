package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EjemploGUI {

	//Componentes usados
	JFrame window;
	JLabel label;
	JTextField field;
	JButton button;
	
	//Constructor llamamos al inicio de componentes
	public EjemploGUI(){
		initGUI();
		
	}
	
	public void initGUI(){
		createGUI();
		configGUI();
		addGUI();
		listenersGUI();
		//la ventana se muestra al llamar este método
		window.setVisible(true);
	}
	private void createGUI(){
		window=new JFrame("Albergues de Castilla y Leon");
		label=new JLabel("Etiqueta");
		field=new JTextField(10);
		button=new JButton("Botón de ejemplo");
	}
	
	private void configGUI(){
		//Cerrado por defecto
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
	}
	
	private void addGUI(){
		window.add(label);
		window.add(field);
		window.add(button);
		//Se reorgniza despues de añadir los componentes...
		window.pack();
	}
	
	private void listenersGUI(){
		//Ejemplo de como añadi un listener 
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				actionButton();
			}
		});	
	}
	private void actionButton(){
		JOptionPane.showMessageDialog(null, "Has clickado en el boton");
	}
	
	public void fillGap(String texto){
		field.setText(texto);
	}
	public static void main(String[] args){
		new EjemploGUI().fillGap("Hola!!");
	}
}
