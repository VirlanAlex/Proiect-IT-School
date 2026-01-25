package abstractizareInterfete;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInterface {
    public RestaurantVegan(String nume, String adresa, int telefon) {
        super(nume, adresa, telefon);
    }

    @Override
    public void servesteHumus() {

    }

    @Override
    public void servesteSalataVerde() {

    }

    @Override
    public void servesteSucAvocado() {

    }
}
