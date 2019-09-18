public class PassString {
    public static void main(String[] args) {

        String str = "BOX";
        int number1 = 20;
        int number2 = 20;

        calculateNameArea(str, number1, number2);
    }

    private static void calculateNameArea(String str, int number1, int number2) {

        int area = number1 * number2;
        System.out.println("The area of rectangle " + str + " is " + area);
    }
}
