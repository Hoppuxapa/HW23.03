import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;


public class Task4 {
    public void checkWord(Path path, String word) {
        String fileLine = "";
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path)));



            while ((fileLine = br.readLine()) != null) {
                for (String s : fileLine.split(" ")) {
                    if (s.equalsIgnoreCase(word)) {
                        count++;
                    }
                }


            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);

    }
}
