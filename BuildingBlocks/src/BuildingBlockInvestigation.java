// BuildingBlockInvestigation.java
// By: Aidan
// Date: 27/06/2022

/*
 * Some sort of description of this class
 * 
 * This class demonstrates the building blocks of any programming language
 * 
 */
public class BuildingBlockInvestigation {

	public static void main(String[] args) {
		
		// building block #1 - comments
		System.out.println("Building Block Investigation"); // Comment
		
		
		// building block #2 - variables
		int i;
		int j = 10;
		String name = "Aidan";
		double val = 1.23456;
		boolean bl = true;
		
		j = 99;
		
		// j = "ninety nine"; you can't assign a string to an integer
		
		// System.out.println(i); you can't use a variable that hasn't been assigned
		
		// naming convention is extremely important
		// must start with a lowercase letter
		// capitalise the first letter of subsequent words in variable names
		String firstName;
		
		// don't use _
		String first_name;
		
		//String first-name; can't use -
		
		// lowerCamelCase
		
		// building block #3 - expressions
		
		int a = 10;
		int b = 20;
		
		int answer = a + b;
		
		int c = 100;
		int d = 99;
		int e = 27;
		
		answer = ((a * b) / c) + (d ^ e); // use brackets to identify the order
		
		System.out.println("answer=" + answer);
		
		System.out.println("" + answer);  // simple way to convert anything to a string
		
		
		// building block #4 - loops - while loop 
		int count = 1;
		
		while (count <= 10) {
			System.out.println("count=" + count++);
			//count++; //count = count + 1;
		}	// always use a block of code even if there is only a single line in the block
		
		System.out.println("finished");
		
		System.out.println("for loop:");
		// building block #4 - loops - for loop
		for (count = 1; count <= 10; count++) {
			System.out.println("count=" + count);
		}
		
		System.out.println("finished");
		
		
		// building block #5 - Conditionals
		
		double r = Math.random();
		
		if(r < 0.3) {
			System.out.println("" + r + " is small");
		} else if (r < 0.7) {
			System.out.println("" + r + " is medium");
		} else {
			System.out.println("" + r + " is large");
		}
		
		// aside - convert double to integer - casting
		
		int rn = (int)(Math.random()*10);
		System.out.println("rn=" + rn);
		
		// int vv = (int)"ninety nine"; cannot cast incompatible types
		
		
		// building block #5 - conditional - switch statement
		switch(rn) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3: 
			System.out.println("three");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("middle");
			break;
		default:
			System.out.println("many");
			break;
			
		}
		
		// building block #5 - conditional - ternary operator
		int rand = (int)(Math.random() * 10);
		
		System.out.println("The number is " + rand + " it is " + (rand < 5 ? "small" : "large"));
		
		// ternary operator allows us to avoid repetition
		if (rand < 5) {
			System.out.println("The number is " + rand + " it is small");
		} else {
			System.out.println("The number is " + rand + " it is large");
		}


		// building block #6 - list (array)
		
		int[] list = {1, 4, 2, 5, 3, 7, 9, 2};
		
		System.out.println("item 1:" + list[1]);
		System.out.println("item 0:" + list[0]);
		System.out.println("last item:" + list[7]);
		
		
		// System.out.println(list[99]);  // can't access items outside the list
		
		System.out.println(list.length);
		System.out.println("===========================");
		
		for (int index=0; index<list.length; index++) {
			
			System.out.println(list[index]);
		}
		
		
		// building block #7 - function
		
		answer = add(10, 20);
		
		System.out.println("The answer is " + answer);
		
		answer = add(10, 20, 30);
		// having multiple versions of the same (named) function is called overloading
		
		System.out.println("The answer is " + answer);
		
		// answer = add(10, 20, 30, 40); compiler checks the number of parameters
		// answer = add("ten", "twenty"); compiler checks the types of the parameters
		
		
		// intro to building block #8 - Objects
		
		// #1 complex ideas need lots of properties
		// #2 passing all those properties around is very cumbersome
		// #3 making variables global to avoid this is very very problematic
		
		// solution => create a data structure that encapsulates the properties AND the function
		
		// this is what is called an Object
		
		
		// promises of OOP
		
		// 1 simplify passing information to functions
		// 2 nice modular code
		// 3 objects model the real world better than functions 
		// because my car has properties (color, make, model etc)
		// but also has functions (start(), stop(), drive(), turn(), slowdown())
		// 4 promote code reuse
		
		
	
		
	}
	public static int doSomethingWithCar() {
	
		System.out.println();
		return 1;
	}
	
	
	
	public static int add(int a, int b) {
		
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	

}
