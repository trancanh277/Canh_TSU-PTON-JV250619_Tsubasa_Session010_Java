package baitap06;

import java.util.ArrayList;

public class OrderManager implements Manager<Order>{
public ArrayList<Order> orders;
public OrderManager() {
    orders = new ArrayList<>();
}
    @Override
    public void add(Order order) {
    orders.add(order);
    }

    @Override
    public void update(int index, Order order) {
    if (index >= 0 && index < orders.size()){
        orders.set(index, order);
    }
    }

    @Override
    public void delete(int index) {
    if(index >= 0 && index < orders.size()) {
        orders.remove(index);

    }
    }

    @Override
    public void display() {
    if(orders.isEmpty()){
        System.out.println("Chưa có sinh viên nào trong danh sách.");
    }
    else {
        for(Order o : orders) {
            System.out.println(o);
        }
    }
    }
}
