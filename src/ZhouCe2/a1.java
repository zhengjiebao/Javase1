package ZhouCe2;

public class a1 {
    public static void main(String[] args){
        char day = '日';
        switch (day){
            case '一':
            case '三':
            case '五':
                System.out.println("吃包子");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println("吃油条");
                break;
            case '日':
                System.out.println("吃主席套餐");
        }
    }
}
