package arraylista;

import java.util.ArrayList;

public class ArrayLista {

    public static void main(String[] args) {

//        int int1 = 15; 
//        int int2 = 95; 
//        // Interi
//        String s = String.format("Valore %1$5d° = %d | Valore %d° = %d | Numero a caso: %d",1,int1,2,int2, 5);
//        System.out.println(s);
        // Double 
//        double d1 = 15.123456789; 
//        double d2 = 95.123456789;
//        
//        String s = String.format("Il primo numero è: %10.12f" + " | l'altro è: %10f",d1,d2);
//        System.out.println(s);
//
//    double d1 = 123456789.12345;
//    double d2 = 123456789.12345;
//            String s = String.format("Il primo numero è: %,.3f" + " | l'altro è: %,.5g",d1,d2);
//            System.out.println(s);
        // Stringhe
//    String str = "1234567890123456789";
//    String s = String.format("%10s",str);
//    System.out.println(s);
        // MATRICI 
//        int[][] matrice = new int[2][3];
//
//        matrice[0][0] = 11;
//        matrice[0][1] = 12;
//        matrice[0][2] = 21;
//
//        matrice[1][0] = 12;
//        matrice[1][1] = 22;
//        matrice[1][5] = 31;
//
//        // MATRICI RAGGED 
////        int [] [] matriceRagged = new int [2][];
////        matriceRagged [0] = new int [10];
////        matriceRagged [0][1]= 12;
////        matriceRagged [0][2] = 21;
////        
////        matriceRagged[1] = new int [20];
////        matriceRagged [1][1]= 22;
////        matriceRagged [1][5] = 31;
//
//        int[] riga = matrice[0];
//        riga[1] = 999;
//
//        for (int e : riga) {
//            System.out.println(e);
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                System.out.print(String.format("%10d", matrice[i][j]));
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
        // CUBO DI RUBIK
//        Colori [][][][] rubik = new Colori [3][3][3][3];
//        
//        rubik [0][0][0] = new Colori[3];
//        rubik [0][0][0][0] = Colori.giallo;
//        rubik [0][0][0][1] = Colori.verde;
//        rubik [0][0][0][2] = Colori.rosso;
//        
//        rubik [0][0][1] = new Colori [2];
//        rubik [0][0][1][0] = Colori.verde;
//        rubik [0][0][1][1] = Colori.rosso;
//        // CLASSE ARRAY
//        int[] v = {2, 1, 3, 4, 5, 8, 7, 9, 10, 11, 12};
//        System.out.println(Arrays.toString(v));
////        Arrays.sort(v);
//        int pos = Arrays.binarySearch(v, 2);
//         
//        int [] v2 = Arrays.copyOf(v,5);
//        int [] v3 = v;
//        
//        v3[3] = 0;
//        
//        
//        System.out.println(Arrays.toString(v2));
//        
//        System.out.println(pos + 1);
//        System.out.println(Arrays.toString(v));
//
//        
        // USO CLASSE ARRAYLIST 
//        int[] v1 = {10, 20, 30, 40, 50, 70};
//
//        ArrayList lista = new ArrayList();
//        for (int i = 0; i < 10; i++) {
//            lista.add(11 * i);
//        }
//        lista.add(1, 5);
//        lista.remove(4);
//        lista.add(0, 3.2);
//        lista.add(1, "Siamo in tanti");
//        System.out.println(lista.indexOf(44));
//        System.out.println(lista);
//        lista.set(1, 111);
//        System.out.println(lista);
//        System.out.println(lista.size());
//
//        System.out.println("Stampa");
        Anagrafica.test();
    }

}

class Anagrafica {

    private String comune;
    private String nominativo;
    private SimpleDate nascita;

    public Anagrafica() {
        comune = "Rovereto";
        nominativo = "Michele";
        nascita = new SimpleDate();
    }

    public Anagrafica(String c, String n, String d) {
        comune = c;
        nominativo = n;
        nascita = new SimpleDate(d);
    }

    public boolean equals(Anagrafica other) {
        return ((this.nominativo.toLowerCase() == null ? other.nominativo.toLowerCase()
                == null : this.nominativo.toLowerCase().equals(other.nominativo.toLowerCase()))
                && (this.nascita == null ? other.nascita == null : this.nascita.equals(other.nascita)));

    }

//    public int compareTo(Anagrafica other) {
//        if (this.equals(other)) {
//            return 0;
//        }
//        if (this.nominativo.toLowerCase() == null ? other.nominativo.toLowerCase()
//                == null : this.nominativo.toLowerCase().equals(other.nominativo.toLowerCase())) {
//            if (nascita.before(other.nascita)) {
//                return -1;
//            } else {
//                return 1;
//            }
//        } else {
//            return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());
//        }
//    }
    public int compareTo(Anagrafica other) {
        if (nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase()) == 0) {
            if (nascita.before(other.nascita)) {
                return -1;
            } else {
                return 1;
            }
        }
        return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());
    }
    @Override
    public String toString(){
        return nominativo + "-" + nascita + "-" + comune;
    }
    public static void test() {
        Anagrafica a1 = new Anagrafica("Rovereto", "Michele Di Palma","10/10/1940");
        Anagrafica a2 = new Anagrafica("Reggio E.", "Giorgiovanni","11/12/1960");
         Anagrafica a3 = new Anagrafica("Reggio E.", "Pippo Baudo","11/02/1990");
         ArrayList lista = new ArrayList(); 
         lista.add(a1);
         lista.add(a2);
         lista.add(a3);
         System.out.println(lista);
//        System.out.println(a1.compareTo(a2));
         lista.remove(a2);
         System.out.println(lista);
         
    }

}

//    enum Colori {
//        giallo, verde, blu, rosso, bianco, arancione; 
//    }
