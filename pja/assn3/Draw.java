//author Peter Adamson

package pja.assn3;

import java.util.ArrayList;
import java.util.Arrays;

//simulates the lottery draw
public class Draw 
{
	private ArrayList<Ticket> entries = new ArrayList<Ticket>();
	private int[] winningNums = new int[5];
	
	//Add tickets to the draw
	public void add(Ticket t)
	{
		entries.add(t);
	}
	
	//Run the draw once all tickets have been added
	public void runDraw()
	{
		winningNums = NumberGenerator.gen();
		System.out.print("Winning Numbers: ");
		System.out.println(Arrays.toString(winningNums));
		for(int i = 0; i < entries.size(); i++)
		{
			Ticket temp = entries.get(i);
			int numOfMatches = temp.check(winningNums);
			if(numOfMatches > 0)
			{
				System.out.format("Ticket #%d: %d match(es) - ",temp.getTicketNumber(),numOfMatches);
				System.out.println(Arrays.toString(temp.getNums()));
			}
		}
	}
}
