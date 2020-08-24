package Day9.Exercise;

public class Example3 {
    public static void main(String[] args) {
        int n=12;
        Mycalculator mycalculator = new Mycalculator();
        System.out.println(mycalculator.divisor_sum(n));

    }
}

interface iAdvancedArithmetic{
    int divisor_sum(int n);
}

class Mycalculator implements iAdvancedArithmetic{


    @Override
    public int divisor_sum(int n) {
        int divisors =0;

        for(int i=1; i<=n;i++){
            if(n%i==0)
            {
                divisors = divisors+i;
            }
        }
        return divisors;
    }

}
