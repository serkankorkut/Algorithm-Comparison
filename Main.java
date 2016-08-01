/*
 ============================================================================
 Name        : BBM204-Exp1.java
 Author      : Serkan Korkut - 29.02.2016
 Student Id  : 21027199
 Copyright   : Educational use only.
 Description : Analysis and comparing of a few famous algorithms in Java. Developed for 
 Hacettepe University Computer Science and Engineering department 2015-2016 Spring Semester 
 BBM204-Software Lab II course's first experiment.
 ============================================================================
 */

public class Main
{

	public static void main(String[] args)
	{

		int[] inputValues = { 100, 300, 500, 700, 1100, 1300, 1500, 1700, 1900, 2100, 2300, 2500 };

		double[] cpuTime = new double[12];
		long beginCount = System.currentTimeMillis();

		long endCount = System.currentTimeMillis();

		 for(int i=0;i<12;i++)
		 {
		
		
		 Matrix a = new Matrix(inputValues[i]);
		 Matrix b =new Matrix(inputValues[i]);
		
		 beginCount = System.currentTimeMillis();
		 a = Matrix.multiplyMatrix(a, b);
		
		 endCount = System.currentTimeMillis();
		 cpuTime[i] = ((double) (endCount - beginCount)) / 1000 ;
		 System.out.println(cpuTime[i] + "seconds for " + inputValues[i] +
		 "input values in matrix multiplication" );
		
		 }

		 for(int i=0;i<12;i++)
		 {
		 int max;
		
		
		 Arr a = new Arr(inputValues[i]);
		
		 beginCount = System.nanoTime();
		
		 max= FindMax.findMax(a.getArr());
		
		 endCount = System.nanoTime();
		 cpuTime[i] = ((double) (endCount - beginCount)) ;
		 System.out.println(cpuTime[i] + " nanoseconds for " + "finding max in	 " + inputValues[i] +" input values and the max is " + max );
		
		 }
		
		

		for (int i = 0; i < 12; i++)
		{
			beginCount = System.nanoTime();

			Arr a = new Arr(inputValues[i]);

			beginCount = System.nanoTime();

			a.setArr(BubbleSort.bubbleSort(a.getArr()));

			endCount = System.nanoTime();
			cpuTime[i] = ((double) (endCount - beginCount));
			System.out.println(
					cpuTime[i] + " nanoseconds for " + "bubble sorting in " + inputValues[i] + " input values ");
		}

		for (int i = 0; i < 12; i++)
		{

			Arr a = new Arr(inputValues[i]);

			MergeSort dull = new MergeSort();

			beginCount = System.currentTimeMillis();

			a.setArr(dull.mergesort(a.getArr()));

			endCount = System.currentTimeMillis();
			cpuTime[i] = ((double) (endCount - beginCount));
			System.out.println(
					cpuTime[i] + " miliseconds for " + "merge sorting in " + inputValues[i] + " input values ");

		}

		for (int i = 0; i < 12; i++)
		{
			int value;

			Arr a = new Arr(inputValues[i]);

			MergeSort dull = new MergeSort();

			a.setArr(dull.mergesort(a.getArr()));

			beginCount = System.nanoTime();

			value = BinarySearch.binarySearch(a.getArr(), 1246, 0, (a.getArr().length - 1));

			endCount = System.nanoTime();
			cpuTime[i] = ((double) (endCount - beginCount));
			if (value == -1)
				System.out.println("Not found");
			else
				System.out.println("Found");
			System.out.println(
					cpuTime[i] + " nanoseconds for " + "binary search in " + inputValues[i] + " input values ");

		}

	}

}
