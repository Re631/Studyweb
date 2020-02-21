package paiza;

import java.util.Scanner;

public class LvupB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int finger = sc.nextInt();
        int win = 0;
        int g = 0;
        int c = 0;
        int p = 0;

        System.out.println(num);
        System.out.println(finger);
        // g + c + p =num
        // 2c + 5p = finger


        for(int i = 1; i < num; i++) {
        	String hand = sc.nextLine();

            System.out.println(hand);

        }
        //System.out.println(win);
    }
}