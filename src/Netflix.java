import javax.swing.JOptionPane;

public class Netflix {
	
	
	public static void main(String[] args) {
		
		Movie Shrek = new Movie("Shrek", 5);
		Movie Shrek2 = new Movie("Shrek 2", 4);
		Movie ShrekTheThird = new Movie("Shrek The Third ", 2);
		Movie ShrekForeverAfter = new Movie("Shrek Forever After", 3);
		Movie Twilight = new Movie("Twilight", 2);
		
		JOptionPane.showMessageDialog(null,Shrek.getTicketPrice());
		JOptionPane.showMessageDialog(null,Shrek2.getTicketPrice());
		JOptionPane.showMessageDialog(null,ShrekTheThird.getTicketPrice());
		JOptionPane.showMessageDialog(null,ShrekForeverAfter.getTicketPrice());
		JOptionPane.showMessageDialog(null,Twilight.getTicketPrice());
		
		NetflixQueue NetflixQueue = new NetflixQueue();
		
		NetflixQueue.addMovie(Twilight);
		NetflixQueue.addMovie(Shrek);
		NetflixQueue.addMovie(Shrek2);
		NetflixQueue.addMovie(ShrekTheThird);
		NetflixQueue.addMovie(ShrekForeverAfter);
		
		NetflixQueue.printMovies();
		
		JOptionPane.showMessageDialog(null, NetflixQueue.getBestMovie());
		JOptionPane.showMessageDialog(null, NetflixQueue.getMovie(2));
	}
}
