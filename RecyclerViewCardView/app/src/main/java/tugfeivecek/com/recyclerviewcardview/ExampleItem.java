package tugfeivecek.com.recyclerviewcardview;

public class ExampleItem {
    private int imageResource;
    private String baslik;
    private String aciklama;

    public ExampleItem(int imageResource, String baslik, String aciklama) {
        this.imageResource = imageResource;
        this.baslik = baslik;
        this.aciklama = aciklama;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
