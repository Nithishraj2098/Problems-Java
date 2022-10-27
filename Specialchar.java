import java.util.Scanner;

public class Specialchar{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		String str;
		int count=0;
		str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			if(!Character.isDigit(str.charAt(i))&& !Character.isLetter(str.charAt(i))&& !Character.isWhitespace(str.charAt(i)))
				count++;
			
		}
		if(count==0)
			System.out.println("There is no Special chacter in tha String");
		else{
			System.out.println("The special chacter in the String are : "+count);

		}
		

	}
}