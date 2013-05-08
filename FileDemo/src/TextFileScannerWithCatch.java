import java.util.*;
import java.io.*;

public class TextFileScannerWithCatch {

	public static void main(String[] args) {
	int num1;
	double num2;
	String name;
	
	try{
		Scanner in = new Scanner(new File("inwwwwwwwww.txt"));
		num1 = in.nextInt();
		num2 = in.nextDouble();
		name = in.next();

		System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1 + num2);
	} catch(FileNotFoundException ex)

	{
		System.out.println("Wrong File");
//		ex.printStackTrace();
		}
	}

}
