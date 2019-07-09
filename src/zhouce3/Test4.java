package zhouce3;

public class Test4 {
    public static void main(String[] args){
        Test4 aa = new Test4();
        aa.print();
        aa.print("asd");
        aa.print(18);
    }


    public void print(){
        System.out.println("无参的print方法");
    }
    public void print(String name){
        System.out.println("带有一个字符串参数的print方法，参数值为："+name);
    }
    public void print(int age){
        System.out.println("带有一个整型参数的print方法，参数值为："+age);
    }
}
