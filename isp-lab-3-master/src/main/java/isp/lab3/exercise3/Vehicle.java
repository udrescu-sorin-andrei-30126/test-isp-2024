package isp.lab3.exercise3;

public class Vehicle{
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static  int numbers=0;
    public static void getNumber(){
        System.out.println(numbers);
    }

    public Vehicle(String model,String type,int speed,char fuelType){
        this.model=model;
        this.type=type;
        this.speed=speed;
        this.fuelType=fuelType;
        numbers++;
    }

    //gettere
    public String getModel(){
        return this.model;

    }
    public String getType(){
        return this.type;
    }
    public int getSpeed(){
        return this.speed;
    }
    public char getFuelType(){
        return this.fuelType;
    }


    // settere
    public void setModel(String model){
        this.model=model;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setSpeed(int speed)
    {
        this.speed=speed;
    }

    public void setFuelType(char fuelType){
        this.fuelType=fuelType;
    }

    public String toString(){
        return this.getModel()+"("+this.getType()+")"+"speed"+this.getSpeed()+"fuelType"+this.getFuelType();
    }


    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Dacia","logan",300,'D');
        Vehicle v2=new Vehicle("BMW","X6",400,'D');
        System.out.println(v1.getModel()+" "+v1.getType()+" "+v1.getSpeed()+" "+v1.getFuelType());
        System.out.println("for the vehicle v2");
        System.out.println(v2.getModel()+" "+v2.getType()+" "+v2.getSpeed()+" "+v2.getFuelType());
        System.out.println(v1.equals(v2));
        System.out.println("the number of vehicles instanciated is:");
        getNumber();

    }

}