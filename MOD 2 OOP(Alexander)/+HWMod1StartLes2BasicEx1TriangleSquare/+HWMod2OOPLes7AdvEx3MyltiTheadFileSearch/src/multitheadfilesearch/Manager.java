package multitheadfilesearch;
import java.io.File;
import java.util.ArrayList;

public class Manager implements Runnable {
    private String search;
    private File path;
    private ArrayList<File> found = new ArrayList<>();
    private ArrayList<Thread> threads = new ArrayList<>();
    private File[] files;
    private Thread thr;

    public Manager(String search, File path) {
        super();
        this.search = search;
        this.path = path;
        files = path.listFiles();
        thr = new Thread(this);
        thr.start();
    }

    public void searching(File[] files) {
        if (files == null) return;
        for (File i : files) {
            if (i.isFile() && i.getName().equalsIgnoreCase(search)) {
                System.out.format("%s has found %s\n", Thread.currentThread().getName(), i.getName());
                found.add(i);
            }
            if (i.isDirectory()) {
                Thread newThread = new Thread(new SearchingThread(i.listFiles(), this));
                newThread.start();
                threads.add(newThread);
            }
        }
    }

    @Override
    public void run() {
        searching(files);
        for (int i = 0; i < threads.size(); i++) {
            try {
                threads.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (found.size() == 0) {
            System.out.println("Nothing was found!");
        } else {
            System.out.println();
            for (File i : found) {
                System.out.println(i.getAbsoluteFile());
            }
        }
    }
}