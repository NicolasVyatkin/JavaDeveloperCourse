package asciiarthashmap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Abet {

    private HashMap<Character,ArrayList<String>> artAbetMap = new HashMap<>();

    public HashMap<Character, ArrayList<String>> getArtAbetMap() {
        return artAbetMap;
    }

    public void loadAbet(String fileAbetAdres) throws IllegalArgumentException{
        if(fileAbetAdres == null){
            throw new IllegalArgumentException("nulPointer");
        }
        File abetFile = new File(fileAbetAdres);
        if(!abetFile.exists() || !abetFile.isFile()){
            throw new IllegalArgumentException("notExists");
        }

        char[] abet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};

        try(BufferedReader reader = new BufferedReader(new FileReader(abetFile))){
            reader.readLine();//пропуск первой строки сточкой
            for(int i = 0; i < abet.length; i++) {
                ArrayList<String> liter = new ArrayList<String>();
                while (true) {
                    String s = reader.readLine();
                    if (s==null || s.equals(".")) {
                        break;
                    }
                    liter.add(s);
                }
                artAbetMap.put(abet[i], liter);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

}
