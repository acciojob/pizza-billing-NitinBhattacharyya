package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    private int cheese;
    private int bag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price=300;
            bill="Base Price Of The Pizza: 300\n";
        }
        else {
            price=400;
            bill="Base Price Of The Pizza: 400\n";
        }
        topping=0;
        cheese=0;
        bag=0;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheese+=80;
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
            topping+=70;
            price+=70;
        }
        else {
            topping+=120;
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        bag+=20;
        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill=bill+"Extra Cheese Added: "+cheese+"\n"+"Extra Toppings Added: "+topping+"\n";
        if(bag!=0)
        {
            bill=bill+"Paperbag Added: "+bag+"\n"+"Total Price: "+price;
        }
        else {
            bill=bill+"Total Price: "+price;
        }
        return this.bill;
    }
}
