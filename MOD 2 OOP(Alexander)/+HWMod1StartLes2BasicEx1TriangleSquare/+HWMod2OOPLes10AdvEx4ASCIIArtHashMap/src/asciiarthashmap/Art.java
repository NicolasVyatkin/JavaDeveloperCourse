package asciiarthashmap;

import java.util.ArrayList;

public class Art {

    private Abet abet;

    public Art(Abet abet) {
        this.abet = abet;
    }

    public void print(String string) {
        char[] arr = string.toLowerCase().toCharArray();

        for (int i = 0; i < abet.getArtAbetMap().get('a').size(); i++) {
            for (char c : arr) {
                ArrayList<String> list = abet.getArtAbetMap().get(c);
                if (list != null) {
                    System.out.print(list.get(i));
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }

    }

}
