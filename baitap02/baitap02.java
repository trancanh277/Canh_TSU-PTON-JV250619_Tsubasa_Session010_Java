package baitap02;

import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("\n*************** MENU QUẢN LÝ SÁCH ***************");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            try {
                choice = sc.nextInt();
                System.out.println("Lựa chọn của bạn: " + choice);
                switch (choice) {
                    case 1:
                        String name = InputData.getString(sc, "Nhập tên sách: ");
                        String author = InputData.getString(sc, "Nhập tên tác giả: ");
                        int year = InputData.getInt(sc, "Nhập năm xuất bản: ");
                        Book book = new Book(name, author, year);
                        manager.addBook(book);
                        System.out.println("Sách đã được thêm thành công.");
                        break;
                    case 2:
                        System.out.print("Nhập tên sách để tìm kiếm: ");
                        String searchName = sc.nextLine();
                        try {
                            Book foundBook = manager.findBook(searchName);
                            System.out.println("Thông tin sách tìm thấy: " + foundBook);

                        }catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("\nDanh sách sách:");
                        manager.displayBooks();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập liệu! Vui lòng chọn một số hợp lệ.");
            }
        }
    }

}
