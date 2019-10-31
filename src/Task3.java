import java.io.*;
import java.nio.file.Path;

public class Task3 {
    public void fileContentMerger(Path path) throws IOException {
        String searchLine = "";
        String changeToLine = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path)));
            String NewLine = System.getProperty("line.separator");
            while ((searchLine = br.readLine()) != null) {
                changeToLine = changeToLine + searchLine + NewLine;
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(path)));
            bw.write(changeToLine);
            br.close();


            changeToLine = changeToLine.replaceAll("(H|h)(E|e)(L|l)(L|l)(O|o)",
                    "Hi");
            System.out.println(changeToLine);

            bw.write(changeToLine);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}