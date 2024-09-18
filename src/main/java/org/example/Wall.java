package org.example;

public class Wall {
    double width;
    double height;

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height){
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea(){
        return width*height;
    }


    //getWidth => width değerini dönmeli
    //getHeight => height değerini dönmeli.
    //setWidth => bir parametre almalı ve aldığı parametreyi width değerine eşitlemeli. Gelen parametre 0'dan küçükse, width değerini 0'a eşitlemeli.
    //setHeight => bir parametre almalı ve aldığı parametreyi height değerine eşitlemeli. Gelen parametre 0'dan küçükse, height değerini 0'a eşitlemeli.
    //getArea => hiçbir parametre almamalı ve width*height değerini dönmeli.

    public Wall(double width, double height){
        this.height = height;
        this.width = width;
    }
}
