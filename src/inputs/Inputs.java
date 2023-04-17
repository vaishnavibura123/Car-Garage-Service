package inputs;

import Service.Garage;
import Vehicle.Vehicle;

import java.util.*;

public class Inputs {
    public void inputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type of car :");
        String car = sc.nextLine();
        if (car.equals("HatchBack")) {
            Vehicle hb = new Vehicle(2000, 5000, 2000, 1000, 3000);
            Garage.park(hb);
            System.out.println("Total Bill = Rs " + hb.cost());
            if (hb.cost() > 10000) {
                System.out.print("You got free cleaning Service");
            }
        } else if (car.equals("Sedan")) {
            Vehicle sd = new Vehicle(4000, 8000, 4000, 1500, 6000);
            Garage.park(sd);
            System.out.println("Total Bill = Rs " + sd.cost());
            if (sd.cost() > 10000) {
                System.out.print("You got free cleaning Service");
            }
        } else if (car.equals("SUV")) {
            Vehicle suv = new Vehicle(5000, 10000, 6000, 2500, 8000);
            Garage.park(suv);
            System.out.println("Total Bill = Rs " + suv.cost());
            if (suv.cost() > 10000) {
                System.out.print("You got free cleaning Service");
            }
        } else {
            System.out.print("Please enter valid input");
        }
    }
}

