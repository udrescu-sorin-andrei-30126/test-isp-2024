package isp.lab3.exercise2;

public class Exercise2 {
}
class Rectangle{
    private int length=2;
    private int width=1;
    private String color="Red";

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(int length,int width,String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }

    public int getLength(){

        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public String getColor(){
        return this.color;
    }

    public int getPeremeter(){
        return this.length+this.width;
    }
    public int getArea(){
        return this.length*this.width;
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(20,30,"Blue");
        System.out.println("the length is:"+r1.getLength());
        System.out.println("the width is"+r1.getWidth());
        System.out.println("the color is:"+r1.getColor());
        System.out.println("the peremeter is:"+r1.getPeremeter());
        System.out.println("the area is:"+r1.getArea());
    }
}