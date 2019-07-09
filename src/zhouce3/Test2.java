package zhouce3;

public class Test2 {
    public static void main(String[] args){
        Test2 hello = new Test2();
        double avg = hello.calcAvg();
        System.out.println("平均成绩为："+avg);
    }

    public double calcAvg(){
        double java = 92.5;
        double php = 83.0;
        double avg = (java+php)/2;
        return avg;
    }
}
