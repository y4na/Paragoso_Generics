import java.util.ArrayList;

public class MyMap<Key,Value> {
    ArrayList<Key> key;
    ArrayList<Value> val;
    public MyMap() {
        this.key = new ArrayList<>();
        this.val = new ArrayList<>();
    }
    public void put(Key key, Value value){
        for(Key k: this.key){
            if(key.equals(k)){
                val.set(this.key.indexOf(k),value);
                return;
            }
        }
        val.add(value);
        this.key.add(key);
    }
    public Value get(Key key){
        Value toReturn = null;

        for(Key k: this.key){
            if(key.equals(k)){
                toReturn = val.get(this.key.indexOf(k));
            }
        }
        return toReturn;
    }
    public Value remove(Key key){
        Value toReturn = null;

        for(Key k: this.key){
            if(key.equals(k)){
                toReturn=val.get(this.key.indexOf(k));
                val.remove(toReturn);
                this.key.remove(k);
                return toReturn;
            }
        }
        return toReturn;
    }
}