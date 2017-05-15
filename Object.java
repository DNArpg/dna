import java.awt.Graphics;
import java.util.LinkedList;

public abstract class Object {
	protected int x;
	protected int y;
	protected int velX;
	protected int velY;
	protected ID id;
//	protected boolean falling;
//	protected boolean jumping;
	protected boolean landed;

	
	public Object(int x, int y, ID id){
		this.x = x;
		this.y = y;
		this.id = id;
	}

/*	public boolean isFalling() {
		if(velY > 0){
			falling = true;
		}
		if(velY == 0){
			falling = false;
		}
		return falling;
	}

	public void setFalling(boolean falling) {
		this.falling = falling;
	}

	public boolean isJumping() {
		if(velY < 0){
			jumping = true;
		}
		if(velY == 0){
			jumping = false;
		}
		return jumping;
	}

	public void setJumping(boolean jumping) {
		this.jumping = jumping;
	}
	*/

	public void setLanded(boolean value){
		landed = value;
	}
	
	public boolean getLanded(){
		return landed;
	}

	public abstract void tick(LinkedList<Object> objects);
	public abstract void render(Graphics g);

	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setVelX(int velX){
		this.velX = velX;
	}
	
	public void setVelY(int velY){
		this.velY = velY;
	}
	
	public void setID(ID id){
		this.id = id;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getVelX(){
		return velX;
	}
	
	public int getVelY(){
		return velY;
	}
	
	public ID getID(){
		return id;
	}
}
