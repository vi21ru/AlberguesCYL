package ui;

import javax.swing.JFrame;

import beans.Albergue;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class TestJFXPanel extends Application
{
//	Albergue a;
	JFrame frame;
//	
	
	public void launch() {
		Application.launch(null);
	}
	
	@Override
	public void start(final Stage stage) 
	{
		// Create the WebView
		WebView webView = new WebView();
		System.out.println("hola");
		// Create the WebEngine
		final WebEngine webEngine = webView.getEngine();
		
		// LOad the Start-Page
		webEngine.load("http://www.marca.com");
		
		JFXPanel panel=new JFXPanel();
		
		panel.setScene(new Scene(webView));
		
		this.frame=new JFrame();
		this.frame.setSize(400, 600);
		this.frame.setTitle("WEB");
		this.frame.add(panel);
		this.frame.setVisible(true);
		System.out.println("hola2");
		//frame.setSize(400, 600);
	}
}
