import java.util.Scanner;
import java.io.*;
public class FileReadWrite 
{

	public static void main(String[] args) 
	{
		try
		{
				String str = "";
				File poem = new File("poem.txt");
				PrintWriter fileOut = new PrintWriter(poem);
				File poem1 = new File("poem.txt");
			String filenameRead, filenameWrite = null;
			Scanner in = new Scanner(System.in);
			int i = 1;
			while(in.hasNextLine())
			{
				str = in.nextLine();
				fileOut.println("/ * " + i + " */ " + str);
				i++;
			}
			fileOut.close();
		}
		catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		} 
	}
	
	
	
}
