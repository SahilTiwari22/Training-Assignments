package GeneralPractice;


public class BaseClass {
    public void displayX(){
        int x=200;
        System.out.println("Value of x: "+ x);

    }
}

class DerivedClass extends BaseClass{
    public static void main(String[] args){
        DerivedClass d1= new DerivedClass();
        d1.displayX();
    }
}