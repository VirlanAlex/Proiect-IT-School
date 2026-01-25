package abstractizareInterfete;

public class RestaurantMixt extends Restaurant implements RestaurantNonVeganInterface,RestaurantVeganInterface{
    public RestaurantMixt(String nume, String adresa, int telefon) {
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
