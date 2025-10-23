package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //O clasa este un sablon care defineste compartamentul unei entitati din viata reala
    //Intr-un fisier Java recunoastem o clasa dupa cuvantul cheie class
    //O clasa este obligatoriu sa aiba un nume
    //O clasa contine variabile si metode
    //O variabila este proprietatea unei clase
    //O variabila poate fi de 2 feluri: globala si locala
    //Globala = o variabila pe care o declaram la inceputul clasei si este vizibila in tot fisierul
    //Locala = o variabila pe care o declaram in interiorul unei metode si este vizibila doar acolo
    //O variabila globala trebuie sa contina un access control (public), tip de data si un nume
    //O variabila nu trebuie sa contina intodeauna o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //O metoda este actiunea unei clase
    //O clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //Metodele pot fi de 2 feluri: void si return
    //O metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //O metoda cu void trebuie sa contina 'access control' (public), cuvantul cheie 'void', numele metodei () si {}
    @Test
    public void prezentareStudent() {

        nume = "Virlan";
        prenume = "Alexandru Ionut";
        varsta = 38;
        inaltime = 1.82;
        greutate = 98;
        adresa = "Aleea Tranndafirilor";
        sex = 'M';
        areRestante = true;
        //selectare tot text: ctrl+A
        //alinire cod: ctrl+alt+l

//        System.out.print(nume+" "+prenume+" "+varsta+" "+inaltime+" "+adresa+" "+sex+" "+areRestante+" ");
//        System.out.print(prenume+" ");
//        System.out.print(varsta+" ");
//        System.out.print(inaltime+" ");
//        System.out.print(greutate+" ");
//        System.out.print(adresa+" ");
//        System.out.print(sex+" ");
//        System.out.print(areRestante+" ");

        //Concatenarea este lipirea a unuia sau mai multor stringuri si lipirea se face cu "+" si spatiu intre

        System.out.println("numele studentului este "+nume);
        System.out.println("prenumele studentului este "+prenume);
        System.out.println("varsta studentului este "+varsta);
        System.out.println("inaltimea studentului este "+inaltime);
        System.out.println("greutatea studentului este "+greutate);
        System.out.println("adresa studentului este "+adresa);
        System.out.println("sexul studentului este "+sex);
        System.out.println("are studentul restante? este "+areRestante);

        //'Print' inseamna ca afiseaza valoarea ce ramane pe randul curent
        //'Println' inseamna ca afiseaza valoarea si sare la randul urmator
    }
}
