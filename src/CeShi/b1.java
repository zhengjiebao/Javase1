package CeShi;

public class b1 {
    public static void main(String[] args){
//        for (int i = 1;i<=9;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print("\t"+i*j);
//            }
//            System.out.println();
//        }
        for (int i = 9; i>=1;i--){
            for (int j = 9 ;j>=i ;j--){
                System.out.print(i*j);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
