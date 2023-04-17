package Service;

import Vehicle.Vehicle;

import java.util.Scanner;

public class Garage{
    public static void park(Vehicle car){
        Scanner sc=new Scanner(System.in);
        System.out.print("Service codes with space separated: ");
        String services=sc.nextLine();
        String code[]=services.split("[ ]+");
        for(int i=0;i<code.length;i++){
            if(code[i].equals("BS01")){
                car.BS01();
            }
            else if(code[i].equals("EF01")){
                car.EF01();
            }
            else if(code[i].equals("CF01")){
                car.CF01();
            }
            else if(code[i].equals("BF01")){
                car.BF01();
            }
            else if(code[i].equals("GF01")){
                car.GF01();
            }
            else{
                System.out.print("Please enter valid code");
            }
        }
    }
}
