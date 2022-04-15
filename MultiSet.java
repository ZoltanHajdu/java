package hw8;
import java.util.HashMap;

public class MultiSet {
    private HashMap<String, Integer> hm = new HashMap<>();

    public MultiSet(){};
    public MultiSet(HashMap<String, Integer> hm) {this.hm = hm;};

    public HashMap<String, Integer> getData() {return this.hm;}

    public void put (String that, Integer c){
        this.hm.put(that, c);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        this.hm.forEach( (k,v) -> 
            sb.append(k).append("(").append(v).append(")")
        );

        return sb.toString();
    }
}
