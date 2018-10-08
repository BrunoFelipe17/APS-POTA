package App;

public class Main {
    public static void main(String[] args) {
//        RandomNumbersToFile rd = new RandomNumbersToFile();
//        rd.generate();

        SortingAlgorithms sa = new SortingAlgorithms("randomNumbers_1");
        System.out.println("Bubble");
        sa.bubble(5);
        sa.bubble(10);
        sa.bubble(50);
        sa.bubble(100);
        sa.bubble(1000);
        sa.bubble(10000);

        System.out.println("\nSelection");
        sa.selection(5);
        sa.selection(10);
        sa.selection(50);
        sa.selection(100);
        sa.selection(1000);
        sa.selection(10000);

        System.out.println("\nInsertion");
        sa.insertion(5);
        sa.insertion(10);
        sa.insertion(50);
        sa.insertion(100);
        sa.insertion(1000);
        sa.insertion(10000);

        System.out.println("\nMerge");
        sa.merge(5);
        sa.merge(10);
        sa.merge(50);
        sa.merge(100);
        sa.merge(1000);
        sa.merge(10000);

        System.out.println("\nQuick");
        sa.quick(5);
        sa.quick(10);
        sa.quick(50);
        sa.quick(100);
        sa.quick(1000);
        sa.quick(10000);
    }
}
