public class Memur extends Calisan{
    private String department;

    public Memur(String adSoyad, String telefon, String ePosta, String department) {
        super(adSoyad, telefon, ePosta);
        this.department = department;
    }

    @Override
    public void giris(){
        System.out.println("Memur "+ this.adSoyad + " Giriş Yaptı!");
    }

    public void calis(){
        System.out.println("Çalışıyor!");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
