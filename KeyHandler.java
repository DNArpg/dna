import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

public class KeyHandler extends KeyAdapter{
	
	private Handler handler;
	
	public KeyHandler(Handler handler){
		this.handler = handler;
	}
	
	
	
	
	public void keyPressed(KeyEvent e){
		int key = (e.getKeyCode());

		for (int i = 0; i < handler.objects.size(); i++) {
			Object temp = handler.objects.get(i);
			if (temp.getID() == ID.Player) {
				
				if (key == KeyEvent.VK_W) {
					temp.setVelY(-3);
				}
			}
		
		}

	}
	
	
	/*public void keyReleased(KeyEvent e){
		int key = (e.getKeyCode());
		for (int i = 0; i < handler.objects.size(); i++){
			System.out.println("Enter objects loop");
			Object temp = handler.objects.get(i);
			if (temp.getID() == ID.Player){
				if(key == KeyEvent.VK_W){
					temp.setVelY(1);
				}
			}
		}
		

	}*/
}
