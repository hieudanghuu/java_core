import java.util.Map;
import java.util.HashMap;

public class ProductManager {
    Map<String, Integer> hashMap = new HashMap<>();

    public boolean add(String key, int value){
        this.hashMap.put(key,value);
        return true;
    }

    public boolean edit(String key, int value){

        this.hashMap.put(key,value);
        return true;
    }

    public boolean delete(String key){

        this.hashMap.remove(key);
        return true;
    }

    public int find(String key){

        int result = this.hashMap.get(key);
        return result;
    }

    public int[] search(int value){
        int[] arr = new int[this.hashMap.size()];
        for (int i = 0 ; i < this.hashMap.size(); i ++) {
            if (value == this.hashMap.get(i)) {
               arr[i] =  this.hashMap.get(i);
            }
        }
        return arr;
    }
}
