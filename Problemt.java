import java.util.Scanner;
public class Problemt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int h,q,m,k,j;
		
		int year;
		
		System.out.print("Enter year (e.g.,2012): ");
		
		year = input.nextInt();
		
		System.out.print("Enter month 1-12 :");
		
		m = input.nextInt();
		
		if (m == 1) 
		{ 
		    m = 13; 
		    year--; 
		} 
		if (m == 2) 
		{ 
		    m = 14; 
		    year--; 
		} 
		
		System.out.print("Enter the day of the month : 1-31:");
		
		q = input.nextInt();
		
		k = year % 100;
		
		j = year/100;
		
		h = q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j;
		
		h=h%7;
		
		
		if(h==0) 	  System.out.println("Day of the week is Saturday");
		else if(h==1) System.out.println("Day of the week is Sunday");
		else if(h==2) System.out.println("Day of the week is Monday");
		else if(h==3) System.out.println("Day of the week is Tuesday");
		else if(h==4) System.out.println("Day of the week is Wednesday");
		else if(h==5) System.out.println("Day of the week is Thursday");
		else if(h==6) System.out.println("Day of the week is Friday");
		
	}
	
}
