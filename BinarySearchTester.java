import java.util.Arrays;

public class BinarySearchTester
{
   public static void main( String args[] )
   {
		int[] array = {39,6,11,23,18,3,20,5,57,15,8};
		Arrays.sort(array);
		System.out.println("before calling binarySearch");
		System.out.println(Arrays.toString(array));

		System.out.println("looking for 8 :: "+	BinarySearch.binarySearch(array,8));
		//System.out.println("looking for 39 :: "+	BinarySearch.binarySearch(array,39));
		//always returns 1 lower 
		//System.out.println("looking for 15 :: "+	BinarySearch.binarySearch(array,15));
		//15 works
		//System.out.println("looking for 5 :: "+	BinarySearch.binarySearch(array,5));
		//5 works
		//System.out.println("looking for 10 :: "+ BinarySearch.binarySearch(array,10));
	}
}
