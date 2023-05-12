public class Question_3_Optimized {
    public static int merge (int num[], int si, int mid, int ei) {
        int invcount = 0;
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei) {
            if(num[i] < num[j]) {
                temp[k] = num[i];
                i++;
                k++;
            }else {
                temp[k] = num[j];
                invcount += (mid - i + 1);
                j++;
                k++;
            }
        }

        while(i <= mid) {
            temp[k] = num[i];
            i++;
            k++;
        }

        while(j <= ei) {
            temp[k] = num[j];
            j++;
            k++;
        }

        for(i = si, k = 0; i <= ei; i++, k++) {
            num[i] = temp[k];
        }

        return invcount;
    }
    public static int mergeSort (int num[], int si, int ei) {
        int invCount = 0;

        if(si < ei) {

        int mid = si + (ei - si)/2;

        invCount = mergeSort(num, si, mid);
        invCount += mergeSort(num, mid + 1, ei);
        invCount += merge(num, si, mid, ei);

        }

        return invCount;

    }
    public static void main (String args[]) {
        int num[] = {2,4,1,3,5};

        int ans = mergeSort(num, 0, num.length - 1);

        System.out.println(ans);
    }
}