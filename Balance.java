/* Checking Balanced or not by Stack*/
import java.util.*;
public class Balance{
	public static void main(String[] agrs){
		Stack<Character>s=new Stack<Character>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch;
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch=='{' || ch=='['||ch=='(')
				s.push(ch);
			else if(ch=='}'){
				if(s.isEmpty() || s.pop()!='{')
				{
					System.out.println("not balnced");
				
				return;
			}
			}
			else if(ch==']'){
				if(s.isEmpty() || s.pop()!='[')
				{
					System.out.println("not balnced");
				
				return;
			}
			}
			else if(ch==')'){
				if(s.isEmpty() || s.pop()!='(')
				{
					System.out.println("not balnced");
				
				return;
			}
			}
			
			

	}
	if(s.isEmpty()){
				System.out.println("balanced");
			}
		}
}