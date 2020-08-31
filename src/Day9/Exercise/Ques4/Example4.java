package Day9.Exercise.Ques4;

class cycle {
    public void getType() {
        System.out.println("Vehicle with pedals");
    }
}
    class motorcycle extends cycle {
        public void getType() {
            super.getType();
            System.out.println("Hello I am motorcycle, I am cycle with engine");
        }
    }


public class Example4 {
    public static void main(String[] args) {
        motorcycle motorc = new motorcycle();
        motorc.getType();


    }
    }



