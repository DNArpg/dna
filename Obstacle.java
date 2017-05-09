import java.awt.Color;
import java.awt.Graphics;

public class Obstacle extends Object{

	public Obstacle(int x, int y, ID id) {
		super(x, y, id);
		velX = -2;
	}

	public void tick() {
		x += velX;
		y += velY;
	}

	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 25, 25);
	}

}
