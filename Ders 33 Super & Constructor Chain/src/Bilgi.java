public class Bilgi extends Memur{
    private String gorev;

    public Bilgi(String adSoyad, String telefon, String ePosta, String department, String gorev) {
        super(adSoyad, telefon, ePosta, department);
        this.gorev = gorev;
    }

    public void tarama(){
        System.out.println("Tarama yapılıyor!");
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
