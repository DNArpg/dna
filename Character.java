import java.awt.Color;
import java.awt.Graphics;

public class Character extends Object{
	private String name;
	private int money;
	private int stamina;
	
	public Character(int x, int y, ID id){
		super(x, y, id);
	}
	
	public void tick() {
		y += velY;
		if (y >= 250){
			velY = 0;
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
