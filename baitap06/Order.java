package baitap06;

public class Order {
    private String itemCode;
    private String itemName;

    public Order() {
    }

    public Order(String itemCode, String itemName) {
        this.itemCode = itemCode;
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return
                "itemCode: " + itemCode  +
                ", itemName: " + itemName ;
    }
}
