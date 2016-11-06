/**
 * Created by E7440 on 06/11/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(Divide(10,0));
        System.out.println("This is testing for github");
    }

    public static int Divide(int a, int b)
    {
        try
        {
            return  a/b;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Encountered ArithmeticException");
        }
        catch (Exception e)
        {
            System.out.println("Handled by Exception");
        }
        catch (Throwable te)
        {
            System.out.println("Throwable");
        }
        finally {
            System.out.println("Divide operation completed");
        }
        return -1;
    }

    public class Calculator
    {
        public double Divide (double a, double b)
        {
            return a/b;
        }
    }
}
