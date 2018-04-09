//author Peter Adamson

package pja.assn3;

//creates a ticket
public class Ticket 
{

	int[] nums = new int[5];
	static int ticketCounter = 0;
	int ticketNumber;
	
	//constructor to randomly generate ticket numbers
	public Ticket()
	{
		nums = NumberGenerator.gen();
		ticketCounter++;
		ticketNumber = ticketCounter;
	}
	
	//constructor to create ticket based on numbers given
	public Ticket(int num1, int num2, int num3, int num4, int num5)
	{
		nums[0] = num1;
		nums[1] = num2;
		nums[2] = num3;
		nums[3] = num4;
		nums[4] = num5;
		
		//check to make sure no duplicates have been provided
		for(int i = 0; i < 4; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(nums[i] == nums[j])
				{
					System.out.println("invalid numbers chosen.  Exiting");
					System.exit(0);
				}
			}
		}
		ticketCounter++;
		ticketNumber = ticketCounter;
	}
	
	//constructor to create ticket based on array of numbers given
	public Ticket(int[] numbers)
	{
		//check to make sure the proper number of numbers have been given
		if(numbers.length != 5)
		{
			System.out.println("invalid number of numbers.  Exiting");
			System.exit(0);
		}
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = numbers[i];
		}
		
		//check to make sure no duplicates have been provided
		for(int i = 0; i < 4; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(nums[i] == nums[j])
				{
					System.out.println("invalid numbers chosen.  Exiting");
					System.exit(0);
				}
			}
		}
		ticketCounter++;
		ticketNumber = ticketCounter;
	}
	
	//returns the ticket numbers
	public int[] getNums()
	{
		return nums;
	}
	
	//returns the ticket number
	public int getTicketNumber()
	{
		return ticketNumber;
	}
	
	//checks the ticket against the winning numbers and returns the number of matches
	public int check(int[] winningNums)
	{
		int numOfMatches = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < winningNums.length; j++)
			{
				if(nums[i] == winningNums[j])
				{
					numOfMatches++;
				}
			}
		}
		return numOfMatches;
	}
}
