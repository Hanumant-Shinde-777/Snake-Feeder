import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePlay extends JPanel{

	private ImageIcon titleImage;
	public GamePlay() {
		
	}
	public void paint(Graphics g) {
		titleImage = new ImageIcon("title.png");
		titleImage.paintIcon(this, g, 25,5);
		
		g.setColor(Color.DARK_GRAY);
		g.drawRect(24, 74, 851, 577);
		g.setColor(Color.black);
		g.fillRect(25, 75, 850, 575);
		g.dispose();
	}
	
	

}
