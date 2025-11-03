import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,2,3,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low,int high){
        if(low >= high){
            return;
        }
        int start=low;
        int end=high;
        int mid = start+(end-start)/2;
        int pivot = nums[mid];
        while(start<=end){
            while(nums[start]<pivot){
                start++;
            };
            while(nums[end]>pivot){
                end--;
            }

            if(start<=end){
                int tmp=nums[start];
                nums[start]=nums[end];
                nums[end]=tmp;
                start++;
                end--;
            }
        }
        sort(nums,low,start-1);
        sort(nums,mid+1,high);
    }
}
