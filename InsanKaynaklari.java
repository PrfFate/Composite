
import java.util.ArrayList;
import java.util.List;

public class InsanKaynaklari implements ICalisan {

    private String departmanAdi;
    private List<ICalisan> calisanListe;

    public InsanKaynaklari(String departmanAdi) {
        this.departmanAdi = departmanAdi;
        this.calisanListe = new ArrayList<>();
    }

    public void calisanEkle(ICalisan calisan) {
        calisanListe.add(calisan);
    }

    public void calisanCikar(ICalisan calisan) {
        calisanListe.remove(calisan);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("\nDepartman: " + departmanAdi);
        System.out.println("-".repeat(15));
        for (ICalisan calisan : calisanListe) {
            calisan.bilgiGoster();
        }
    }
}
