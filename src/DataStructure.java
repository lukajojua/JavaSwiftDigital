import java.util.List;
import java.util.Map;

public class DataStructure {
    private Map<Integer,Integer>map;
    private List<Integer>list;


    public DataStructure(Map<Integer, Integer> map) {
        this.map = map;
    }
    public boolean remove(int val){
        if (!map.containsKey(val)) return false;
        int index=map.get(val);
        int last=list.get(list.size()-1);
        list.set(index,last);
        map.remove(val);
        list.remove(list.size()-1);
        return true;



    }
}
