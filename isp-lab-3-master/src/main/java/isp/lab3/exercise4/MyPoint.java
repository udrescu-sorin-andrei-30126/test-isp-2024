package isp.lab3.exercise4;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyPoint {
    int x;
    int y;
    int z;
    public MyPoint(){
        this.x=0;
        this.y=0;
        this.z=0;
        
    }

    public MyPoint(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
    //getters

    public int getX(){
        return this.x;

    }
    public int getY(){
        return this.y;

    }
    public int getZ(){
        return this.z;

    }
    

    //setters
    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }
    public void setZ(int z){
        this.z=z;
    }
    
    public void setXYZ(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    
    public String toString(){
        return "("+this.x+","+this.y+","+this.z+")";
    }
    
    public double distance(int x,int y,int z){
        return sqrt(pow((this.x-x),2)+pow((this.y-y),2)+pow((this.z-z),2));
    }

    public double distance(MyPoint mypoint){
        return sqrt(pow((this.x-mypoint.x),2)+pow((this.y-mypoint.y),2)+pow((this.z-mypoint.z),2));
    }


    public static void main(String[] args) {
        MyPoint p1=new MyPoint(1,2,3);
        MyPoint p2=new MyPoint(10,20,30);
        System.out.println(p1.distance(p2));
    }
    
    
    
    
    
    
}
