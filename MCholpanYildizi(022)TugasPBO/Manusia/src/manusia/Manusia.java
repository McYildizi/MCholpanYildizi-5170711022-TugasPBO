package Manusia;
import java.util.Scanner;
public class Manusia {
    Scanner manss = new Scanner(System.in);
    String nama, tmpttgllhr,jeniskelamin,tinggiBadan,warnaKulit,beratBadan;
    void identitas(){
        System.out.print("Nama \t:   ");
        nama = manss.next();
       System.out.print("Temapt Tanggal Lahir \t:   ");
        tmpttgllhr = manss.next();
        System.out.print("Jenis Kelamin \t:   ");
        jeniskelamin = manss.next();
    }
    protected void ciriFisik(){
        System.out.print(" Tinggi \t : ");
        tinggiBadan = manss.next();
        System.out.print("warna kulit  :  ");
        warnaKulit = manss.next();
        System.out.print("\nBerat Badan  :  ");
        beratBadan = manss.next();
    }
}
