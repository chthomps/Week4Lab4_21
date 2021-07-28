//Program filing through an array in order to identify the next largest number

public class Numbers {
	

	public static void main(String[] args) {  //main method
		
		int[] numbers = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19}; //array called numbers 
		nextLargest(numbers);   //invoke nextLargest method on numbers array	
	
	}
	

	public static void nextLargest(int[] numbers){ //method called nextLargest accepting the numbers array as its parameter
		
		final int NUMVALUES =16;
			
		for (int index =0; index <NUMVALUES; index++) { //iterates through the array
			int readPosition = numbers[index];    // variable setting/advancing readPosition in the array
			int nextLargest = Integer.MAX_VALUE;  // resetting variable as the largest integer 
			
			for (int i =0; i <NUMVALUES; i++) { //iterates a particular readPosition against each other value in array 
				if (numbers[i] > readPosition && numbers[i] <nextLargest) { //setting nextLargest to the next largest array number (stepping down from MAX_VALUE)
					nextLargest = numbers[i];								
				}	
			
			}
			System.out.println(readPosition+ ": "+nextLargest);	
			

		}
	}
}
