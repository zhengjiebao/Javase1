package zhouce3;

public class Test1 {
    public static void main(String[] args){
        String[][] names= {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};

        for (int i = 0;i<names.length;i++){
            for (int j = 0;j<names[i].length;j++){
                System.out.println(names[i][j]);
            }
            System.out.println();
        }
    }
}
