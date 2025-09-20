package baitap01;

import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        String continueInput;
        do {
            String name = InputData.getTen(sc, "Nhập tên sinh viên: ");
            int tuoi = InputData.getTuoi(sc, "Nhập tuổi sinh viên: ");
            Double dtb = InputData.getDtb(sc, "Nhập điểm trung bình sinh viên: ");
        Student student = new Student(name, tuoi, dtb);
        manager.addStudent(student);

        continueInput = InputData.getTen(sc, "Bạn có muốn thêm sinh viên khác? (y/n): ");
        }while(continueInput.equalsIgnoreCase("y"));
        System.out.println("\nDanh sách sinh viên:");
        manager.displayStudents();
        sc.close();
    }
}
