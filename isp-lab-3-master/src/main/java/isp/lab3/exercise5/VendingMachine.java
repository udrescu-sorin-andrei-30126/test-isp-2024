package isp.lab3.exercise5;

import java.util.ArrayList;
import java.util.Vector;

public class VendingMachine {
    ArrayList<String> availableProducts=new ArrayList<String>();

    int credit;

    public VendingMachine(ArrayList<String> availableProducts,int credit){
        this.availableProducts=availableProducts;
        this.credit=credit;
    }
    public void displayProducts(){
        for(int i=0;i<availableProducts.size();i++)
            System.out.println(availableProducts);

    }

    public void insertCoin(int value){
        this.credit=this.credit+value;
    }

    public String selectProduct(int id){
        String av=new String();
        for(int i=0;i<availableProducts.size();i++)
        {
            if(i==id){
                av=availableProducts.get(id);
                System.out.println(availableProducts.get(id));
            }
        }
        return av;
    }


    public void displayCredit(){
        System.out.println(this.credit);
    }

    public void userMenu(ArrayList<String> menu,int id,int value,int optiune){

        menu.add("selectProduct");
        menu.add("displayCredit");
        menu.add("displayProduct");
        menu.add("insertCoin");
        System.out.println("optiunea mea este"+optiune);
        if(optiune==0)
            System.out.println("selectproduct");
        else if(optiune==1)
            System.out.println("displaycredit");
        else if(optiune==2){
            System.out.println("displayproduct");

        }
        else if(optiune==3){
            System.out.println("insertcoin");
        }
        for(int i=0;i<menu.size();i++){
            if(i==0 && optiune==0){
                this.selectProduct(id);
                break;
            } else if (i==1 && optiune==1) {
                this.displayCredit();
                break;

            } else if (i==2 && optiune==2) {
                this.displayProducts();
                break;
            } else if (i==3 && optiune==3) {
                this.insertCoin(value);
                this.displayCredit();
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String > availableProducts=new ArrayList<>();
                int credit=50;
        VendingMachine v1=new VendingMachine(availableProducts,credit);

        System.out.println("initial credit is:");
        v1.displayCredit();
        System.out.println("after insterning coins the credit is");
        v1.insertCoin(100);
        v1.displayCredit();
        ArrayList<String > menu=new ArrayList<>();
        v1.userMenu(menu,1,100,3);
    }


}
