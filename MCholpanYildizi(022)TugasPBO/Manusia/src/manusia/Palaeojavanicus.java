package Manusia;
import java.util.Scanner;
public class Palaeojavanicus extends Manusia {
    Scanner manss = new Scanner(System.in);
    String negara;
    void negara(){
        System.out.print("Palaeojavanicus \t: ");
        negara = manss.next();
        System.out.print("Negara \t:  ");
        negara = manss.next();   
        
}
    @Override
    void identitas(){
        System.out.print("Nama \t:   ");
        nama = manss.next();
        System.out.print("Tempat Tanggal Lahir \t:   ");
        tmpttgllhr = manss.next();
        System.out.print("Jenis Kelamin \t:   ");
        jeniskelamin = manss.next();
    }
     protected void ciriFisik(){
        System.out.print(" Tinggi \t : ");
        tinggiBadan = manss.next();
        System.out.print("\nwarna kulit  :  ");
        warnaKulit = manss.next();
        System.out.print("\nBerat Badan  :  ");
        beratBadan = manss.next();
   }
}
