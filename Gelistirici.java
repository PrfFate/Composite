
public class Gelistirici implements ICalisan {

    private int id;
    private String isim;

    public Gelistirici(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Gelistiricinin adi: " + isim + " ve id'si: " + id);
    }
}
