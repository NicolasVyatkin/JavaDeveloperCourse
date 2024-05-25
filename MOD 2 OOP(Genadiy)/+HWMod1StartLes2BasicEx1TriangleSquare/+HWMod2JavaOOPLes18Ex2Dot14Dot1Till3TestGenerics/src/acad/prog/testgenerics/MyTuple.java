package acad.prog.testgenerics;
/**
 * @author Kolin Vyatkin
 * Task 2.14.1
 * */

public class MyTuple <A,B,C> {
    A typeA;
    B typeB;
    C typeC;

    public MyTuple(A typeA, B typeB, C typeC) {
        this.typeA = typeA;
        this.typeB = typeB;
        this.typeC = typeC;
    }

    public A getTypeA() {
        return typeA;
    }

    public void setTypeA(A typeA) {
        this.typeA = typeA;
    }

    public B getTypeB() {
        return typeB;
    }

    public void setTypeB(B typeB) {
        this.typeB = typeB;
    }

    public C getTypeC() {
        return typeC;
    }

    public void setTypeC(C typeC) {
        this.typeC = typeC;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "typeA=" + typeA +
                ", typeB=" + typeB +
                ", typeC=" + typeC +
                '}';
    }
}