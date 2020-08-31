package Day9.Exercise.Ques3;

public class Mycalculator implements iAdvancedArithmetic{


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

