import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	public LinkedList <Object> objects = new LinkedList<Object>();
	
	public void tick(){
		for(int i = 0; i < objects.size(); i++){
			Object temp = objects.get(i);
			temp.tick();
		}
	}
	
	public void render(Graphics g){
		for(int i = 0; i < objects.size(); i++){
			Object temp = objects.get(i);
			temp.render(g);
		}
	}
	
	public void addObject(Object object){
		objects.add(object);
	}
	
	public void removeObject(Object object){
		objects.remove(object);
	}
}
