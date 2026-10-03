import java.util.Scanner;
public class WasteCollection3b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammount of Waste collected : ");
        double Wastecollected = sc.nextDouble();
        if (Wastecollected>=100){
            System.out.println("Collection limit achieved");

        }else{
            System.out.println("Collect more waste");
        }
        sc.close();
    }
}