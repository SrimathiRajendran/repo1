package interview;

public class minnum_Array {
	static int a[][]= {{2,4,10},{3,9,7},{1,2,4}};
	public static void main(String[] args) {
		int temp=a[0][0];
		int col=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			 	if(a[i][j]>temp)
				{
					temp=a[i][j];
				 col=j;
	
				}
										
			}
		}
		int max=a[0][col];
		int k=0;
		while(k<3)
		{
			if(a[k][col]>max)
			{
				max=a[k][col];
			}
			k++;
		}
		System.out.println(max);
			
	}

}
