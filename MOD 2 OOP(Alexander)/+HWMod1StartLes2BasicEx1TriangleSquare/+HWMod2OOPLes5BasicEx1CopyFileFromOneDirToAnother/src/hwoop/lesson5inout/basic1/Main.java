/*
        1) Напишите программу, которая скопирует все файлы с заранее определенным расширением
    (например, только doc) из одного каталога в другой.
 */

package hwoop.lesson5inout.basic1;

public class Main {
    public static void main(String[] args) {

        CopyingFilesVithSetResol.sortingAndCopyDirectoryFiles();
    }
}

//        File fileIn = new File("D:\\test");
//        File fileOut = new File(".");
//        String fileFormat = "pdf";

//        ("1) Напишите программу, которая скопирует все файлы с заранее определенным расширением\n" +
//                "(например, только doc) из одного каталога в другой."
//        FileCopier fileCopier = new FileCopier();
//        fileCopier.directoryAnalitics();

//        File fileIn = new File("D:\\test");
//
//        File fileOut = new File(fileIn.getName());
//
//        try {
//            System.out.println(FileCopier.copyFile(fileIn, fileOut,".doc") + " byte copy");
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
