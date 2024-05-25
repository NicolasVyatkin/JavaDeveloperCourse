package acad.prog.testmygen;

import java.util.*;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }
    public List<Integer> generate(){ //Можна й List <Number>, але у завданні Integer лише потрібно
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < this.numOfElm; i++) {
            int in = new Random().nextInt(this.maxNumb+1);
            randomList.add(in);
        }
        return randomList;
    }
    //завдання 2.15.5
    public Set<Integer> generateDistinct(){
        Set<Integer> setRandom = new HashSet<>();
        for (int i = 0; i < this.numOfElm; i++) {
            int in = new Random().nextInt(this.maxNumb+1);
            setRandom.add(in);
        }
        return setRandom;
    }
}