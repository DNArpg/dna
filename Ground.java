import java.awt.Color;
import java.awt.Graphics;

public class Ground extends Object{

	public Ground(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	public void tick() {
		// TODO Auto-generated method stub
		
	}

	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 800, 310);
	}

}
