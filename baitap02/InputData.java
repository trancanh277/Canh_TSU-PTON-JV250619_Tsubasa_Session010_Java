package baitap02;

import java.util.Scanner;

public class InputData {
    public static String getString(Scanner sc, String suggest) {
        String input = "";
        do {
            System.out.println(suggest);
            input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Vui lòng ko để trống !");
            }

        }while(input.isEmpty());
        return input;
    }

    public static int getInt(Scanner sc, String suggest) {
        String nam = "";
        do {
            System.out.println(suggest);
            nam = sc.nextLine();
            try {
                if(nam.isEmpty()){
                    System.out.println("Vui lòng ko bỏ trống !");
                }else if(Integer.parseInt(nam)<=0){
                    System.out.println(" Vui lòng nhập số nguyên >= 0 !");
                }else
                    break;
            }catch (Exception e){
                System.out.println(" Vui lòng nhập số nguyên >= 0 !");
            }
        }while(true);
        return Integer.parseInt(nam);
    }
}
