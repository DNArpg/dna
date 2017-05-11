import java.awt.Color;
import java.awt.Graphics;

public class Character extends Object{
	private String name;
	private int money;
	private int stamina;
	
	private float gravity = 0.025f;
	
	public Character(int x, int y, ID id){
		super(x, y, id);
		falling = true;
		jumping = false;
	}
	
	public void tick() {
		y += velY;
		
		if(jumping || falling){
			velY += gravity;
		}
		if (y >= 250){
			y = 250;
		}
		if (y <= 0){
			y = 0;
		}
		
	}
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 40, 40);
		
	}
	
	public String getName(){
		return name;
	}
	public void adjustMoney(int value){
		money += value;
	}
	public int getMoney(){
		return money;
	}
	public void adjustStamina(int value){
		stamina += value;
	}
	public int getStamina(){
		return stamina;
	}
	

}
