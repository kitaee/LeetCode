import java.util.*;

class RandomizedSet {

    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random = new Random();

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)) {
            int targetIndex = map.get(val);
            int lastValue = list.get(list.size()-1);
            list.set(targetIndex, lastValue);
            map.put(lastValue, targetIndex);
            map.remove(val);
            list.remove(list.size()-1);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(map.size()));
    }
}
