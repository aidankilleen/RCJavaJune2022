package ie.rc.exceptioninvestigation;

import java.rmi.UnexpectedException;
import java.security.InvalidParameterException;
import java.sql.DriverManager;

import javax.naming.CannotProceedException;

public class ExceptionInvestigation {

	public static int divide(int a, int b) throws DivisionParameterException {
		int answer;
		try {
			answer = a / b;
		} catch(Exception ex) {
			throw new DivisionParameterException("invalid parameter");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Exception Investigation");
		int a = 100;
		int b = 0;
		int[] list = {1, 5, 9, 20, 18, 6, 2, 9};
		String name = null;
		int answer=0;
		
		// divide(a, b);
		
		/* we are forced to provide a try / catch for functions that have throws 
		 * in their declaration
		try {
			answer = divide(a, b);
		} catch (DivisionParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		
		int r = (int)(Math.random()*5);
		
		try {
			switch(r) {
			case 0:
				answer = divide(a, b);
				break;
			case 1:
				answer = list[99];
				break;
			case 2:
				answer = name.length();
				break;
			case 3:
				throw new UnexpectedException("huh???");
				
			default:
				// no error occurred
				answer = 42;
				break;
			}
		} catch (ArithmeticException ex) {
			System.out.println("Can't divide by zero");
			answer = 0;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of bounds");
			answer = list[0];
		} catch (Exception ex) {
			System.out.println("some other error occurred");
			System.out.println(ex);
			answer = -1;
		} finally {
			// no matter what happens this block will be executed
			System.out.println("The answer is " + answer);
		}
		
		
		
		System.out.println("finished");
		
		
		
		
		
		/*
		// glass is half full approach
		// much more optimistic
		try {
			DoSomething();
			DoSomethingElse();
			
		} catch(NetworkExcpetion ex) {
			
		} catch(SystemException ex) {
			
		} catch(FileNotFoundException ex) {
			
		} catch(Excetion ex) {
			
		}
		
		try {
					DoSomethingElse();
		}
		
		*/
		
		
		
		
		
		
		//DoSomething()
		
		// glass is half empty approach
		//
		/*
		int r = DoSomething();
		
		if (r == -1) {
			// network error
		} else if (r == -2) {
			// system error
		} else if (r == -3) {
			// file error
		} else if (r == 0) {
			// everything fine
		}
		
		r = DoSomethingElse();
		
		if (r == -1) {
			// network error
		} else if (r == -2) {
			// system error
		} else if (r == -3) {
			// file error
		} else if (r == 0) {
			// everything fine
		}
		*/
		
		
		

	}

}
