public class Athlete {

     static int nextBibNumber = 1;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

Athlete (String name, int speed){
     this.name = name;
     this.speed = speed;
     this.bibNumber = nextBibNumber;
     nextBibNumber++;
}

public static void main(String[] args) {
     
	Athlete Jim = new Athlete("Jim", 10);
	Athlete Joe = new Athlete("Joe", 10);
	System.out.println(Jim);
	System.out.println(Joe);
	//create two athletes      //print their names, bibNumbers, and the location of their race. }
}

public String toString() {
	String info = name + " has bib number " + bibNumber + " will race at " + raceLocation + " at " + raceStartTime;
	return info;
}

}