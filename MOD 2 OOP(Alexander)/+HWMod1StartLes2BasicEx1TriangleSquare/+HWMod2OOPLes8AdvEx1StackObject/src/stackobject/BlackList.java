package stackobject;

public class BlackList {

    private Class[] blacklist;

    public BlackList() {
        super();
        this.blacklist = new Class[0];
    }

    public void addClass(Class addClass) {
        if (!exists(addClass)) {
            Class[] temp = new Class[blacklist.length + 1];
            for (int i = 0; i < blacklist.length; i++) temp[i] = blacklist[i];
            blacklist = temp;
            for (int i = 0; i < blacklist.length; i++) {
                if (blacklist[i] == null) {
                    blacklist[i] = addClass;
                    return;
                }
            }
        }
    }

    public boolean exists(Class byClass) {
        for (Class i : blacklist) {
            if (i.equals(byClass)) return true;
        }
        return false;
    }

    public boolean exists(Object byObject) {
        for (Class i : blacklist) {
            if (i.equals(byObject.getClass())) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Black list contains:");
        for (Class i : blacklist) {
            sb.append("\n- " + i);
        }
        return sb.toString();
    }
}