package Manusia;

public class Erectus extends Manusia {

    String negara;

    void negara() {
        System.out.print("Erectus \t: ");
        negara = manss.next();
        System.out.print("Negara \t:  ");
        negara = manss.next();
        
    }

    @Override
    void identitas() {
        System.out.print("Nama \t:   ");
        nama = manss.next();
        System.out.print("Temapt Tanggal Lahir \t :   ");
        tmpttgllhr = manss.next();
        System.out.print("Jenis Kelamin \t:   ");
        jeniskelamin = manss.next();
    }

    protected void ciriFisik() {
        System.out.print("Tinggi \t : ");
        tinggiBadan = manss.next();
        System.out.print("\nwarna kulit  :  ");
        warnaKulit = manss.next();
          System.out.print("\nBerat Badan  :  ");
        beratBadan = manss.next();
    }
}