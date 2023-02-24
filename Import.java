package homeWork2;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
public class Import {
    public static List<String> readAllLinesInFile(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try
        {
            lines =
                Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8 );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
    
    


}

