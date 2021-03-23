public class Guvenlik extends Memur{
    private String belge;

    public Guvenlik(String adSoyad, String telefon, String ePosta, String department, String belge) {
        super(adSoyad, telefon, ePosta, department);
        this.belge = belge;
    }


    public void nobet(){
        System.out.println("Nöbet Tutuluyor!");
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
}
