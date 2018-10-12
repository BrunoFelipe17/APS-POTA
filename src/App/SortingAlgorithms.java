package App;
import SortingAlgorithms.Bubble;
import SortingAlgorithms.Insertion;
import SortingAlgorithms.Merge;
import SortingAlgorithms.Selection;
import SortingAlgorithms.Quick;

public class SortingAlgorithms {
    GenerateArray array;
    SortingAlgorithms(String fileName) {
        array = new GenerateArray(fileName);
    }

    public void bubble(int size) {
        createBody(new Bubble(), size);
    }

    public void selection(int size) {
        createBody(new Selection(), size);
    }

    public void insertion(int size) {
        createBody(new Insertion(), size);
    }

    public void merge(int size) {
        createBody(new Merge(), size);
    }

    public void quick(int size) {
        createBody(new Quick(), size);
    }

    private void createBody(Object object, int size) {
        int[] arr = array.generate(size);
        Integer[] arrG = array.generateToGeneric(size);
//        printArr(arr);
        if (object instanceof Bubble) {
            new Bubble().sort(arrG);
        } else if (object instanceof Selection) {
            Selection.sort(arrG);
        } else if (object instanceof Insertion) {
            Insertion.sort(arrG);
        } else if (object instanceof Merge) {
            Merge.merge(arr, 0, arr.length - 1);
            System.out.println(Merge.comparison + " " + Merge.swap);
            Merge.comparison = 0;
            Merge.swap = 0;
        } else if (object instanceof Quick) {
            Quick.sort(arr, 0, arr.length - 1);
            System.out.println(Quick.comparison + " " + Quick.swap);
            Quick.comparison = 0;
            Quick.swap = 0;
//            printArr(arr);
        }
    }

    public void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
