public class Akademisyen extends Calisan{
    private String bolum, gorev;

    public Akademisyen(String adSoyad, String telefon, String ePosta,
                       String bolum, String gorev) {
        super(adSoyad, telefon, ePosta);
        this.bolum = bolum;
        this.gorev = gorev;
    }

    public void derseGir(){
        System.out.println("Derse Girildi!");
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
