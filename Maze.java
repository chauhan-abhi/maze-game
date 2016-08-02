package Maze;

import javax.swing.*;
public class Maze {
	public static void main(String args[])
	{
		//object creation in event dispatching thread
		try{
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					new Maze();
				}
			});
			}catch(Exception e){
				System.out.println("error in main ");
			}
		
	}
	
	public Maze(){
		JFrame f= new JFrame();
		f.setTitle("Maze Game");
		f.add(new Board());
		f.setSize(435,460);
		f.setLocationRelativeTo(null);//to centerize
		f.setVisible(true);
	}
}