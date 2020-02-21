package paiza;

import java.util.Scanner;

public class LvupB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sekisu = sc.nextInt();
        int group = sc.nextInt();
        boolean seki[] = new boolean[sekisu];
        boolean flag = true;
        int sum = 0;
        
        for(int i = 0; i <= group; i++){
            
            int member = sc.nextInt();
            int suffix = sc.nextInt();
            
            if(member + suffix > sekisu){
                
            }
            
            //席が空いているか
            for(int j = suffix; j <= sekisu; j++){
                if(seki[j] != null){
                    flag = false;
                }
            }
            
            //席に座らせる
            if(flag == true){
                for(int j = suffix; j <= sekisu; j++){
                    seki[j] = true;
                    sum = sum + 1;
                }
            }
            
        }
        System.out.println(sum);
        
    }
}