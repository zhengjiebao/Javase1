package zhouce3;

public class Test5 {
    static int score1 = 86;
    static int score2 = 92;
    public static int sum(){
        int allScore = score1 + score2;
        return allScore;
    }

    public static void main(String[] args){
        int allScore = sum();
        System.out.println("总分:"+allScore);
    }
}
