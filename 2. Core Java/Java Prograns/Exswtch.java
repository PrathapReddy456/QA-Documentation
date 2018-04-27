import java.io.*;

public class Exswtch {
	
	int i;
	
	public void Pswtch()
	{
		
		
		int a,b,c;
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter the first number");
	      a = Integer.parseInt(bufferedReader.readLine());
	      System.out.println("Enter the second number");
	      b = Integer.parseInt(bufferedReader.readLine());
	      do{
	         System.out.println("Enter your choice");
	         System.out.println("1. Addition");
	         System.out.println("2. Substraction");
	         System.out.println("3. Multiplication");
	         System.out.println("4. Division");
	        // System.out.println("5. Exit loop");
	         c = Integer.parseInt(bufferedReader.readLine());
		switch  (c)
		
		{
		
		case 1: c= a+b;
		
	System.out.println("addition"+c);
	
	break;
	
		case 2: c = a-b;
		
		System.out.println ("substraction"+c);
		
		break;
		
		case 3: i = a*b;
		
		System.out.println("multiplication"+i);
		
		break;
		
		
		case 4: i = a%b;
		
		System.out.println("division"+i);
		
		break;
		
		default:
			
			System.out.println("allnumbersare");	
		
		
	}
	      }	while(c!=5);
	}
	
	public static void main(String[] args) throws IOException{
	

	Exswtch obj = new Exswtch();
	
	obj.Pswtch();
	
	}

}
