import java.util.*;


public class Balanced{
	public static void main(String[] agrs){
		Stack<Character>s=new Stack<Character>();
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[')
			{
				s.push(ch);
			}
			else if(ch==')')
			{
				if(s.isEmpty() || s.pop()!='(')
				{
					System.out.println("Not blanced put ) to balance");	
					return;
			}
		}
		else if(ch=='}')
			{
				if(s.isEmpty() || s.pop()!='{')
				{
					System.out.println("Not blanced put } to balance");
					return;
			}
		}
		else if(ch==']')
			{
				if(s.isEmpty() || s.pop()!='[')
				{
					System.out.println("Not blanced put ] to balance");	
					return;
			}
		}
	}
	if(s.isEmpty())
	System.out.println("balanced");
else
	System.out.println("unbalanced");


}
}