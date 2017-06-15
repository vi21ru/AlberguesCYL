package ui;

import beans.Albergue;

public class JFXPanelRunnable implements Runnable{

	Albergue albergue=new Albergue();
	public JFXPanelRunnable(Albergue a) {
		// TODO Auto-generated constructor stub
		albergue=a;
	}
	@Override
	public void run() {
		//System.out.println("Runnable: "+albergue.toString());
		// TODO Auto-generated method stub
		TestJFXPanel jfxPanel = new TestJFXPanel();
    	jfxPanel.launch(albergue);
	}

}
