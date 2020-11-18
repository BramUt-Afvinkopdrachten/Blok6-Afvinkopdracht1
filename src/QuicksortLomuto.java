import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class QuicksortLomuto {

    public static void main(String[] args) {
        int n = 1_000_000;

        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < n; i++) {
            list.add(rd.nextInt());
        }
        System.out.println(list.toString());
        long startTime = System.currentTimeMillis();
        quicksort(list, 0, list.size() - 1);
        System.out.println(list.toString());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime + " milliseconds");
    }


    public static void quicksort(ArrayList<Integer> list, int low, int high){
        if (low < high) {
            int p = partition(list, low, high);
            quicksort(list, low, p - 1);
            quicksort(list, p + 1, high);
        }
    }

    public static int partition(ArrayList<Integer> list, int low, int high){
        int pivot = list.get(high);
        int i = low;
        for (int j = low; j <= high; j++) {
            if (list.get(j) < pivot) {
                Collections.swap(list, i, j);
                i++;
            }
        }
        Collections.swap(list, i, high);
        return i;
    }
}
