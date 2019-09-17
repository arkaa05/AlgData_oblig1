import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1a
    public static int maks(int[] a) {
        if(a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom");
        }
        int maks = a[0];

        for(int i = 0; i < a.length; ++i) {
            if (a[i] > maks) {
                maks = a[i];
            }

        }
        return maks;
    }

    // Oppgave 2a
    public static int ombyttinger(int[] a) {

        int antall_ombyttinger = 0;
        if (a.length == 0)
            throw new NoSuchElementException("Tabellen er tom");
        for(int i = 1; i < a.length; ++i) {
            if (a[i - 1] > a[i]){
                int maks = a[i - 1];
                a[i - 1] = a[i];
                a[i] = maks;
                antall_ombyttinger++;
            }
        }
        return antall_ombyttinger;
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 6, 8,-5};

        System.out.println(Oblig1.maks(a));
        System.out.println(Oblig1.ombyttinger(a));
    }

}
