package ClassMetCons;

import java.util.ArrayList;

public class Araba {
    public String model;
    public int yıl;
    public int guncelfiyat;

   public Araba(){

    }



    public Araba(String model, int yıl, int guncelfiyat){
       this.yıl=yıl;
       this.model=model;
       this.guncelfiyat=guncelfiyat;



    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }

    public int getGuncelfiyat() {
        return guncelfiyat;
    }

    public void setGuncelfiyat(int guncelfiyat) {
        this.guncelfiyat = guncelfiyat;
    }


    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", yıl=" + yıl +
                ", guncelfiyat=" + guncelfiyat +
                '}';
    }
}

