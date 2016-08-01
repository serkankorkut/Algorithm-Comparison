
public class BinarySearch
{
	public static int binarySearch(int[] arr, int value, int left,int right)
	{
		
		   int mid ;
		    while(left<=right)
		    {
		        mid= (int) (Math.floor((right-left)/2)+left);
		        if(arr[mid] == value)
		        {
		            return mid;
		        }
		        if(value < arr[mid])
		        {
		            right=mid - 1;

		        }
		        else
		        {
		            left = mid + 1;
		        }
		    }
		    		return mid;
	}

}

