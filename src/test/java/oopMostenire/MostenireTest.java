package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test

    public void metodaTest(){
        Angajat angajat = new Angajat("Popescu", "Andrei",30,"Luptei 40", "Emerson", 2500, "nedeterminat", 10);
        angajat.infoAngajat();
        System.out.println();

        System.out.println(angajat.getNume());

        angajat.setNume("Andrei");
        System.out.println(angajat.getNume());

        angajat.setVarsta(36);
        System.out.println(angajat.getVarsta());

//        Sportiv sportiv = new Sportiv("Dumitru", "Sebastian", 34, "Viitorului 10", "fotbal", true, 6);
//        sportiv.infoSportiv();
//
//        Student student = new Student("Robert", "Petrovici",35,"Electronicii 2", "Ion Mincu Timisoara","IT",2025,false);
//        student.infoStudent();
    }
}
