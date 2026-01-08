public class HashTable2
{
    private int size = 0;
    private String[] fr;
    private String[] eng;
    public HashTable2(int capacity)
    {
        fr = new String[capacity];
        eng = new String[capacity];
    }
    public void put(String key,String value)
    {
        if(size == fr.length)
        {
            System.out.println("Hash Table is full.");
            return;
        }
        int index = hashFunction(key);
        if(fr[index] == null)
        {
            fr[index] = key;
            eng[index] = value;
            size++;
            System.out.println("Putting " + value + " is successful.");
        }
        else if(fr[index] != null)
        {
            System.out.println("Putting " + value + " has collision!");
            while(fr[index] != null && index < size)
            {
                index++;
            }
            if(fr[index] == null)
            {
                fr[index] = key;
                eng[index] = value;
                size++;
                System.out.println("Putting " + value + " is successful.");
            }
            else
            {
                System.out.println("Putting " + value + " is failed!");
            }
        }
    }
    public String get(String key) {
    int index = hashFunction(key);
    while(fr[index].equals(key) && index < size)
    {
        index++;
    }
    if(fr[index] != null && fr[index].equals(key))
    {
        return eng[index];
    }
    else
    {
        return "N/A";
    }
}
    public int getSize()
    {
        return size;
    }
    public int hashFunction(String key)
    {
        int hashcode = (key.hashCode()&0x7FFFFFFF) % fr.length;
        return hashcode;
    }public void printHashTable()
{
    System.out.println(" --- Hash Table --- ");
    for(int i = 0; i < fr.length; i++)
    {
        System.out.println(i + " " + fr[i] + " " + eng[i]);
    }
}
}