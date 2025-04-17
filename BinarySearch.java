import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		int bottom=0;
		int top=ray.length-1;
		int middle=(top+bottom)/2;

		while(bottom <= top){ 

			if(ray[middle] == item)return middle;

			while(item>ray[middle]){
				bottom = middle + 1;
				middle=(top+bottom)/2;
			}

			while(item<ray[top]){
				top = middle - 1;
				middle=(top+bottom)/2;
			}
			
		}
		return middle;
	}
}
