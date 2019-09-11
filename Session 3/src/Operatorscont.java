public class Operatorscont {
    public static void main(String[] args){

        //conditional operator : ?
        int x = 10;

        //x = (x > 0) ? 100 : (x > -10) ? (x > -3) ? -2 : 6 : -5; // if it's not -2, then it's 6. If neither, then -5

        //System.out.println(x);

        x += (x > 0) ? 100 : -100;

        System.out.println(x);

    }
}
