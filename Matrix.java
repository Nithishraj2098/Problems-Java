import java.util.*;
 
public class Matrix{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[][] arr=new int[num][num];
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
			int sum=0;
			for(int i=0;i<num;i++)
			for(int j=0;j<num;j++)
				if(i==j)
					sum=sum+arr[i][j];
				int sum1=0;
				for(int i=0;i<num;i++)
			for(int j=0;j<num;j++)
				if((i+j)==num-1)
					sum1=sum1+arr[i][j];

				if(sum>sum1)
					System.out.println(sum-sum1);
				else
					System.out.println(sum1-sum);






	}
}