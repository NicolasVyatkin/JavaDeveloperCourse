
//=======Without Generics===========
//public class Container {
//    private Object element;
//
//    public Container(Object element) {
//        super();
//        this.element = element;
//    }
//
//    public Object getElement() {
//        return element;
//    }
//
//    public void setElement(Object element) {
//        this.element = element;
//    }
//
//    @Override
//    public String toString() {
//        return "Container [element=" + element + "]";
//    }

//=======With Generics============

//public class Container<E extends Number & Comparable<E>> {
public class Container<E extends Comparable<E>> {
    private Object element;

    public Container(E element) {
        super();
        this.element = element;
    }

    public E getElement() {
        return (E) element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Container [element=" + element + "]";
    }

}
