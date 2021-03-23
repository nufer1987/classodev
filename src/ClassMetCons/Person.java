package ClassMetCons;

import java.util.ArrayList;

public class Person {

    public String isim;
    public String soyisim;
    private int kno;

    public void setCocuk1(Cocuk cocuk1) {
        this.cocuk1 = cocuk1;
    }

    Cocuk cocuk1 = new Cocuk();
public ArrayList<Araba> arabas=new ArrayList<>();



    public Person(String isim, String soyisim, int kno, Cocuk cocuk, ArrayList<Araba> araba) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.kno = kno;
        this.cocuk1 = cocuk;
        this.arabas=araba;



    }

    public Person(String isim, String soyisim, int kno) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.kno = kno;

    }

    public Person(String isim, String soyisim, int kno,Cocuk cocuk) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.kno = kno;

    }

    @Override
    public String toString() {
        return "Person{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", kno=" + kno +
                ", cocuk1=" + cocuk1 +
                ", arabas=" + arabas +
                '}';
    }
}


