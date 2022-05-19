public class MyHashTable <Key extends Comparable<Key>, Value>{
    private Integer capacity;
    private Key[] keyBuckets;
    private Value[] valueBuckets;
    private Integer size;

    public MyArrayList<Key> keys;
    public Integer comparisons;
    public Integer maxProbe;


    public MyHashTable(Integer capacity){
        this.capacity = capacity;
        keyBuckets = (Key[]) new Comparable[capacity];
        valueBuckets = (Value[]) new Object[capacity];
    }

    private Integer hash(Key key){
        int hash = key.hashCode() % capacity;

        /*if(key.getClass().getName() != Integer){

        } else{
            hash = key. % capacity;
        }*/

        return hash;
    }

    public Value get(Key key){
        Integer hashTemp = hash(key);
        for (int i = hashTemp; i < capacity; i++) {
            if(keyBuckets[i] == key){
                return valueBuckets[i];
            }
            comparisons++;

        }
        return null;
    }

    public void put(Key key, Value value){
        Integer hashTemp = hash(key);
        keys.insert(key, keys.size());
        for (int i = hashTemp; i < capacity; i++) {
            if(valueBuckets[i] != null){
                valueBuckets[i] = value;
            }
            comparisons++;
        }
    }

    public Integer size(){
        return size;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < capacity; i++) {
            if(i == 0){
                str.append("[").append(keyBuckets[i]).append(":").append(valueBuckets[i]);
            }
            str.append(", ").append(keyBuckets[i]).append(":").append(valueBuckets[i]);
        }
        str.append("]");

        return str.toString();
    }



}
