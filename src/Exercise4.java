
public class Exercise4 {

	public static void main(String[] args) {
		printSum();
	}

	public static void printSum() {
        // fix the code
        byte numOne = 104;
        byte numTwo = 110;
        int sumOfTwoNumbers; // changed byte to int
        sumOfTwoNumbers = (int)(numOne + numTwo); // changed byte to int 
        System.out.print("Sum: " + sumOfTwoNumbers);
    }
}
