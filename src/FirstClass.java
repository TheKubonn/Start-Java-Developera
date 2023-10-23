public class FirstClass {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.print("My Numbers Are: ");
        System.out.print(myFirstNumber);
        System.out.print(" ");
        System.out.print(mySecondNumber);
        System.out.print(" ");
        System.out.println(myThirdNumber);
        System.out.print("My total amount of the numbers is: ");
        System.out.println(myTotal);

        myThirdNumber = myFirstNumber * 2;
        System.out.println(myThirdNumber);

        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
    }
}
