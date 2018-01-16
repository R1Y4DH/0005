import java.util.Scanner;
public class Exercise_2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        double no1;
        double no2;
        double tmbh;
        double tlk;
        double drb;
        double bhg;
        
        System.out.println ("Nombor Pertama:");
            no1 = input.nextDouble();
        System.out.println ("Nombor Kedua:");
            no2 = input.nextDouble();
            
        tmbh = no1+no2;
        tlk = no1-no2;
        drb = no1*no2;
        bhg = no1/no2;
        
    System.out.println("Jumlah Tambah:" +tmbh);
    System.out.println("Jumlah Tolak:" +tlk);
    System.out.println("Jumlah Darab:" +drb);
    System.out.println("Jumlah Bahagi:" +bhg);
}
}