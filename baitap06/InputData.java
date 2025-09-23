package baitap06;

import java.util.Scanner;

public class InputData {
    public static String getString(Scanner scanner, String suggest) {
        String input  ="";
        do {
            System.out.println(suggest);
            input = scanner.nextLine();
            if(input.isEmpty())
                System.out.println("Vui lòng ko để trống !");
        }while(input.isEmpty());
        return input;
    }
    public static int getInt(Scanner scanner, String suggest) {
        String sr= "";
        do {
            System.out.println(suggest);
            sr = scanner.nextLine();
            if (sr.isEmpty()){
                System.out.println("Vui lòng ko để trống !");
            }else if(Integer.parseInt(sr)<0){
                System.out.println("Vui lòng nhập số nguyên >=0");
            }else
                break;
        }while(true);
        return Integer.parseInt(sr);
    }
}
