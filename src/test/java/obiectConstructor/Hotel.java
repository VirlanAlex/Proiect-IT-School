package obiectConstructor;

import java.util.List;

public class Hotel {

    public String nume;
    public String adresa;
    public String oras;
    public String tara;
    public int numarStele;
    public List<String> facilitati;

    public Hotel(String nume, String adresa, String oras, String tara, List<String> facilitati, int stele) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = oras;
        this.tara = tara;
        this.numarStele = stele;
        this.facilitati = facilitati;
    }

    public void prezentareHotel() {
        System.out.println("Numele hotelului este: " + nume);
        System.out.println("Adresa hotelului este: " + adresa);
        System.out.println("Orasul unde este situat hotelul: " + oras);
        System.out.println("Tara unde este situat hotelul este: " + tara);
        System.out.println("Facilitatile hotelului sunt: ");
        System.out.println("Numar stele: " +numarStele);
        for (int index = 0; index < facilitati.size(); index++) {
            System.out.println(facilitati.get(index));
        }

    }

    public void calculeazaPretCamera() {
        int pret;

        switch (numarStele) {
            case 1:
                pret = 100;
                break;
            case 2:
                pret = 200;
                break;
            case 3:
                pret = 300;
                break;
            default:
                System.out.println("Clasificare necunoscuta, nu se poate calcula pretul.");
                return;
        }

        System.out.println("Pretul camerei pentru hotelul " + nume + " este: " + pret + " RON/noapte");
        System.out.println();
    }
}
