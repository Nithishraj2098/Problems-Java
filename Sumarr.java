import java.util.Scanner;
public class Sumarr{
	public static void main(String[] agrs){
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int[] arr=new int[num];
		for (int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		for(int j=0;j<num;j++)
		{
			sum=sum+arr[j];
			System.out.println(sum);
		}
	}
}