
public class Main {

    public static void main(String[] args) {
        Gelistirici gelistirici1 = new Gelistirici(234, "Gelistici1");
        Gelistirici gelistirici2 = new Gelistirici(345, "Gelistirici2");

        Tasarimci tasarimci1 = new Tasarimci(456, "Tasarimci1");
        Tasarimci tasarimci2 = new Tasarimci(567, "Tasarimci2");

        Yonetici yonetici = new Yonetici(123, "Ali Acar");

        InsanKaynaklari argeDepartmani = new InsanKaynaklari("AR-GE Departmanı");
        argeDepartmani.calisanEkle(yonetici);
        argeDepartmani.calisanEkle(gelistirici1);
        argeDepartmani.calisanEkle(tasarimci1);

        InsanKaynaklari itDepartmani = new InsanKaynaklari("IT Departmanı");
        itDepartmani.calisanEkle(yonetici);
        itDepartmani.calisanEkle(gelistirici2);
        itDepartmani.calisanEkle(tasarimci2);

        argeDepartmani.bilgiGoster();
        System.out.println();

        itDepartmani.bilgiGoster();
        System.out.println();
    }
}
