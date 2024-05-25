public class Pair<T, K> {
    private Object first;
    private Object second;

    public Pair(T first, K second) {
        super();
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return (T) first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getSecond() {
        return (K) second;
    }

    public void setSecond(K second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

}
