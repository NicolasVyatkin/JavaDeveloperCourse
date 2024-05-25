package hwoop.lesson5inout.basic1;


import java.util.Scanner;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFilesVithSetResol implements FileFilter {

    private String[] arr;
    private static int numb;

    public CopyingFilesVithSetResol(String... arr) {

        super();
        this.arr = arr;
    }

    private boolean check(String ext) {
        for (String stringExt : arr) {
            if (stringExt.equals(ext)) {
                numb++;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);

    }

    public static void sortingAndCopyDirectoryFiles() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chose the folder from which you want to copy files('D:\\test'): ");
        String inputFolder = sc.next();
        System.out.println("Source folder contains:");
        directoryAnalytics(inputFolder);
        System.out.print("Chose the folder in which you want to copy files('.'): ");
        String outputFolder = sc.next();
        System.out.print("Chose resolution of the file('pdf'): ");
        String resolution = sc.next();
        File fileIn = new File(inputFolder);
        File fileOut = new File(outputFolder);
        String fileFormat = resolution;
        CopyingFilesVithSetResol mFF = new CopyingFilesVithSetResol(fileFormat);
        File folder = fileIn;
        File[] fileList = folder.listFiles(mFF);
        for (File fileOne : fileList) {
            try {
                CopyingFilesVithSetResol.copyFile(fileOne, new File(fileOut, fileOne.getName()));

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        System.out.println("There are " + counter() + " files with " + resolution + " resolution have been copied from directory " +
                fileIn.getAbsolutePath() + " to directory " + fileOut.getAbsolutePath());
    }

    public static void copyFile(File in, File out) throws IOException {
        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;
        try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(out)) {

            for (; (readByte = fis.read(buffer)) > 0; ) {
                fos.write(buffer, 0, readByte);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public static void directoryAnalytics(String path) {
        File folderOne = new File(path);
        File[] files = folderOne.listFiles();
        for (File fileOne : files) {
            System.out.println(fileOne + (fileOne.isFile() ? " - File" : " - Folder"));
        }
    }

    public static int counter() {
        return numb;
    }
}
//public class FileCopier {
//    public FileCopier() {
//    }

//    public void directoryAnalitics() {
//Каталоги в директории
//        Scanner sh = new Scanner(System.in);
//        System.out.println("Введите путь для анализа каталога (. по умолчанию): ");
//
//        String path = sh.next();
//        File folderOne = new File(path);
//        File[] files = folderOne.listFiles();
//        for (File fileOne : files) {
//            System.out.println(fileOne);
//        }
//    }

//    public void saveTextToFile(String text, File file) {
//        try (PrintWriter pw = new PrintWriter(file)) {
//            pw.println(text);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }

//    public static long copyFile(File folderIn, File folderOut,String resol) throws IOException {
//        try (InputStream is = new FileInputStream(folderIn);
//             OutputStream os = new FileOutputStream(folderOut)) {
//
//            File[] files = folderIn.listFiles();
//            for (File fileOne : files) {
//                if (String resol==)
//                System.out.println(fileOne);
//            }
//            return is.transferTo(os);
//        }
//    }
//}

