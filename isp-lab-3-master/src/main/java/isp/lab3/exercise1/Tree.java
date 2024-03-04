package isp.lab3.exercise1;

public class Tree {
    private int height;
    public Tree()
    {
        this.height=15;
    }
    public void grow(int meters){
        if(meters >=1)
            this.height+=meters;
        else {
            System.out.println("Meters given are not more and equal than one");
        }
    }
    public String toString()
    {
        return ("This height is"+this.height );
    }
    public int getHeight(){
        return this.height;
    }


}
