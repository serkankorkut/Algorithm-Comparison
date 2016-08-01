
public class Matrix
{
	private int length; // Length and width for a square matrix

	private double[][] data; // Data for length x length matrices

	//Create random length x length square matrix 
	public Matrix(int length)
	{
		this.length = length;
		data = new double[length][length];

		
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length; j++)
				data[i][j] = ((int) Math.floor(Math.random() * 500));
	}

	public static void print(Matrix A)
	{
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A.length; j++)
			{
				System.out.print(A.data[i][j] + " ");

			}
			System.out.println(" ");

		}

	}
	//Multiply matrix
	public static Matrix multiplyMatrix(Matrix A, Matrix B)
	{
		Matrix result = new Matrix(A.length);

		if (A.length == B.length)
		{

			for (int i = 0; i < A.length; i++)
			{
				for (int j = 0; j < A.length; j++)
				{
					result.data[i][j]=0;

					for (int k = 0; k < A.length; k++)
					{
						result.data[i][j] = result.data[i][j] + (A.data[i][k] * B.data[k][j]);

					}
				}

			}

		}
		else
		{
			System.out.println("These two square matrix's lengths are not equal");
		}
		
		return result;

	}

	// GET SET

	public int getLength()
	{
		return length;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public double[][] getData()
	{
		return data;
	}

	public void setData(double[][] data)
	{
		this.data = data;
	}

}
