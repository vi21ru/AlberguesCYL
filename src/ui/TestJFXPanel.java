package ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import beans.Albergue;
import javafx.application.Application;
import javafx.application.Platform;
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
	static Albergue albergue;
	
	public void launch(Albergue a) {
		System.out.println("TextJFXPanel.constructor: "+a.toString());
		this.albergue=a;
		Application.launch(null);
		
	}
	
	@Override
	public void start(final Stage stage) 
	{
		System.out.println("TestJFXPanel.start: "+albergue.toString());
		// Create the WebView
		WebView webView = new WebView();
		// Create the WebEngine
		final WebEngine webEngine = webView.getEngine();
		System.out.println(albergue.getWeb());
		String dir=albergue.getWeb();
		// LOad the Start-Page
		webEngine.load("http://"+dir);
		
		JFXPanel panel=new JFXPanel();
		
		panel.setScene(new Scene(webView));
		
		this.frame=new JFrame();
		this.frame.setSize(400, 600);
		this.frame.setTitle("WEB");
		this.frame.add(panel);
		this.frame.setVisible(true);
		System.out.println("hola2");
	
		Platform.setImplicitExit(false);
		//frame.setSize(400, 600);
	}
	
}
