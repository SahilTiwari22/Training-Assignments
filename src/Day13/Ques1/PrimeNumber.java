package Day13.Ques1;

public class PrimeNumber {

        public void checkPrimeNumbers(int number) {
            try {
                boolean isprime= true;
                int temp;

                for(int i=2;i<=number/2;i++) {
                    temp= number%i;

                    if(temp==0) {
                        isprime= false;
                        break;
                    }
                }

                if(isprime) {
                    System.out.println("It is a prime number");
                }
                else {
                    System.out.println("Its not a prime number");
                }
            }
            catch(ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }
