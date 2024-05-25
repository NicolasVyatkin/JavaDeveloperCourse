package multitheadfilecopy;

public class Action {
    private byte[] data; //the buffer
    private long fileLength; //the file length
    private int n; //bytes to write

    public Action() {
        super();
    }

    public synchronized void setData(byte[] data, int n) {
        this.data = data;
        this.n = n;
        if (data.length != 0) System.out.println("Thread-1 fis.read  — " + this);
        notify();
    }

    public synchronized byte[] getData() {
        System.out.println("Thread-2 fos.write — " + this);
        notifyAll();
        return this.data;
    }

    public void showProgress(long iteration) {
        String temp = "%";
        System.out.format("Thread-3 progress  — %2.0f%s\n\n", (((double) iteration * data.length) / fileLength) * 100, temp);
    }

    public int getBytesNumber() {
        return n;
    }

    public synchronized float getBufferSize() {
        return data.length;
    }

    public void setFileLength(long length) {
        this.fileLength = length;
    }

    public long getFileLength() {
        return fileLength;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; ; i++) {
            sb.append(data[i]);
            if (i == data.length - 1)
                return sb.append(" [Bytes: " + n + "]").toString();
            sb.append(", ");
        }
    }
}
