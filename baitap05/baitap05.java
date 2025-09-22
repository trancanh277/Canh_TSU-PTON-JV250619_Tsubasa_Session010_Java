package baitap05;

import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        InvoiceManage manage = new InvoiceManage();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int currenIndex = 1;

        do {
            System.out.println("\n*************** MENU QUẢN LÝ HÓA ĐƠN ***************");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Sửa hóa đơn");
            System.out.println("3. Xóa hóa đơn");
            System.out.println("4. Hiển thị danh sách hóa đơn");
            System.out.println("5. Thoát");

            choice = InputData.getInt(scanner, "Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    Integer id = InputData.getInt(scanner, "Nhập id hóa đơn: ");
                    String invoiceCode = InputData.getString(scanner, "Nhập mã hóa đơn: ");
                    Double amount = InputData.getDouble(scanner, "Nhập số tiền: ");
                    Invoice invoice = new Invoice(id, invoiceCode, amount);
                    manage.add(invoice);
                    System.out.println("Hóa đơn đã được thêm thành công.");
                    break;
                case 2:
                    manage.display();
                    int idUpdate = InputData.getInt(scanner, "Nhập id hóa đơn cần sửa: ");
                    int indexUpdate = -1;
                    for (int i = 0; i < manage.invoices.size(); i++) {
                        if (manage.invoices.get(i).getId() == idUpdate) {
                            indexUpdate = i;
                            break;
                        }
                    }
                    if (indexUpdate == -1) {
                        System.out.println("Không tìm thấy hóa đơn nào có id = " + idUpdate);
                    }else {
                        String newInvoiceCode = InputData.getString(scanner, "Nhập mã hóa đơn mới: ");
                        double newAmount = InputData.getDouble(scanner, "Nhập số tiền mới: ");
                        manage.update(indexUpdate, new Invoice(idUpdate,newInvoiceCode, newAmount));
                        System.out.println("Hóa đơn đã được sửa thành công.");
                    }
                    break;
                case 3:
                    manage.display();
                    int deleteId = InputData.getInt(scanner, "Nhập id cần xóa");
                    int deleteIndex = -1;
                    for (int i = 0; i < manage.invoices.size(); i++) {
                        if (manage.invoices.get(i).getId() == deleteId) {
                            deleteIndex = i;
                            break;
                        }
                    }
                    if (deleteIndex == -1) {
                        System.out.println("Không tìm thấy hóa đơn nào có id = " +deleteId);
                    }else {
                        manage.delete(deleteIndex);
                        System.out.println("Hóa đơn đã được xóa thành công");
                    }
                    break;
                case 4:
                    manage.display();

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (true);
    }
}
