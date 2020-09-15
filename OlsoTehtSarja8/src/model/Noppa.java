package model;

// Amir Dahina 12.2.2020
public class Noppa {
	
    private int sivulkm;
    
    private int heittojenlkm;
   
   
 
    public Noppa(int sivulkm) {
        super();
        this.sivulkm = sivulkm;
    }
 
    public int heitanoppaa() {
        sivulkm = 6;
        this.heittojenlkm++;
        return (int)(Math.random()*sivulkm)+1;
       
       
    }
    public int heitakolikko() {
        sivulkm = 2;
        this.heittojenlkm++;
        return (int)(Math.random()*sivulkm)+1;
       
       
    }
    public int getHeittojenLkm() {
        return heittojenlkm;
    }
  
}
