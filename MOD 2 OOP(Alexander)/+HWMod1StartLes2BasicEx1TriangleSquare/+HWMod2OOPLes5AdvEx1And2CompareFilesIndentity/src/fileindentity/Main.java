package fileindentity;

/**
 * 1)Реализуйте сервис для сравнения файлов на идентичность. Файлы считаются идентичными если
 * они побайтово равны. Файлы разной длинны, или файлы в которых хотя бы один байт отличен
 * считаются разными.
 * 2) Дополните полученный сервис возможностью передачи адресов файлов в ключевом режиме при
 * запуске приложения из командной строки.
 * */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File firstFile = new File("/var/www/first.txt");
        File secondFile = new File("/var/www/second.txt");

        boolean equal = isEqual(firstFile, secondFile);
        if (equal) {
            System.out.println("Files are equal.");
        }
        else {
            System.out.println("Files are not equal.");
        }

        //===================================================
        File firstFile = new File("/var/www/first.txt");
        File secondFile = new File("/var/www/second.txt");

        boolean equal = isEqual(firstFile.toPath(), secondFile.toPath());
        if (equal) {
            System.out.println("Files are equal.");
        }
        else {
            System.out.println("Files are not equal.");
        }
    }
    }

    private static boolean isEqual(File firstFile, File secondFile)
    {
        try {
            return FileUtils.contentEquals(firstFile, secondFile);
        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }
    //============================================================
    private static boolean isEqualByteByByte(Path firstFile, Path secondFile)
    {
        try {
            if (Files.size(firstFile) != Files.size(secondFile)) {
                return false;
            }

            byte[] first = Files.readAllBytes(firstFile);
            byte[] second = Files.readAllBytes(secondFile);
            return Arrays.equals(first, second);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}