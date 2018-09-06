package FacInfoSys.Views;

import javax.swing.SwingUtilities;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				
				new MainGui();
				
			}
			
			
		});
		

	}

}
