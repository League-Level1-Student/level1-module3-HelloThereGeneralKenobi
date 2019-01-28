import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Location location = new Location(5,5);
		Bug bug = new Bug();
		world.add(location, bug);
		Random randgen = new Random();
		
		int x = randgen.nextInt(9) + 1;
		int y = randgen.nextInt(9) + 1;
		Location location1 = new Location(x,y);
		Bug bug1 = new Bug();
		world.add(location1, bug1);
		
		bug1.setColor(Color.BLUE);
		bug1.setDirection(90);
		
		Flower flower = new Flower();
		Flower flower1 = new Flower();
		Location location2 = new Location(x,y + 1);
		Location location3 = new Location(x,y - 1);
		world.add(location2, flower);
		world.add(location3, flower1);
	}
}
