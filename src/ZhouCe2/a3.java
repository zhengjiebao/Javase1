package ZhouCe2;

public class a3 {
    public static void main(String[] args){
        int sum = 0;
        int num = 2;
        do {
            sum = num+sum;
            num = num+2;
        }while (num<=50);
        System.out.println("50以内的偶数之和为："+sum);
    }
}
