package Vehicle;
public class Vehicle{
    int BS01,EF01,CF01,BF01,GF01;
    public Vehicle(int BS01,int EF01,int CF01,int BF01,int GF01){
        this.BS01=BS01;
        this.EF01=EF01;
        this.CF01=CF01;
        this.BF01=BF01;
        this.GF01=GF01;
    }
    int sum=0;
    public void BS01(){
        System.out.println("Charges for Basic Servicing = Rs "+BS01);
        sum+=BS01;
    }
    public void EF01(){
        System.out.println("Charges for Engine Fixing = Rs "+EF01);
        sum+=EF01;
    }
    public void CF01(){
        System.out.println("Charges for Clutch Fixing = Rs "+CF01);
        sum+=CF01;
    }
    public void BF01(){
        System.out.println("Charges for Brake Fixing = Rs "+BF01);
        sum+=BF01;
    }
    public void GF01(){
        System.out.println("Charges for Gear Fixing = Rs "+GF01);
        sum+=GF01;
    }
    public int cost(){
        return sum;
    }
}
