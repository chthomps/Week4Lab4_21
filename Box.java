
//A Box Class for printing boxes of stars with variable length/width dimensions
//The Class invokes a custom printBox method.

public class Box {
	
	int size = 0; //box instance variable- size
	private static char c;  //character for printBox c method
	
	//Constructor method for Box....I found that this is not necessary
	public Box() {

	}
	
	//Main Method
	public static void main(String[] args) {
		
		Box box1, box2;
		
		box1 = new Box();
		box1.size = 5;
		box1.printBox();
		
		box2 = new Box();
		box2.size = 9;
		box2.printBox(c);
		
	}
		
	// printBox * method
		public void printBox() {
			
			for (int l=0; l<size; l++) {  //advances row
				for (int w=0; w<size; w++) { //handles width per line
				System.out.print("*");
				}	
			System.out.println();
			}		
		}
		
	// printBox c method
		public void printBox(char c) {
					
			for (int l=0; l<size; l++) {  //advances row
				for (int w=0; w<size; w++) { //handles width per line
				System.out.print("c");
				}	
			System.out.println();
				}
			}
}
