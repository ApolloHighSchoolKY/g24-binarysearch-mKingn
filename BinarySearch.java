import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		int bottom=0;
		int top=ray.length-1;
		int middle=0;


		while(ray[middle] < item){
		
		middle=(top+bottom)/2;
			
		bottom=middle+1;
			
		}
		return ray[middle];
	}
}
