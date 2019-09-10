import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1a
    public static int maks(int[] a) {
        int maks = a[0];

        for(int i = 0; i < a.length; ++i) {
            if (a[i] > maks) {
                maks = a[i];
            }
            else if(a.length == 0) {
                throw new NoSuchElementException("Tabellen er tom");
            }
        }
        return maks;
    }

    public static void main(String[] args) {
        int a[] = {};

        System.out.println(Oblig1.maks(a));
    }

}
