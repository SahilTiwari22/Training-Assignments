package Day11ExceptHand.Ques3;

public class AruthmeticExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try
        {
            int c = a/b;
            System.out.println("Value of c is : " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division Error");
        }
    }
}
