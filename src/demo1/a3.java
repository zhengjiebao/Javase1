package demo1;
import java.util.Scanner;
public class a3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("输入第三个数");
        int num3 = sc.nextInt();

        int num4=bijiao(num1,num2,num3);
        System.out.println("最大值为" + num4);
    }

    public static int bijiao(int num1,int num2,int num3){
        if (num1>num2){
            return (num1>num3)?num1:num3;
        }else{
            return (num2>num3)?num2:num3;
        }
    }
}
