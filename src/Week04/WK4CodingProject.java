package Week04;
import java.util.*;

public class WK4CodingProject {

	public static void main(String[] args) {
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		//Create an array of Integers names ages
		ArrayList<Integer> ages = new ArrayList<>();
		
		//Populate the array ages
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		
		System.out.println("Here are the contents of ages: " + ages);
		
		//use .get(0) to retrieve the first index of the array
		int firstNumber = ages.get(0);
		//use .get((array.size() - 1)) to iterate backwards and get the last index in the array
 		int lastNumber = ages.get((ages.size() - 1));
 		
 		//take our new variables firstNumber and lastNumber which are both Int and subtract the firstN by the lastN
 		int subtractionSum = firstNumber - lastNumber;
 		
 		//Print the result
 		System.out.println("The sume after Substracting is: " + subtractionSum);
 		
 		//Create a new Int list ages2
 		ArrayList<Integer> ages2 = new ArrayList<>();
 		
 		// Iterate through ages2 and add the index, increasing its number by 1 with each iteration, up to 9
	    for ( int i = 1; i <= 9; i++ ) {
	    	ages2.add(i);
	    }
	    
	    System.out.println("Here are the contents of ages2: " + ages2);
	    
		//use .get(0) to retrieve the first index of the array ages2, changed the variable name by adding 2 at the end
		int firstNumber2 = ages2.get(0);
		//use .get((array.size() - 1)) to iterate backwards and get the last index in the array ages2, changed the variable name by adding 2 at the end
 		int lastNumber2 = ages2.get((ages.size() - 1));
 		
 		// Subtract firstNumber2 by lastNumber2 and store the result in substractionSum2
 		int subtractionSum2 = firstNumber2 - lastNumber2;
		
 		System.out.println("Here is the sum of the second Substraction: " + subtractionSum2);
 		
 		//Example showing this with a smaller/different sized list
 		ArrayList<Integer> exampleList = new ArrayList<>();
 		
 		exampleList.add(1);
 		exampleList.add(2);
 		exampleList.add(3);
 		
 		int firstNumber3 = exampleList.get(0);
 		
 		int lastNumber3 = exampleList.get((exampleList.size() - 1));
 		
 		int subtractionSum3 = firstNumber3 - lastNumber3;
 		System.out.println("Here is another shorter list used to show that the list comprehension is dynamic: exampleList" + exampleList);
 		System.out.println("Here is an example showing the math works with a different sized list: " + subtractionSum3);
 		
 		//Create a loop to iterate through the Array and find the average, I'm using the array ages, but you can use any. 
 		double sum = 0;
 		for (int i = 0; i < ages.size(); i++) {
 		    sum += ages.get(i);
 		}
 		// Calculate the average by dividing the sum by the number of elements in the array
 		double average = sum / ages.size();
 		
 		System.out.println("Average of list ages: " + average);
 		
 		
 		
 		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
 		//Make the array
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        //Create a variable lettersInName to use for adding the name size in the for loop
        int lettersInName = 0;
        //Create a new array to store the length of each name as an int
        int[] nameSize = new int[names.length];

        // Calculate the total number of letters per element and add them to lettersInName
        for (int i = 0; i < names.length; i++) {
            nameSize[i] = names[i].length();
            lettersInName += nameSize[i];
        }

        // Calculate the average number of letters per name
        double average1 = (double) lettersInName / names.length;

        System.out.println("Average number of letters per name: " + average1);
        
        //Concatenate all the names together separated by spaces:
        String concatenatedNames = "";
        for (int i = 0; i < names.length; i++) {
            concatenatedNames += names[i] + " ";
        }
        // Remove the extra space at the end
        concatenatedNames = concatenatedNames.trim();
        // Print the concatenated names
        System.out.println("Concatenated names: " + concatenatedNames);
        
        //3. How do you access the last element of any array?
        
        //I used this earlier
        //use array.get((array.size() - 1)) to iterate backwards and get the last element in the array
 		//Example: int lastNumber = ages.get((ages.size() - 1));

        //4. How do you access the first element of any array?
        
        // I used this earlier: 
        //use array.get(0) to retrieve the first element of the array
		//Example: int firstNumber = ages.get(0);
        
        //5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        //Create a new array to store the length of each name as an int
        int[] nameLengths = new int[names.length];

        //loop over the list and add the length of the names to nameLengths
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        
        //Iterate through each element and print it to the console
        System.out.print("Name lengths: ");
        for (int i = 0; i < nameLengths.length; i++) {
            System.out.print(nameLengths[i] + " ");
        }
        //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        
        //initialize sum2 as an empty variable
        int sum2 = 0;
        
        //iterate through each element in nameLengths and add it to sum2
        for (int i = 0; i < nameLengths.length; i++) {
            sum2 += nameLengths[i];
        }
        
        System.out.println("The total sum of nameLenghts is: " + sum2);
        
        //7
        //Here are the parameters for my method concatenatedWord, which was created below because it can't run inside of another method
        String word = "Hello";
        int n = 3;
        
        //Print the result given the variables above
        System.out.println(concatenateWord(word, n));
        
        //8
        //Paremeters for the firstname + lastname method
        String firstName = "Kai";
        String lastName = "Rochette";
        //This time the print statement is in the method, so it still prints to the terminal
        fullName(firstName, lastName);
 		
        
        //9
        //create an array of numbers to add
        int[] numbers = {30, 40, 50};
       
        //Check if the statement is true or false
        boolean result = isSumGreaterThan100(numbers);
        //print the result
        System.out.println(result);
        
        //10
        // Create an arr or array of doubles
        double[] arr = {10.5, 20.3, 15.7, 25.1};
        //Pass that into the method calculateAverage
        System.out.println("Average of elements in arr: " + calculateAverage(arr));
        
        //11
        // Create two more arrays of doubles, arr1, and arr2
        double[] arr1 = {5.5, 15.3, 10.7, 20.1};
        double[] arr2 = {30.5, 25.3, 20.7, 35.1};
        //Pass them into the method compareAverages
        System.out.println("Is average of arr1 greater than average of arr2? " + compareAverages(arr1, arr2));
   
        //12
        // if its hot outside and they have money in pocket they will buy a drink
        boolean isHotOutside = true;
        double moneyInPocket = 15.75;
        System.out.println("Will buy drink? " + willBuyDrink(isHotOutside, moneyInPocket));
        
        //13
        //Pass in an array, maxArray and find the biggest integer
        //Create the array
        int[] findMaxNumber = {1, 2, 3, 4, 5, 40, 20, 18};
        //Pass the array into the method
        System.out.println("The maximum number in the array is: " + findMax(findMaxNumber));
	}
    //7
    public static String concatenateWord(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }
    //8
    public static void fullName(String firstName, String lastName) {
    	System.out.println(firstName + " " + lastName);
    }
    
