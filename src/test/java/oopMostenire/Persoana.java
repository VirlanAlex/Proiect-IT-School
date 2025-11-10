package oopMostenire;

public class Persoana {

//    OOP = programare orienta pe obiecte
//    Cele 4 principii de baza sunt: mostenire, abstractizare, incapsulare, polimorfism
//    Mostinrea - reprezinta conceputl prin care o clasa copil mosteneste o clasa parinte
//    Prin mostenire clasa copil preia toate atributele si metodele clasei parinte
//    In momentul in care o clasa copil mosteneste o clasa parinte, cosntructorul clasei copil trebuie sa apeleze cosntructorul din clasa parinte
//    Acest lucru se realizeaza folosing keword-ul "super"
//    Mostenirea se declada la nivel de clasa folositn heyword-ul "extends"
//    In Java o clasa poate mosteni doar o singura alta clasa ( mostenire unica )

//  Polimofrismul este conceptul prin care o metoda poate avea implementari diferite.
//  Polimorfismul este de 2 feluri: - STATIC ( overload ) / - DINAMIC ( override )
//  Dinamic - intr-o ierarhie de clasa este obtinut prin mostenire; o metoda poate avea implementari diferite
//  Polimorfismul dinamic se regaseste doar atunci cand exista mosteniri;

    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public  void  infoPersoana(){
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + varsta);
        System.out.println("Adresa persoanei este " + adresa);
    }

//    Polimorfism DINAMIC
    public void mananca(){
        System.out.println("Persoana mananca atunci cand ii este foame");
    }

    //-getter- Ne da valoarea proprietatii;
    // -setter- Modifica valoarea proprietatii;
    //Recomandarea ar fi intotdeauna ar fii sa pornim cu private;
    //pentru a proteja datele, apoi expunem doar ce e nevoie si cat e nevoie;
    //-getter- Se face tot timpul pentru a putea citi valorile;
    //-setter- Trebuie sa ne gandim daca face sens sa fie modificat;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}