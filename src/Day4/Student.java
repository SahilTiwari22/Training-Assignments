package Day4;
/*
Question 2: Class Student
 * FindName() method in Student class is used to find
 * the name of the student whenever roll number and classname provided
 *
 * */

public class Student {
    static String name;
    static int rollnumber = 3;
    static int branch = 1;


    public static void main(String[] args) {
        Student student = new Student();
        if (branch == 1) {
           name= student.FindName1(rollnumber);
        } else {
            name = student.FindName2(rollnumber);
        }
        System.out.println(name);
    }


    public String FindName1(int rollnumber) {
        switch (rollnumber) {
            case 1:
                name = "Rohit1";
                break;
            case 2:
                name = "Mohit1";
                break;
            case 3:
                name = "Ram1";
                break;
            case 4:
                name = "Shyam1";
            default:
                name = "Error:Student Not Found";
        }

        return name;
    }

    public String FindName2(int rollnumber) {
        switch (rollnumber) {
            case 1:
                name = "Rohit2";
                break;
            case 2:
                name = "Mohit2";
                break;
            case 3:
                name = "Ram2";
                break;
            case 4:
                name = "Shyam2";
            default:
                name = "Error:Student Not Found";
        }
        return name;
    }
}

