import java.util.Arrays;

public class Javasort {

    public static void main(String[] args) {

        int[] noSort = new int[]{7, 5, 8, 2, 1, 3, 9, 4, 6, 7, 2};

        boolean isSorted = false;
        int change;

        while (!isSorted) { // т.к. не знаем, сколько циклов потребуется
            isSorted = true; // предполагаем, что массив отсортирован. Далее попарно сравниваем элементы.
            for (int i = 0; i < noSort.length - 1; i++) { // знаем кол-во итераций. На 1 меньше, чтоб не выйти за пределы
                if (noSort[i] > noSort[i + 1]) {
                    isSorted = false;
                    change = noSort[i]; // производим обмен через переменную
                    noSort[i] = noSort[i + 1];
                    noSort[i + 1] = change;
                }
            }
        }
        System.out.println(Arrays.toString(noSort));
    }
}

