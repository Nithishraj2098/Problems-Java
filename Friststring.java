import java.util.*;
public class Friststring{
	public static void main(String[] agrs){
		String s="nithishraj";
		for(int i=0;i<10;i++)
		{
			if(i%2==0){
		
		System.out.print(s.substring(i,i+1).toUpperCase());
	}
	else
		System.out.print(s.substring(i,i+1));
}
	}
}