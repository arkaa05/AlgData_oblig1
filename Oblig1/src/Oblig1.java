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
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                antall_ombyttinger++;
            }
        }
        return antall_ombyttinger;
    }

    // Oppgave 2

    public static int antallUlikeSortert(int[] a) {
        //sjekker om a er sortert stigende
        int x = 0;
        int antall = 0;

        for (int i = 0; i < a.length; ++i){
            if (a[i] >= x) {
                if (a[i] != x){
                    antall ++;
                }
                x = a[i];
            }
            else {
                throw new IllegalStateException("Tabellen er ikke sortert stigende");
            }
        }
        //returnerer antall ulike verdier
        return antall;

    }

    // Oppgave 3

    public static int antallUlikeUsortert(int[] a) {
        if (a.length == 0) {
            return 0;
            // returnerer 0 hvis lengden av a == 0
        }
        int antall = a.length;

        for(int i = 0; i < a.length; ++i) {
            for(int j = i + 1; j < a.length; ++j){
                if(a[j] == a[i]) {
                    antall --;
                    break;
                }
            }
        }
        return antall;
    }

    

    public static void main(String[] args) {
        int a[] = {5, 3, 6, 8,-5};

        System.out.println(Oblig1.maks(a));
        System.out.println(Oblig1.ombyttinger(a));
    }

}
