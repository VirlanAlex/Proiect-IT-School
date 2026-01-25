package polimorfism;

import org.testng.annotations.Test;

public class PolimorfismTest {

    @Test
    public void testMethod(){
        Masina masina = new Masina("Audi", "A3",2025);
        masina.pornesteAutomobil();
        masina.aplicareReducere();
        masina.aplicareReducere(30);
        masina.aplicareReducere("cupon de pensie");

        Trotineta trotineta = new Trotineta("Xiaomi","Mi2",2024);
        trotineta.pornesteAutomobil();
    }
}
