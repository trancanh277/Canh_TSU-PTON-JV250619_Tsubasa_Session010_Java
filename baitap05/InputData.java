package baitap05;

import java.util.Scanner;

public class InputData {
    public static String getString(Scanner scanner, String suggest) {
        String input = "";
        do {
            System.out.println(suggest);
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Vui lòng ko để trống !");
            }
        } while (input.isEmpty());
        return input;
    }

    public static int getInt(Scanner scanner, String suggest) {
        String rs = "";
        do {
            System.out.println(suggest);
            rs = scanner.nextLine();
            try {
                if (rs.isEmpty()) {
                    System.out.println("Vui lòng ko để trống !");
                }else if (Integer.parseInt(rs)<0) {
                    System.out.println(" Vui lòng nhập số nguyên >= 0 !");
                }else
                    break;
            } catch (Exception e) {
                System.out.println(" Vui lòng nhập số nguyên >= 0 !");
            }
        } while (true);
        return Integer.parseInt(rs);
    }
    public static double getDouble(Scanner scanner, String suggest) {
        String db = "";
        do {
            System.out.println(suggest);
            db = scanner.nextLine();
            try {
                if (db.isEmpty()){
                    System.out.println("Vui lòng ko bỏ trống !");
                }else if (Double.parseDouble(db) < 0){
                    System.out.println(" Vui lòng nhập số thực >= 0 !");
                }else {
                    break;

                }
            }catch (Exception e){
                System.out.println(" Vui lòng nhập số thực >= 0 !");
            }
        }while(true);
        return Double.parseDouble(db);
    }
}
