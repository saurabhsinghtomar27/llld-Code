package HashMap_Implementation;

class HashMap<K,V> {
   private static final int initial_size=1<<4;
   private static final int Maximum_capacity=1<<30;
    Entry<K,V>[] table;
    HashMap(){
       table=new Entry[initial_size];
    }
    HashMap(int capacity){
       int size=tableSizeFor(capacity);
        table=new Entry[size];
    }
    int tableSizeFor(int capacity){
        int n=capacity-1;
        n|=n>>>1;
        n|=n>>>2;
        n|=n>>>4;
        n|=n>>>8;
        n|=n>>>16;
        return (n<0)?1:(n>=Maximum_capacity)?Maximum_capacity:n+1;
    }
    class Entry<K,V>{
       K key;
       V value;
       Entry<K,V> next;
       Entry(K key,V value){
           this.key=key;
           this.value=value;  
       }
       public K getKey(){
           return key;
       }
         public V getValue(){
              return value;
         }
         public void setValue(V value){
             this.value=value;
         }

    }
    public void put(K key,V value){
        int hash=key.hashCode()%table.length;
        Entry node=table[hash];
        if(node==null){
            table[hash]=new Entry(key,value);
        }
        else{
            Entry prev=node;
            while(node!=null){
                if(node.key==key){
                    node.value=value;
                    return;
                }
                prev=node;
                node=node.next;
            }
            prev.next=new Entry(key,value);
            } 
        }
        public V get(K key) {

            int hashCode = key.hashCode() % table.length;
            Entry node = table[hashCode];
    
            while(node != null) {
                if(node.key==key) {
                    return (V)node.value;
                }
                node = node.next;
            }
            return null;
        }
    }


public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        System.out.println(map.get(1));
        
    }

}
