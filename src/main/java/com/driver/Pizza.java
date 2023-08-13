package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean topping;
    private boolean cheese;
    private boolean bag;

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
        topping=false;
        cheese=false;
        bag=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheese=true;
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
            topping=true;
            price+=70;
        }
        else {
            topping=true;
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        bag=true;
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if(cheese)
        {
            bill=bill+"Extra Cheese Added: "+80+"\n";
        }
        if(isVeg && topping)
        {
            bill=bill+"Extra Toppings Added: "+70+"\n";
        }
        else if(!isVeg && topping)
        {
            bill=bill+"Extra Toppings Added: "+120+"\n";
        }
        if(bag)
        {
            bill=bill+"Paperbag Added: "+20+"\n";
        }
        bill=bill+"Total Price: "+price+"\n";
        return this.bill;
    }
}
