public class HashTable {
    private int size = 0;
    private String[] fr;
    private String[] eng;
    public HashTable(int capacity){
        fr = new String[capacity];
        eng = new String[capacity];
    }
    public void put(String key, String value){
        //Check hashtable is full
        if(size == fr.length){
            System.out.println("Hash table is full");
        }
        int index = hashFunction(key);
        fr[index] = key;
        eng[index] = value;
        size++;
        System.out.println("Putting " + value + " is successful.");
    }
    public int getSize(){
        return size;
    }
    public int hashFunction(String key) {
        int hashcode = (key.hashCode()&0x7FFFFFFF) % eng.length;
        return hashcode;
    }
    public void printHashTable(){
        System.out.println("--- Hash Table ---");
        for(int i = 0; i < fr.length; i++){
            System.out.println(i + " " + fr[i] + " " + eng[i]);
        }
    }
}
