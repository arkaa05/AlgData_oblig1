import java.util.NoSuchElementException;

/**
 * Obligatorisk oppgave 1 i Algoritmer og datastruktur
 * Armin Karadzic - s305045
 *
 */


public class Oblig1 {

    //Oppgave 1a
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom");
        }
        int maks = a[0];

        for (int i = 0; i < a.length; ++i) {
            if (a[i] > maks) {
                maks = a[i];
            }

        }
        return maks;
    }

    // Oppgave 2a
    public static int ombyttinger(int[] a) {


        if (a.length == 0)
            throw new NoSuchElementException("Tabellen er tom");
        int antall_ombyttinger = 0;


        for (int i = 1; i < a.length; ++i) {
            if (a[i - 1] > a[i]) {
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

        for (int i = 0; i < a.length; ++i) {
            if (a[i] >= x) {
                if (a[i] != x) {
                    antall++;
                }
                x = a[i];
            } else {
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

        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[j] == a[i]) {
                    antall--;
                    break;
                }
            }
        }
        return antall;
    }

    // Oppgave 4
    //Feil i oppgaven, fant ikke en annen metode som man kan gjøre det på
    // dette er ihvertfall en idé
    public static void delsortering(int[] a) {
        int oddnum = 0;
        int n = a.length;

        for (int k : a) {
            if ((k & 1) != 0) oddnum++;
        }

        for (int i = 0; i < n; i++) {
            if ((a[i] & 1) != 0) {
                for (int j = 0; j < n; j++) {
                    if ((a[j] & 1) == 0) {
                        switch (a,j, i)
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int from = i < oddnum ? 0 : oddnum;
            int to = i < oddnum ? oddnum - i : n - i + oddnum;
            int m = maxValue(a, from, to);
        }
        switch (a, m, to - 1);

    }

    // Oppgave 5

    public static void rotasjon(char[] a) {
        if (a.length < 2) {
            return;
        }
        char k = a[a.length - 1];
        for (int i = a.length - 1; i >= 1; --i) {
            a[i] = a[i - 1];
        }
        a[0] = k;
    }

    // Oppgave 6
    public static void rotasjon(char[] a, int k) {
        int n = a.length;

        if (n < 2) {
            return;
        }

        k %= n;
        char[] temp = new char[Math.abs(k)];
        int c = 0;

        //Høyre
        if (k > 0) {
            for (int i = n - k; i < n; ++i) {
                temp[c++] = a[i];
            }
            for (int i = n - k; i >= 0; --i) {
                a[k + i] = a[i];
                if (i < k) {
                    a[i] = temp[i];
                }
            }

            //Venstre

        } else if (k < 0) {
            k = Math.abs(k);

            for (int i = 0; i < k; ++i) {
                temp[i] = a[i];
            }

            for (int i = 0; i <= n - k - 1; ++i) {
                a[i] = a[k + i];
            }
            for (int i = 0; i < temp.length; ++i) {
                a[n - i - 1] = temp[k - i - 1];
            }
        }
    }

    // Oppgave 7a

    public static String flett(String s, String t) {
        char[] txt = new char[s.length() + t.length()];

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        int ac = 0;
        int bc = 0;
        int j = 0;

        for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
            if (ac < s.length()) {
                txt[j++] = a[ac++];
            }

            if (bc < t.length()) {
                txt[j++] = b[bc++];
            }

        }
        return String.valueOf(txt);

    }

    // Oppgave 7b

    public static String flett(String... s) {
        String r = "";
        int l = 0;
        for (String x : s) {
            l += x.length();
        }

        int[] c = new int[s.length];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < s.length; ++j) {
                if (c[j] < s[j].length()) {
                    r += s[j].toCharArray()[c[j]];
                    c[j]++;
                }
            }
        }
        return r;
    }

    //Oppgave 8

    public static int[] indekssortering(int[] a) {
        if (a.length < 3)
            throw new NoSuchElementException("Du må ha større tabell, denne er for liten");

        int[] indeks = {0, 1, 2};
        int min = a[0];
        int maks = a[0];

        for (int i = 0; i < 3; ++i) {
            if (a[i] <= min) {
                min = a[i];
                indeks[0] = i;
            }

            if (a[i] >= maks) {
                maks = a[i];
                indeks[2] = i;
            }
        }

        indeks[1] = Math.abs((indeks[0] + indeks[2]) - 3);
        return indeks;
    }

    // Oppgave 9
    public static int[] tredjeMin(int[] a) {
        int[] indeks = {0, 1, 2};
        int n = a.length;
        if (n < 2) throw
                new java.util.NoSuchElementException("Tabellen må ha minst lengde 3, feil");

        int m = indeks(a)[0];
        int nm = indeks(a)[1];
        int tm = indeks(a)[2];

        int minverdi = a[m];
        int nestminverdi = a[nm];
        int tredjeminverdi = a[tm];

        for (int i = 3; i < n; i++) {
            if (a[i] < tredjeminverdi) {
                if (a[i] < nestminverdi) {
                    if (a[i] < minverdi) {
                        tm = nm;
                        tredjeminverdi = a[nm];
                        nm = m;
                        nestminverdi = minverdi;
                        m = i;
                        minverdi = a[m];
                    } else {
                        tm = nm;
                        tredjeminverdi = a[tm];
                        nm = i;
                        nestminverdi = a[nm];
                    }
                } else {
                    tm = i;
                    tredjeminverdi = a[tm];

                }
            }
        }
        return new int[]{m, nm, tm};


    }

    private static int[] indeks(int[] a) {
        return new int[0];
    }


    // Oppgave 10

      public static boolean inneholdt(String a, String b) {
        int[] x = new int[250];
        int[] y = new int [250];

        for( char c : a.toCharArray()) x[c]++;
        for( char c : b.toCharArray()) y[c]++;

        for(int i = 0; i < x.length; ++i) {
            if(x[i] > 0) {
                if(y[i] < x[i]) {

                }
            }
        }
        return true;
      }
}


