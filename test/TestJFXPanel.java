

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
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(final Stage stage) 
	{
		JFrame frame = new JFrame();
		// Create the WebView
		WebView webView = new WebView();
		
		// Create the WebEngine
		final WebEngine webEngine = webView.getEngine();

		// LOad the Start-Page
		webEngine.load("http://www.marca.com");
		
		JFXPanel panel=new JFXPanel();
		
		panel.setScene(new Scene(webView));
		frame.add(panel);
		frame.setSize(800, 1400);
		frame.setVisible(true);
	}
}
