import java.util.*;

public class HashMapCode {
    static class HashMap<K,V> {// Generic

        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }


        private int n; //n - Length of Linked List in each Bucket
        private int N; // N - Length of Bucket
        private LinkedList<Node> bucket[]; // bucket.length = N;

        // @SuppressWarnings("uncheked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                bucket[i] = new LinkedList<>();
            }
        }

        
        public int hashFunction(K key){
            int hc = key.hashCode();

            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = bucket[bi];

            int di = 0;

            for(int i = 0; i < ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }

            return -1;
        }

        //[PUT Function]
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                node.value = value;
            }else{
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0){
                rehash();
            }
        }

        private void rehash(){
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[2*N];
            N = 2*N;

            // A new linked List Initialised in each bucket; 
            for(int i = 0; i < bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }

            //oldnodes -> newBucket;
            for(int i  = 0; i < oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];

                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        
        //[ContainsKEY Function]
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                return true;
            }else{
                return false;
            }
        }

        //[Remove Function]
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        //[GET Function]
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        //[KEYSet Function]
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < bucket.length; i++){
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("China", 150);
        map.put("India", 100);
        map.put("USA", 50);
        map.put("Indonesia", 30);
        map.put("Nepal", 10);
        map.put("Bhutan", 5);
        

        System.out.println(map.get("India"));

        


    }
}
