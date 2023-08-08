import java.util.*;
public class Heaps {
    static class Heap{

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int val){

            arr.add(val);

            int x = arr.size() - 1; // index of child added
            int par = (x-1)/2; // index of parent calculated

            while(arr.get(x) < arr.get(par)){ // for max heap change '<' to '>'
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }


        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){ // for max heap change '>' to '<'
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){ // for max heap change '>' to '<'
                minIdx = right;
            }


            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //step-1: Swap 1st and Last
            int temp = arr.get(0);
            arr.set(0 , arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //step-2: remove last element
            arr.remove(arr.size() - 1);

            //step-3: Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {  
        Heap hp = new Heap();

        hp.add(3);
        hp.add(9);
        hp.add(-1);
        hp.add(-6);

        while(!hp.isEmpty()){
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
