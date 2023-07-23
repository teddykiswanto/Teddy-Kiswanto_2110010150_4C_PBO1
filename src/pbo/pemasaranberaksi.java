package pbo;

import java.util.Scanner;

public class pemasaranberaksi {
    public static void main(String[] args) {
        //objek
        //pemasaran pmsrn = new pemasaran("honda","4804010201");
        
        //System.out.println(pmsrn.displayInfo());
        //System.out.println(pmsrn.displayInfo("merah"));
        
        //io 
        Scanner scanner = new Scanner(System.in);
        
        //array
       pemasarandetail[] pmsrn = new pemasarandetail[2];
        
        System.out.print("Masukkan Merek Kendaraan:");
        String merek = scanner.nextLine();
        
        System.out.println("Masukkan Kode Kendaraan");
        String tipe = scanner.nextLine();
        
        pmsrn[0]=new pemasarandetail(merek, tipe);
        
        System.out.print(pmsrn[0].displayInfo());
        
    }
 
}
