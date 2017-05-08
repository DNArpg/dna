
public class Character {
	private String name;
	private int money;
	private int stamina;
	
	private Character(String name){
		this.name = name;
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
