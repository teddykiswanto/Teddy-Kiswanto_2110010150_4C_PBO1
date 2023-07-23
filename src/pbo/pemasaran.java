package pbo;

public class pemasaran {
    //atribut
    private String merek;
    private String tipe;

    //constructor
    public pemasaran(String merek, String tipe) {
        this.merek = merek;
        this.tipe = tipe;
    }
    
    //mutator
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    //accessor
    public String getMerek() {
        return merek;
    }

    public String getTipe() {
        return tipe;
    }
    
    public String displayInfo(){
        return "merek: "+getMerek()+"\ntipe: "+getTipe();
    }
    //polymophism
    public String displayInfo(String warna){
        return displayInfo() + "\nwarna: "+warna;
    }
}
