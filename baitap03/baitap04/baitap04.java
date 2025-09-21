package baitap04;

import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        AttendanceManager manager = new AttendanceManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*************** MENU QUẢN LÝ ĐIỂM DANH ***************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");

            choice = InputData.getInt(sc, "Lựa chọn của bạn: ");
            switch (choice) {
                case 1:
                    Integer id = InputData.getInt(sc, "Nhập id sinh viên : ");
                    String name = InputData.getString(sc,"Nhập tên sinh viên: " );
                    Student student = new Student(id, name);
                    manager.add(student);
                    System.out.println("Sinh viên đã được thêm thành công.");
                    break;
                case 2:
                    manager.display();
                    int idStudent = InputData.getInt(sc, "Nhập id sinh viên cần sửa: ");
                    int index = -1;
                    for(int i = 0; i < manager.students.size(); i++){
                        if (manager.students.get(i).getId() == idStudent){
                            index= i;
                            break;
                        }
                    }
                    if (index == -1){
                        System.out.println("Không tìm thấy sinh viên cần sửa !");
                    }else {
                        String newname = InputData.getString(sc, "Nhập tên mới sinh viên: ");
                        manager.update(index, new Student(idStudent,newname));
                        System.out.println("Sinh viên đã được sửa thành công.");                    }
                    break;
                case 3:
                    manager.display();
                    int deleteId = InputData.getInt(sc, "Nhập id sinh viên cần xóa: ");
                    int deleteIndex = -1;
                    for (int i = 0; i < manager.students.size(); i++){
                        if (manager.students.get(i).getId() == deleteId){
                            deleteIndex = i;
                            break;
                        }
                    }
                    if (deleteIndex == -1){
                        System.out.println("Không tìm thấy sinh viên cần xóa !");
                    }else {
                        manager.delete(deleteId);
                        System.out.println("Đã xóa thành công sinh viên !");
                    }
                    break;
                case 4:
                    manager.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (true);
    }
}
