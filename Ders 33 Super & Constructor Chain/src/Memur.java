public class Memur extends Calisan{
    private String department;

    public Memur(String adSoyad, String telefon, String ePosta, String department) {
        super(adSoyad, telefon, ePosta);
        this.department = department;
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
