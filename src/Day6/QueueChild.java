package Day6;

public class QueueChild implements IQueueParent{
    static int[] a = new int[10];
    int i;
    @Override
    public void insert(int n) {
        if(a[i]==0) {
            a[i]=n;
        }
        else {
            i++;
            a[i]=n;}
    }


    @Override
    public void delete() {
        a[0]=0;
    }
    public static void main(String[] args) {
        QueueChild q= new QueueChild();
        q.insert(1);

        for(int i=0;i<10;i++) {
            System.out.println(a[i]);
        }


    }
}
