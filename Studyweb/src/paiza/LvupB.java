package paiza;

import java.util.Scanner;

public class LvupB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sekisu = sc.nextInt();
        int group = sc.nextInt();
        int seki[] = new int[sekisu + 1];

        int sum = 0;

        for(int i = 1; i <= group; i++){
        	boolean flag = true;

            int member = sc.nextInt();
            int suffix = sc.nextInt();
            /*
            if(member + suffix > sekisu){
				sekisu - (member + suffix + j);
            }
            */

            //席が空いているか
            for(int j = 0; j < member; j++){

            	if(suffix + j > sekisu){
            		if(seki[(suffix + j) - sekisu] != 0) {
            			flag = false;
            		}
                }else if(seki[suffix + j] != 0){
                    flag = false;
                }
            }

            //席に座らせる
            if(flag == true){
                for(int j = 0; j < member; j++){
                	if(suffix + j > sekisu){
                		seki[(suffix + j) - sekisu] = 1;
                	}else {
                		seki[suffix + j] = 1;
                	}
                    sum = sum + 1;
                }

            }

        }
        System.out.println(sum);

    }
}