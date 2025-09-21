package baitap03;

import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("\n*************** MENU QUẢN LÝ NGƯỜI DÙNG ***************");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                choice = InputData.getInt(sc, "Lựa chọn của bạn: ");
                switch (choice) {
                    case 1:
                        String name = InputData.getString(sc, "Nhập tên người dùng: ");
                        String email = InputData.getString(sc, "Nhập email người dùng: ");
                        String phoneNumber = InputData.getString(sc, "Nhập số điện thoại người dùng: ");
                        User newUser = new User(name, email, phoneNumber);
                        manager.addUser(newUser);
                        System.out.println("Người dùng đã được thêm thành công.");
                        break;
                    case 2:
                        String emailRemove = InputData.getString(sc,"Nhập email người dùng để xóa: ");
                        if (manager.removeUser(emailRemove)) {
                            System.out.println("Người dùng đã được xóa thành công.");
                        }else
                            System.out.println("Không tìm thấy người dùng với email này.");
                        break;
                    case 3:
                        System.out.println("\nDanh sách người dùng:");
                        manager.displayUsers();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                }

            } catch (NullPointerException e) {
                System.out.println("Lỗi nhập liệu! Vui lòng chọn một số hợp lệ.");

            }
        } while (true);
    }
}
