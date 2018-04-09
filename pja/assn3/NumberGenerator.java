//author Peter Adamson

package pja.assn3;

//imports
import java.util.Random;
import java.util.ArrayList;

//random number generator
public class NumberGenerator 
{

	//generates 5 unique random numbers between 1 and 49 inclusively and returns those numbers
	public static int[] gen()
	{
		ArrayList<Integer> pool = new ArrayList<Integer>();
		for(int i = 1; i < 50; i++)
		{
			pool.add(i);
		}
		
		int[] result = new int[5];
		Random rando = new Random();
		for(int i = 0; i < result.length; i++)
		{
			int index = rando.nextInt(pool.size() - 1) + 1;
			result[i] = pool.get(index);
			pool.remove(index);
		}
		
		return result;
	}
}
