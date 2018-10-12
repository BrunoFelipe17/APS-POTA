package App;

import FileHandler.FileHandler;

public class RandomNumbersToFile {
    public void generate(String fileName) {
        String pi = new FileHandler().readFile("/src/Files/pi.txt");
        int[] arr = new int[10000];
        int init = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int rand = (int)(Math.random() * 3  + 1);
            end += rand;
            arr[i] = Integer.parseInt(pi.substring(init, end));
            init += rand;
        }
        new FileHandler().saveFile(arr, fileName);
    }
}
