package FileHandler;

import java.io.*;

public class FileHandler {
    private String userPath;


    public FileHandler() {
        userPath = System.getProperty("user.dir");
    }

    public String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            java.io.File file = new java.io.File(userPath + path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            while ((st = br.readLine()) != null) {
                sb.append(st);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void saveFile(int[] v, String fileName) {
        try {
            FileWriter fw = new FileWriter("src/Files/" + fileName + ".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < v.length; i++) {
                bw.write(Integer.toString(v[i]));
                if (i != v.length - 1) {
                    bw.write(", ");
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
