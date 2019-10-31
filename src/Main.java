import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
      /*  SomeClass someClass = new SomeClass();
        someClass.replacer(Paths.get("C:\\Test.txt"));

        Task2 task2 = new Task2();
        task2.fileContentReplacer(Paths.get("C:\\Test.txt"));
*/
        /*Task3 task3= new Task3();
        task3.fileContentMerger(Paths.get("C:\\Test.txt"));
        */
        Task4 task4 = new Task4();
        task4.checkWord(Paths.get("C:\\Test.txt"), "Hello");

    }
}
