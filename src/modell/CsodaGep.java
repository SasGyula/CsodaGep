package modell;

import java.util.Random;

public class CsodaGep {
    Random rn = new Random();
    String[] dalok;
    int [] lottoSzelveny = new int[5];
    String totoSzelveny;
    public CsodaGep(){
        this(new String[0]);
    }
    
    public CsodaGep(String dal){
        this(new String[]{dal});
    }
    
    public CsodaGep(String[] dalok){
        ujraindit();
        this.daltFelvesz(dalok);
    }
    
    public void ujraindit(){
        this.generalLottoSzelveny();
        this.generalTotoSzelveny();
        this.dallalFeltolt();
    }
    private void generalLottoSzelveny(){
        int db = 0;
        int v;
        while(db < this.lottoSzelveny.length){
            v = rn.nextInt(90);
            if(!benneVan(lottoSzelveny, v, db)){
                this.lottoSzelveny[db] = v;
                db++;
            }
        }
    }
    public String kerLottoSzelveny(){
        String lottoszamok = "";
        for (int i = 0; i < this.lottoSzelveny.length; i++) {
            lottoszamok += this.lottoSzelveny[i] + ", ";
        }
        return lottoszamok;
    }
    
    private void generalTotoSzelveny(){ 
        int randomSzam;
        for (int i = 0; i < 13; i++) {
            this.totoSzelveny += i+1 + " ";
        }
            this.totoSzelveny += "\n";
        for (int i = 0; i < 13; i++) {
            randomSzam = rn.nextInt(1,16);
            if(randomSzam >= 1 && randomSzam <=5){
              this.totoSzelveny += "1 ";  
            }
            else if(randomSzam >= 6 && randomSzam <=10){
               this.totoSzelveny += "x ";
            }
            else if(randomSzam >= 11 && randomSzam <=15){
              this.totoSzelveny += "2 ";
        }
    }
    }
    public String kerTotoSzelveny(){
        return this.totoSzelveny;
    }
    
    public String kerDal(){
        return this.dalok[rn.nextInt(dalok.length)];
    }
    
    public void ujDal(String dal){
        this.dalok[this.dalok.length] = dal;
    }

    private void dallalFeltolt() {
        this.dalok = new String[3];
        dalok[0] = "Hate being sober";
        dalok[1] = "Till futher notice"; 
        dalok[2] = "FEIN"; 
    }

    private void daltFelvesz(String[] dalok) {
        for (int i = 0; i < dalok.length; i++) {
            this.dalok[i] = dalok[i];
        }
    }
    private boolean benneVan (int[] t, int szam, int db){
        int i = 0;
        while(i < db && (t[i] == szam)){
            i++;
        }
        return i>0;
    }
}
