package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {
    @Test

    public void masinaTest(){
        Masina Dacia = new Masina("Dacia", "Sandero", 2020, "Rosu",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune","-Dezaburire parbriz"), false,10000);
        Dacia.prezentareMasina();
        Dacia.calculImpozit();
        System.out.println(" ");

        Masina Mercedes = new Masina("Mercedes", "C200",2015,"Gri",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune","-Dezaburire parbriz"), true,24000);
        Mercedes.prezentareMasina();
        Mercedes.calculImpozit();
        System.out.println();

        Masina Volvo = new Masina("Volvo", "XC90", 2025, "Negru",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune","-Dezaburire parbriz"),true, 28000);
        Volvo.prezentareMasina();
        Volvo.calculImpozit();

    }

}

//tema - sa nu apara pentru primele doua masini pretul final din moment ce nu au pret initial
