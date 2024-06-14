package com.hosanna.TrainingMug;

public class SwitchStatement {
    public static void main(String[] args) {
        String brand;
        brand = " Sumsung ";
        int productPrice;
        productPrice = 300000;
        int discount;
        int discountPercentage;
        discountPercentage = 1;
        char membership;
        membership = 'B';
        switch (brand) {
            case  " Apple ":
                if (membership == 'D') {
                    discountPercentage = 20;
                } else if (membership == 'G') {
                    discountPercentage = 15;
                } else if (membership == 'S') {
                    discountPercentage = 10;
                } else {
                    discountPercentage = 5;
                }
                break;
            case " Sumsung " :
                if( membership == 'D'){
                    discountPercentage = 30;
                } else if (membership == 'G') {
                    discountPercentage = 25;
                } else if (membership == 'S') {
                    discountPercentage = 20;
                } else {
                    discountPercentage = 15;
                }
                break;
            default :
                discountPercentage = 10;

        }
        System.out.println( discountPercentage);
        discount = productPrice * discountPercentage / 100;
        System.out.println("Discount  : $ " + discount);
        System.out.println("Final Amount : $ " + (productPrice - discount));

    }
}
