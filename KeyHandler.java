import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

public class KeyHandler extends KeyAdapter{
	
	private Handler handler;
	private int a = 0;
	
	public KeyHandler(Handler handler){
		this.handler = handler;
	}
	
	public boolean upPressed(int e){
		if (e == KeyEvent.VK_W){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	public void keyPressed(KeyEvent e){
		int key = (e.getKeyCode());
		boolean enteredLoop = false;
		for (int i = 0; i < handler.objects.size(); i++) {
			Object temp = handler.objects.get(i);
			if (temp.getID() == ID.Player) {
				
				if (upPressed(key)) {
					enteredLoop = true;
					System.out.println(enteredLoop);
					
				}
				while (enteredLoop){
					temp.setVelY((int)(-1 + 2*a));
					a += 1;
					if(temp.getY() == 250){
						enteredLoop = false;
					}
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
					long duration = System.nanoTime();
					//temp.setVelX((int)(2*(0.5*duration/1000000000)));
					temp.setVelY(2);
				}
			}
		}
		

	}*/
}
