package paiza;

public class LvupB {
    public static void main(String[] args) {
        
        int n_list[] = {1, 3, 5, 6, 3, 2, 5, 23, 2};
        int sum = 0;

        // 取得した値を標準出力するために"XXXXXX"をどう書き換える？
        //System.out.println(n_list);
        
    for(int i = 0; i < n_list.length; i++) {
        sum =  sum + n_list[i];
    }
    System.out.println(sum);
}}