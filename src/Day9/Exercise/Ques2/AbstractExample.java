package Day9.Exercise.Ques2;

public class AbstractExample {
    public static void main(String[] args) {
        MyBook mb = new MyBook();
        mb.setTitle("Java Book");
        System.out.println(mb.getTitle());
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        title = s;
    }
}
