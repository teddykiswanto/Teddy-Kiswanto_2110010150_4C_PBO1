package pbo;

//inheritance
public class pemasarandetail extends pemasaran {
    //overriding
    public pemasarandetail(String merek, String tipe) {
        super(merek, tipe);
    }
    
  public int getTahunDibuat(){
      return Integer.parseInt(getTipe().substring(0, 2)) + 1900;
  }  
  
  public String getHakmilik(){
      String kodehak = getTipe().substring(2, 4);
      //seleksi if
      if(kodehak.equals("04")){
          return "pribadi";
      }else {
          return "pribadi";
      } 
  }
  public String getWarna(){
      String kodewarna = getTipe().substring(4, 6);
      //seleksi witch
      switch(kodewarna){
              case "01":
                return "merah";
              case "02":
                return "biru";
              default:
                return "warna lain";
        }
    }
  public int getNoSeri (){
      return Integer.parseInt(getTipe().substring(6));
  }
  
  //polymorphism
    @Override
  public String displayInfo(){
    return super.displayInfo()+
            "\nTahun Dibuat: "+getTahunDibuat()+
            "\nHak Milik: "+getHakmilik()+
            "\nWarna: "+getWarna()+
            "\nNo Seri: "+getNoSeri();
  }
}
