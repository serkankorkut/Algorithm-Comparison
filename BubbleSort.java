
public class BubbleSort
{
	public static int[] bubbleSort(int[] arr)
	{
		int swaps, swapTemp;
		for (int i = 1; i < arr.length; i++)
		{
			swaps = 0;
			for (int j = 0; j < arr.length - i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					swapTemp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swapTemp;
					swaps++;
				}

			}

			if (swaps == 0)
			{
				break;
			}

		}

		return arr;

	}

	

}

