package oop.lection9.hwbasetwo;

public class GroupOverflowExeption extends Exception{
    @Override
    public String getMessage() {
        return "The Group is full";
    }
}
