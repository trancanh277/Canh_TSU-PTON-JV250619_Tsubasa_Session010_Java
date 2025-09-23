package baitap06;

import java.util.Scanner;

public class baitap06 {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n*************** MENU QUẢN LÝ ĐƠN HÀNG ***************");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh mục danh sách đơn hàng");
            System.out.println("5. Thoát");


            choice = InputData.getInt(scanner, "Lựa chọn của bạn");
            switch (choice) {
                case 1:
                    String itemCode = InputData.getString(scanner, "Nhập mã đơn hàng");
                    String itemName = InputData.getString(scanner, "Nhập tên khach hàng");
                    Order order = new Order(itemCode, itemName);
                    manager.add(order);
                    System.out.println("Đã thêm đơn hàng");
                    break;
                case 2:
                    manager.display();

                    String itemCodeUpdate = InputData.getString(scanner, "Nhập mã đơn hàng cần sửa");
                    int indexUpdate = -1;
                    for (int i = 0; i < manager.orders.size(); i++) {
                        if (manager.orders.get(i).getItemCode().equals(itemCodeUpdate)) {
                            indexUpdate = i;
                            break;
                        }
                    }
                    if (indexUpdate == -1) {
                        System.out.println("Mã đơn hàng bạn nhập không có trong danh sách");
                    }else {
                        String newNameCode = InputData.getString(scanner, "Nhập tên khách hàng cần cập nhập");
                        manager.update(indexUpdate, new Order(itemCodeUpdate,newNameCode));
                        System.out.println("Đã cập nhâp thành công");
                    }

                    break;
                case 3:
                    manager.display();
                    String deleteItemCode = InputData.getString(scanner, "Nhập mã đơn hàng cần sửa");
                    int deleteIndex = -1;
                    for (int i = 0; i < manager.orders.size(); i++){
                        if (manager.orders.get(i).getItemCode().equals(deleteItemCode)){
                            deleteIndex = i;
                            break;
                        }
                    }if (deleteIndex == -1){
                    System.out.println("Mã đơn hàng bạn nhập không có trong danh sách");
                }else{
                        manager.delete(deleteIndex);
                    System.out.println("Mã đơn hàng đã được xóa thành công");
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
