//author Peter Adamson

package pja.assn3;

public class Lottery 
{

	/*drives the lottery class.  Simulates a lottery where a variety of tickets are created and added to a draw.
	 * The draw is then run and the winning numbers along with winning tickets are reported.
	 * Any winning tickets are reported with their numbers along with the number of matches to the winning numbers
	 * If a ticket is created with no arguments the numbers are randomly generated
	 * Otherwise, a ticket can be created by explicitly providing 5 integers or an array of 5 integers.
	 * If more or less than 5 numbers are provided in an array, the system will notify that an incorrect number of numbers has been specified, then exit
	 * If duplicate numbers are specified on ticket creating, the system will notify that invalid numbers have been specified, then exit*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//ticket creation
		Ticket test = new Ticket();
		Ticket test2 = new Ticket();
		Ticket test3 = new Ticket();
		Ticket test4 = new Ticket();
		Ticket test5 = new Ticket();
		Ticket test6 = new Ticket();
		Ticket test7 = new Ticket();
		Ticket test8 = new Ticket();
		Ticket test9 = new Ticket();
		Ticket test10 = new Ticket();
		
		//draw creation
		Draw draw = new Draw();
		
		//add tickets to the draw
		draw.add(test);
		draw.add(test2);
		draw.add(test3);
		draw.add(test4);
		draw.add(test5);
		draw.add(test6);
		draw.add(test7);
		draw.add(test8);
		draw.add(test9);
		draw.add(test10);
		
		//run the draw
		draw.runDraw();
	}

}
