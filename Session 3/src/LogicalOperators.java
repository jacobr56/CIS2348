public class LogicalOperators {
    public static void main(String[] args) {
        // && and , || or, ! not, ^ exlusive or (when both true, makes it false), | is bitwsise or
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = true;

        //boolean result = !(((!a && b) || !(c || d)) ^ !(b ^ !a));
        //boolean result = (!a && b) || !(c || d);
        boolean result = c ^ d;
        System.out.println("The result is: " +result);
    }
}
