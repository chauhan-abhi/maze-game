package Maze;
import java.io.*;//for importing images
import java.util.*;

import javax.swing.ImageIcon;
import java.awt.*;

public class Map {

	private Scanner m;
	public String Map[] = new String[14];
	public Image grass, finish, wall;

	public Map() {
		ImageIcon img = new ImageIcon("E:/my stuffs/my maze/maze-game-project-master/grass.png");
		grass = img.getImage();
		img = new ImageIcon("E:/my stuffs/my maze/maze-game-project-master/wall.png");
		wall = img.getImage();
		img = new ImageIcon("E:/my stuffs/my maze/maze-game-project-master/finish.png");
		finish = img.getImage();

		openFile();// calling methods
		readFile();
		closeFile();
	}

	public Image getGrass() {
		return grass;
	}

	public Image getWall() {
		return wall;
	}

	public Image getFinish() {
		return finish;
	}

	public String getMap(int x, int y) {
		String index = Map[y].substring(x, x + 1);
		return index;

	}

	public void openFile() {
		try {
			m = new Scanner(new File("E:/my stuffs/my maze/maze-game-project-master/Map.txt"));
		} catch (Exception e) {
			System.out.println("error loading map");
		}
	}

	public void readFile() {
		while (m.hasNext()) {
			for (int i = 0; i < 14; i++) {
				Map[i] = m.next();
			}
		}
	}

	public void closeFile() {
		m.close();
	}
}