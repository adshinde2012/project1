import java.util.*;
public class ReverseParagraph
{
	public static void main(String args[])
	{
		//user input
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a paragraph : ");
		String name= sc.nextLine() + ".";
		
		System.out.print("how many words you don't want to reverse : ");
		int no = sc.nextInt();
		
		try{
		
		//getting words till .(dot)
		String[] para = name.split("\\.");
		
		for (int i = 0 ; i <= para.length -1; i++)
		{
			String result0 = "";
			result0 = para[i];
			
			String[] words = result0.split(" ");
			//for reverse words
			String result1 = "";
			for (int j = words.length - (no + 1); j >= 0; j--)
			{
				result1 += (words[j] + " ");
			}
			System.out.print(result1.trim());
			String result2 = "";
			//for remaining last 2 words
			for (int k = words.length - no; k <= words.length - 1 ; k++)
			{
				result2 +=	(" " + words[k]);
			}
			System.out.print(result2 + ". ");
			
		}
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("number of words you don't want to reverse should not be greater than lenght of the paragraph");
		}

	}
}