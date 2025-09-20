package baitap01;

import java.util.Scanner;

public class InputData {
    public static String getTen(Scanner sc, String suggest) {
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
    public static int getTuoi(Scanner sc, String suggest) {
        String tuoi = "";
        do {
            System.out.println(suggest);
            tuoi = sc.nextLine();
            try{
                if(tuoi.isEmpty()){
                    System.out.println("Vui lòng ko bỏ trống !");
                }else if(Integer.parseInt(tuoi)<=0){
                    System.out.println(" Vui lòng nhập số nguyên >= 0 !");
                }else
                    break;
            }catch (Exception e){
                System.out.println(" Vui lòng nhập số nguyên >= 0 !");
            }

        }while(true);
        return Integer.parseInt(tuoi);

    }
    public static double getDtb(Scanner sc, String suggest) {
        String dtb = "";
        do {
            System.out.println(suggest);
            dtb = sc.nextLine();
            try{
                if(dtb.isEmpty()){
                    System.out.println("Vui lòng ko bỏ trống !");
                }else if(Double.parseDouble(dtb)<=0){
                    System.out.println(" Vui lòng nhập số thực >= 0 !");
                }else
                    break;
            }
            catch (Exception e){
                System.out.println(" Vui lòng nhập số thực >= 0 !");
            }
        }while(true);
        return Double.parseDouble(dtb);
    }
}
