public class WhileLoop {
    public static void main(String[] args) {
// hello
        boolean expression = true;
        int counter = 0;
        while(expression)
        {
            int integerInsideWhile = 10;
            counter++;

            if(counter ==5)
            {
                break;
            }
        }
        System.out.println("We are done with the loop and the counter is: "+counter);
    }
}
