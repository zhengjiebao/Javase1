package zhouce3;

public class Test3 {
    public static void main(String[] args){
        Test3 hello = new Test3();
        hello.calcAvg(94,81);

    }

    public void calcAvg(int i, int j) {
        int avg = (i + j)/2;
        System.out.println(avg);
    }
}
