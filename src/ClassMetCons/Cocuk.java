package ClassMetCons;

public class Cocuk {
    public String isim;
    public String sİsim;
    public int yas;
    public boolean ogrenciMi;




    public Cocuk() {

    }

//    Cocuk cocuk1=new Cocuk("ali","sımsek",11,true);
//    Cocuk cocuk2=new Cocuk("veli","yıld",12,true);
//    Cocuk cocuk3=new Cocuk("ahmet","fırtına",13,false);

    public Cocuk(String isim, String sisim, int yas, boolean ogrenciMi){

        this.isim=isim;
        this.sİsim=sisim;
        this.yas=yas;
        this.ogrenciMi=ogrenciMi;


    }
    public int getYas() {
        return yas;
    }



    public void setYas(int yas) {

        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getsİsim() {
        return sİsim;
    }

    public void setsİsim(String sİsim) {
        this.sİsim = sİsim;
    }

    public boolean isOgrenciMi() {
        return ogrenciMi;
    }

    public void setOgrenciMi(boolean ogrenciMi) {
        this.ogrenciMi = ogrenciMi;
    }

    @Override
    public String toString() {
        return "Cocuk{" +
                "isim='" + isim + '\'' +
                ", sİsim='" + sİsim + '\'' +
                ", yas=" + yas +
                ", ogrenciMi=" + ogrenciMi +
                '}';
    }

}
