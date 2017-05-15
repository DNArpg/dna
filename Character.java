import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.Timer;

public class Character extends Object{
	private String name;
	private int money;
	private int stamina;
	private int maxHeight = 200;
	
//	private float gravity = 0.025f;
	
	public Character(int x, int y, ID id){
		super(x, y, id);
		/*falling = false;
		jumping = false;*/
	}
	
	public void tick(LinkedList<Object> objects) {
		y += velY;
		System.out.println(y);
		if(y == maxHeight){
			velY = 2;	
			System.out.println("Reached maxHeight");
		}
		if (y >= 250){
			y = 250;
			velY = 0;
			landed = true;
		}
		if (y <= 0){
			y = 0;
			velY = 2;
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
