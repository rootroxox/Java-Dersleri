public class Asistan extends Akademisyen{
    private String yuksekLisans;

    public Asistan(String adSoyad, String telefon, String ePosta, String bolum,
                   String gorev, String yuksekLisans) {
        super(adSoyad, telefon, ePosta, bolum, gorev);
        this.yuksekLisans = yuksekLisans;
    }

    public void lablaraGir(){
        System.out.println("Lab'a Girildi!");
    }

    public void quizleriOku(){
        System.out.println("Quizler Okundu!");
    }

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }
}
