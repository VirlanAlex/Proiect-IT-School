package abstractizareInterfete;

public class RestaurantNonVegan extends Restaurant implements RestaurantNonVeganInterface{
    public RestaurantNonVegan(String nume, String adresa, int telefon) {
        super(nume, adresa, telefon);
    }

    @Override
    public void servesteBurger() {

    }

    @Override
    public void servesteShaorma() {

    }

    @Override
    public void servesteCostita() {

    }

    @Override
    public void servestePizza() {

    }
}
