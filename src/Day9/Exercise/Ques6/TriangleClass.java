package Day9.Exercise.Ques6;

public class TriangleClass {
        private int x;
        private int y;
        private int z;

        public TriangleClass(int x, int y, int z) {
            this.x= x;
            this.y = y;
            this.z = z;
        }

        public void rightAngle() {
            if(x>y && x>z) {
                System.out.println("X is the largest number");
                if(x*x== y*y+z*z) {
                    System.out.println("Right angled Triangle");
                }
                else {
                    System.out.println("Not a right angled Triangle");
                }
            }
            else if(y>z) {
                System.out.println("Y is the largest number");
                if(y*y == x*x+z*z) {
                    System.out.println("Right angled Triangle");
                }
                else {
                    System.out.println("Not a right angled Triangle");
                }
            }
            else
            { System.out.println("Z is the largest number");
                if(z*z == x*x+y*y) {
                    System.out.println("Right angled Triangle");
                }
                else {
                    System.out.println("Not a right angled Triangle");
                }
            }
        }
    }

