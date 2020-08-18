package Day5;

public class Car {

    public static void main(String[] args){
        Car bmw=new BMW();
        bmw.display();
        Car merc=new Merc();
        merc.display();

    }

    public void display() {
        System.out.println("Car class's display method");
    }
}

class BMW extends Car {
    public void display(){
        System.out.println("BMW class's display method");
    }
}

class Merc extends Car {
    public void display(){
        System.out.println("Merc class's display method");
    }

}





