package Maze;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	private int tileX, tileY;
	private Image player;

	public Player() {
		ImageIcon img = new ImageIcon("C:/test/smilie.png");
		player = img.getImage();

		tileX = 1;// bcoz first block (0,0)is wall
		tileY = 1;

	}

	public Image getPlayer() {
		return player;
	}

	public int getTileX() {
		return tileX;// current position of player
	}

	public int getTileY() {
		return tileY;
	}

	public void move(int dx, int dy)// +ve x move up||-ve x down
	{
		tileX += dx;
		tileY += dy;
	}
}
