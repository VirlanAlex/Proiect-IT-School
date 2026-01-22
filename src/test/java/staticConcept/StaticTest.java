package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {
//avemcerinta sa prezentam toti elevii de la scoala Liviu Rebreanu

    @Test
    public void testMethod(){
        Elev alex = new Elev("Elev 1", "Elev1",10);
        Elev cristina = new Elev("Elev 2", "Elev2",11);
        Elev marius = new Elev("Elev 3", "Elev3",12);
        Elev ioan = new Elev("Elev 4", "Elev4",13);
        Elev oana = new Elev("Elev 5", "Elev5",14);

        alex.prezentareElev();
        System.out.println();

        cristina.prezentareElev();
        System.out.println();

        marius.prezentareElev();
        System.out.println();

        ioan.prezentareElev();
        System.out.println();

        oana.prezentareElev();
        System.out.println();

        oana.calculEcuson();
        Elev.infoElev();

    }
}
