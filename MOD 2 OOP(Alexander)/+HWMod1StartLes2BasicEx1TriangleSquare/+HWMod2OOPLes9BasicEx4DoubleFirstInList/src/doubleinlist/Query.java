package doubleinlist;

import java.util.ArrayDeque;

public class Query {
    private ArrayDeque<String> qc = new ArrayDeque<String>();

    public Query() {
        super();
    }

    public Query(ArrayDeque<String> qc) {
        super();
        this.qc = qc;
    }

    public ArrayDeque<String> getQc() {
        return qc;
    }

    public void setQc(ArrayDeque<String> qc) {
        this.qc = qc;
    }

    @Override
    public String toString() {
        return "Query [qc=" + qc + "]";
    }

    public void add(String name) {
        qc.push(name);
    }

    public void queryPeople(int t) {
        String temp;
        if (t==0) {
            System.out.println(qc);
        } else {
            for (int i = 0; i <= t - 1; i++) {
                temp = qc.pollFirst();
                qc.addLast(temp);
                qc.addLast(temp);

            }
            System.out.println(qc);
        }
    }
}
