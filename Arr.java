
public class Arr
{	
	private int[] arr;

	
	
	public Arr(int length)
	{
		 
		 this.arr = new int[length];
		
		for(int i=0 ; i<length ; i++ )
		{
			this.arr[i] = ((int) Math.floor(Math.random() * 2500));
		}
		
	}
	
	public static void print (Arr a)
	{
		for(int i=0 ; i<a.arr.length ; i++)
		System.out.println(a.arr[i]);
		
	}
	
	public int[] getArr()
	{
		return arr;
	}

	public void setArr(int[] arr)
	{
		this.arr = arr;
	}

	

	


	
	
	

}
