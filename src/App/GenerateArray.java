package App;

import FileHandler.FileHandler;

public class GenerateArray {
    private String numbersFromFile;
    private String path;
    private FileHandler file = new FileHandler();
    GenerateArray(String fileName) {
        path = "/src/Files/" + fileName + ".txt";
        numbersFromFile = file.readFile(path);
    }

    protected int[] generate(int size) {
        String[] numbers = this.numbersFromFile.split(", ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        return array;
    }

    protected Integer[] generateToGeneric(int size) {
        String[] numbers = this.numbersFromFile.split(", ");
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        return array;
    }
}
