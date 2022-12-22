package com.driver;
public class Pizza {

    private int price;
    private boolean takeAway;
    private int takePrice;
    private Boolean isVeg;
    private String bill;
    private boolean cheese=false;
    private int cheesePrice;
    private boolean toppings=false;
    private int toppingsPrice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.bill = "Base Price Of The Pizza: 300 \n";
            this.price += 300;
        }
        else{
            this.bill = "Base Price Of The Pizza: 400 \n";
            this.price += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.cheese = true;
        this.cheesePrice+=80;
        this.price += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        this.toppings = true;
        if(this.isVeg){
            this.price+= 70;
            this.toppingsPrice+=70;
        }
        else{
            this.price+= 120;
            this.toppingsPrice+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.takeAway=true;
        this.takePrice+=20;
        this.price+=20;
    }

    public String getBill(){
        // your code goes here
        if(this.cheese){
            this.bill+="Extra Cheese Added: "+this.cheesePrice +"\n";
        }
        if(this.toppings){
            this.bill+="Extra Toppings Added: "+this.toppingsPrice +"\n";
        }
        if(this.takeAway){
            this.bill+="Paperbag Added: "+this.takePrice+"\n";
        }
        this.bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
}
