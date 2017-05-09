import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyHandler extends KeyAdapter{
	
	private Handler handler;
	
	public KeyHandler(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = (e.getKeyCode());
		System.out.println(e);

		for (int i = 0; i < handler.objects.size(); i++) {
			System.out.println("Enter objects loop");
			Object temp = handler.objects.get(i);
			if (temp.getID() == ID.Player) {
				if (key == KeyEvent.VK_W) {
					System.out.println("Register key W");
					long duration = System.nanoTime();
					// temp.setVelX((int)(2*(0.5*duration/1000000000)));
					temp.setVelY(-1);
				}
			}
		}

	}
	
	public void keyReleased(KeyEvent e){
		int key = (e.getKeyCode());
		for (int i = 0; i < handler.objects.size(); i++){
			System.out.println("Enter objects loop");
			Object temp = handler.objects.get(i);
			if (temp.getID() == ID.Player){
				if(key == KeyEvent.VK_W){
					System.out.println("Register key W");
					long duration = System.nanoTime();
					//temp.setVelX((int)(2*(0.5*duration/1000000000)));
					temp.setVelY(1);
				}
			}
		}
		

	}
}
