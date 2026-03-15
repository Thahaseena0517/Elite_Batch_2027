import java.util.*;

class MergeSort {

    // Function to perform MergeSort on arr[l…r]
    public void mergeSort(int[] arr, int l, int r) {
        //WRITE YOUR CODE HERE
        if(l<r){
            int middle=l+(r-l)/2;
            mergeSort(arr,l,middle);
            mergeSort(arr,middle+1,r);
            merge(arr,l,middle,r);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int L=mid-left+1;
        int R=right-mid;
        int[] l=new int[L];
        int[] r=new int[R];
        for(int i=0;i<L;i++){
            l[i]=arr[left+i];
            
        }
        for(int i=0;i<R;i++){
            r[i]=arr[i+mid+1];
            
        }
        int il=0,ir=0;
        int index=left;
        while(il<L && ir<R){
            if(l[il]<=r[ir]){
                arr[index]=l[il];
                il++;
            }
            else{
                arr[index]=r[ir];
                ir++;
            }
            index++;
            
        }
        while(il<L){
            arr[index]=l[il];
            il++;
            index++;
        }
        while(ir<R){
            arr[index]=r[ir];
            ir++;
            index++;
        }
    }
}

public class mergesort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

