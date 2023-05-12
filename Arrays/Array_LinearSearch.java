public class Array_LinearSearch {
    public static int linearSearch (String arr[], String key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
    public static void main (String args[]) {
        String arr[] = {"Samosa", "Chhole Bhature", "Maggi", "Dosa"};
        String key = "Gulab Jamun"; 

        if(linearSearch(arr, key) == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.println("The Key Found At : " + linearSearch(arr, key));
        }
    }
}