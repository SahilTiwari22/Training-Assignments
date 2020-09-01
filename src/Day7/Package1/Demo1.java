package Day7.Package1;

public class Demo1 {
    public static void main(String[] args) {

    }

    public int subtraction(int x, int y){
        int result = x-y;
        return result;
    }

    public int multiply(int x, int y){
        int result = x*y;
        return result;
    }

    public int divide(int x, int y){
        int result = x/y;
        return result;
    }

    public int factorial(int x){
        int result = x;

        while(x>1){
            result = result*(x-1);
            x--;
        }
        return result;
    }

    public int reverse(int x){
        int reversed = 0;
        while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}
