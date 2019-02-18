import java.util.Arrays;
import java.util.Scanner;

class Calc {


    Scanner scanner = new Scanner(System.in);

    int sizeOfArray() {
        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();
        return size;
    }

    int howManyParts() {
        System.out.println("Na ile czesci podzielic tablice ?");
        int size = scanner.nextInt();
        return size;
    }


    int[] addelementsIntoArray() {
        int size = sizeOfArray();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj kolejny element nr " + (i+1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }


    int[] devideArray(int[] tab, int n) {
        if (tab == null) {
            throw new NullPointerException();
        }
        if (n > tab.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] devideTab = new int[n];
        int division = 0;

        if (tab.length % n == 0) {
            division = tab.length / n;
            valInNewArray(tab, devideTab, division);
        } else {
            int addedValue = 0;
            while ((tab.length + addedValue) % n != 0) {
                addedValue++;
            }
            division = (tab.length + addedValue) / n;
            valInNewArray(tab, devideTab, division);
        }
        return devideTab;
    }


    void valInNewArray(int[] tab, int[] tabTemp, int dev) {
        int n = 0;
        for (int i = 0; i < tab.length; i++) {
            if (i > 0 && i % dev == 0)
                n++;
            tabTemp[n] += tab[i];
        }
        System.out.println(Arrays.toString(tabTemp));
    }
}
