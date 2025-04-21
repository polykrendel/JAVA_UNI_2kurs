package kek;

public class FibArr {
    private int size;
    public int[] arr;

    public FibArr(int size) {
        this.size = size;
        arr=new int[size];
        arr[0]=0;
        arr[1]=1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int get_number(int index){
        int p1=0,p2=1,res=0;
        if(index==0){
            return 0;
        } else if (index==1) {
            return 1;
        }
        else {
            for (int i = 2; i <= index; i++) {
                res = p1 + p2;
                p1 = p2;
                p2 = res;
            }
            return res;
        }
    }
}
