package Exeption_Handling_JM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Hello2
{
	void display() throws FileNotFoundException,IOException,Exception
	{
		FileReader fr=new FileReader("rohan.txt");
		BufferedReader br=new BufferedReader(fr);
		 System.out.println(br.readLine()); 
	}
}

public class Throws_ex {

	public static void main(String[] args) 
	{
		Hello2 ob=new Hello2();
		try {
			ob.display();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
		catch (IOException e1) 
		{
			System.out.println(e1);
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}

	}

}