    //9
    public static boolean isSumGreaterThan100(int[] arr) {
        int sum = 0;
        //iterate through the list and add each number to sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //check if the sum is greater than 100 and return it
        return sum > 100;
    }
    
    //10
    public static double calculateAverage(double[] arr) {
    	//initialize empty variable sum for math later
        double sum = 0;
        // iterate through the double array and add all element values to sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // divide the some by the length to find the average
        return sum / arr.length;
    }
    
    //11
    public static boolean compareAverages(double[] arr1, double[] arr2) {
    	//use calculateAverage shorthand to handle the average calculations
        double average1 = calculateAverage(arr1);
        double average2 = calculateAverage(arr2);
        // compare if average1 is greater than average2 and return
        return average1 > average2;
    }
    
    //12
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	//Check if its hot outside and if they have money in pocket greater than 10.50$ if so, return true, else false. 
        return isHotOutside && moneyInPocket > 10.50;
    }
    //13
    //I will use this method to find the biggest integer in an array of integers. 
    public static int findMax(int[] arrayMax) {
    	// Initialize max with the first element of the array
    	int max = arrayMax[0];
    	// iterate through the array up to the total length of the array
        for (int i = 1; i < arrayMax.length; i++) {
        	//check to see if the current arrayMax is greater 
        	//than or less than the current max, if its greater, max now equals the new element
            if (arrayMax[i] > max) {
                max = arrayMax[i];
            }
        }
        //return the max of the array
        return max;
    }
}
