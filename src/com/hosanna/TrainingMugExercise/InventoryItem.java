package com.hosanna.TrainingMugExercise;

public class InventoryItem {
    String itemName;
    int itemCode;
    byte quantytInStock;
    int price;

    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem();
        item1.itemName = "Laptop";
        item1.itemCode = 1213;
        item1.quantytInStock = 2;
        item1.price = 54050;
        System.out.println("Item Name :" + item1.itemName + "\n" + "Item Code :" + "\n" + "Quantity :" + item1.quantytInStock + "\n" + "Price :" + item1.price);
        System.out.println();

        InventoryItem item2 = new InventoryItem();
        item2.itemName = "Apple";
        item2.itemCode = 1210;
        item2.quantytInStock = 1;
        item2.price = 109999;
        System.out.println("Item Name :" + item2.itemName + "\n" + "Item Code :" + item2.itemCode + "\n" + "Quantity :" + item2.quantytInStock + "\n" + "Price :" + item2.price);

    }
}
