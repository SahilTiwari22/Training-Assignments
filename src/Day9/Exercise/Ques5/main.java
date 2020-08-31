package Day9.Exercise.Ques5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        int[][][] box1, box2, box3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Length, Width and Height of box");
        for(int i=0;i<3;i++)
        {        }
    */

        Box box = new Box();
        int volume =box.totalvolume();
        System.out.println("Total volume is: " + volume);

    }
}
class Box{
    int[] box1={2,3,2};
    int[] box2 = {6,6,7};
    int[] box3 = {1,2,1};

    public int calculatevolumebox(int[] n){
        int volume=1;
        for(int i=0;i<n.length;i++)
            volume = volume*n[i];
        return volume;
    }

    public int totalvolume(){
        return calculatevolumebox(box1)+calculatevolumebox(box2)+calculatevolumebox(box3);
    }

}
