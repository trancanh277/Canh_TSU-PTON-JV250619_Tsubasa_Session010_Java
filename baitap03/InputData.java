package baitap03;

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
        String rs = "";
        do {
            System.out.println(suggest);
            rs = sc.nextLine();
            try {
                if(rs.isEmpty()){
                    System.out.println("Vui lòng ko để trống !");
                }else if (Integer.parseInt(rs)<=0){
                    System.out.println(" Vui lòng nhập số nguyên >= 0 !");

                }else
                    break;
            }catch (Exception e){
                System.out.println(" Vui lòng nhập số nguyên >= 0 !");
            }

        }while(true);
        return Integer.parseInt(rs);
    }
}
