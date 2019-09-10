import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oblig1Test {

    @Test
    void maks() {
        int antallFeil = 0;

        boolean unntak = false;
        int[] tom = {};
        try {
            Oblig1.maks(tom);  // kaller maks-metoden
        } catch (Exception e) {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException)) {
                System.out.println("Opgave 1: a) Feil unntak for en tom tabell!");
                antallFeil++;
            }
        }
    }
}