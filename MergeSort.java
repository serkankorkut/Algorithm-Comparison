import java.util.LinkedList;

public class MergeSort
{

	public int[]  mergesort(int[] arr)
	{
		
		if (arr.length == 1)
			return arr;
		
		int[] tmp1 = new int[arr.length / 2];
		for(int i =0; i<tmp1.length; i++)
		{
			tmp1[i]=arr[i];
		}
		
		int[] tmp2 = new int[arr.length / 2];
		int j =0;
		for(int i = tmp2.length; i<tmp2.length*2 ; i++)
		{
			
			tmp2[j]=arr[i];
			j++;
		}
		
			tmp1 = mergesort(tmp1);
			tmp2 = mergesort(tmp2);
			return merge(tmp1,tmp2) ;


	}
	//Used linked list for decreasing expenses in this function 
	//(O(1) for removing first element linked list 
	public int[] merge(int[] tmp1, int[] tmp2)
	{	
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		for(int i =0; i< tmp1.length; i++)
		list1.add(tmp1[i]);		
		for(int i =0; i< tmp2.length; i++)
			list2.add(tmp2[i]);	
		
		LinkedList<Integer> list3 = new LinkedList<Integer>();

		while ((!list1.isEmpty()) && (!list2.isEmpty()))
		{
			if (list1.getFirst() > list2.getFirst())
			{
				list3.addLast(list2.getFirst());
				list2.removeFirst();
			}
			else
			{
				list3.addLast(list1.getFirst());
				list1.removeFirst();

			}
			
		}
		while ((!list1.isEmpty()) )
		{
			list3.addLast(list1.getFirst());
			list1.removeFirst();

		}
		while ((!list2.isEmpty()) )
		{
			list3.addLast(list2.getFirst());
			list2.removeFirst();
			
		}
		
		
		int[] result = new int[ list3.size()];

		int i = 0;
		
		while( i<list3.size())
		{
			result[i]=list3.get(i);
			i++;
		}
		
		return result;
			

	}

	

}
