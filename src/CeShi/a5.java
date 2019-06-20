package CeShi;

public class a5 {
    public static void main(String[] args){
        int age = 25;
        if(age>60){
            System.out.println("老年");
        }
        if (age>=40&&age<60){
            System.out.println("中年");
        }
        if(age<40&&age>=18){
            System.out.println("少年");
        }
        if(age<18){
            System.out.println("童年");
        }
    }
}
