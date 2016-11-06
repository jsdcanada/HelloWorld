/**
 * Created by E7440 on 06/11/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        try {
            System.out.println(Divide(10, 0));
        }
        catch (IllegalArgumentException ie) {
            System.out.println("you passed invalid argument");
        }

        System.out.println("This is testing for github");
    }

    public static int Divide(int a, int b)
    {
        if (b == 0)
            throw new IllegalArgumentException("b is invalid, can not accept 0");

            return  a/b;
    }

    public class Calculator
    {
        public double Divide (double a, double b)
        {
            return a/b;
        }
    }
}
