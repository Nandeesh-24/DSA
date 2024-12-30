public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static void walk(int steps) {
        //base case
        if (steps <= 0)
            return;
        System.out.println(steps);
        walk(steps - 1);
    }

    private static int fact(int n){
        //base case
        if (n == 0 || n == 1)
            return 1;
        return n*fact(n-1);
    }


}
