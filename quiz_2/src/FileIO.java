    import java.io.*;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class FileIO {
        public static ArrayList<String> readFile(String path) throws FileNotFoundException {
            Scanner s = new Scanner(new File("input.txt"));
            ArrayList<String> list = new ArrayList<String>();
            while (s.hasNextLine()){
                list.add(s.nextLine());
            }
            s.close();
            return list;
        }

        public static void writeToFile(String path, String content, boolean append, boolean newLine) {
            PrintStream ps = null;
            try {
                ps = new PrintStream(new FileOutputStream(path, append));
                ps.print(content + (newLine ? "\n" : ""));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (ps != null) { //Flushes all the content and closes the stream if it has been successfully created.
                    ps.flush();
                    ps.close();
                }
            }
        }

    }