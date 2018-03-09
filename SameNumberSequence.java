import java.util.Scanner;
import java.util.ArrayList;

public class SameNumberSequence {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Enter a series of numbers ending with 0: ");
		
		int input = cin.nextInt();
		
		while(input != 0) {
		
			list.add(input);
			input = cin.nextInt();
		}
		
		
		System.out.print(list);
		
		int maxCount = 0;
		int maxIndex = 0;
		int maxInt = 0;
		
		for(int i = 0; i <= list.size()-1; i++) {
			
			
			
		
			int currentCount = 1;
			int currentIndex = i;
			int currentInt = list.get(i);
			
		
			if( i < list.size()-1 && currentInt == list.get(i+1) ) {
				
				currentCount++;
				
			}
			else {
				
				currentCount = 0;
				
			}
			
			if(maxCount < currentCount) {
				
				maxCount = currentCount;
				maxIndex = currentIndex;
				maxInt = currentInt;
				
			}
			
			currentCount++;
			
		}
		
		System.out.print("The longest same number sequence starts at index "+maxIndex+" with "+maxCount+" values of "+maxInt);
	}
	
}
