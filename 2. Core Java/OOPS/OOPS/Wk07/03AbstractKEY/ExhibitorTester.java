import java.util.*;
import java.io.*;

public class ExhibitorTester 
{
	public static void main(String[] args) throws IOException
	{
		final int CURRENT_YEAR = 2006;
		Exhibitor exhibitor1;
		Scanner myReader = new Scanner(new File("Exhibitor.txt"));
		String lastNameIn;
		String firstNameIn;
		int yearOfBirthIn;
		int pointsIn;
		int numEventsIn;
		ArrayList<Exhibitor> myList = new ArrayList<Exhibitor>();
				
		while(myReader.hasNext())
		{
			lastNameIn = myReader.next();
			firstNameIn = myReader.next();
			yearOfBirthIn = myReader.nextInt();
			pointsIn = myReader.nextInt();
			if(CURRENT_YEAR - yearOfBirthIn > 18)
			{
				exhibitor1 = new Amateur(lastNameIn, firstNameIn,
						yearOfBirthIn, pointsIn);
			} else
			{
				numEventsIn = myReader.nextInt();
				exhibitor1 = new Youth(lastNameIn, firstNameIn,
						yearOfBirthIn, pointsIn, numEventsIn);
			}
			myList.add(exhibitor1);
		}
		
		for(Exhibitor exh : myList)
		{
			System.out.println(exh + " " + 
					((CURRENT_YEAR - exh.getYearOfBirth() > 18) ? "Amateur" : "Youth") +
					" " + exh.worldShowQualified());
		}
		
		exhibitor1 = new Amateur();
		exhibitor1.setLastName("Jones");
		exhibitor1.setFirstName("Andy");
		exhibitor1.setYearOfBirth(1973);
		exhibitor1.setPoints(100);
		System.out.println();
		System.out.print(exhibitor1.getFirstName() + " ");
		System.out.print(exhibitor1.getLastName() + " ");
		System.out.print(exhibitor1.getYearOfBirth() + " ");
		System.out.println(exhibitor1.getPoints());
		
		exhibitor1 = new Youth();
		exhibitor1.setLastName("Davis");
		exhibitor1.setFirstName("Alice");
		exhibitor1.setYearOfBirth(1993);
		exhibitor1.setPoints(100);
		((Youth)exhibitor1).setNumEvents(4);
		System.out.println();
		System.out.print(exhibitor1.getFirstName() + " ");
		System.out.print(exhibitor1.getLastName() + " ");
		System.out.print(exhibitor1.getYearOfBirth() + " ");
		System.out.print(exhibitor1.getPoints() + " ");
		System.out.println(((Youth)exhibitor1).getNumEvents());
	}	
}

/* OUTPUT
Bob Smith 1990 300 3 Youth true
Jody Brown 1970 175 Amateur true
Judy Green 1994 275 2 Youth true
Nancy Clark 1996 300 1 Youth false
Bill Davis 1980 100 Amateur false
Sue Barton 1995 100 4 Youth false
Sam Young 1985 200 Amateur true

Andy Jones 1973 100

Alice Davis 1993 100 4
*/
