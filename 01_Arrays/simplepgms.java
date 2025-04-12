//Q1.Given an array of integers nums, return the value of the largest element in the array
import java.util.Arrays;

class Solution {
    // Make the method static since main is static
    public static int largestElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println("Largest element in array is " + nums[n - 1]);
        return nums[n - 1];  // Return it if needed
    }

    public static void main(String[] args) {
        int nums[] = {1, 32, 55, 38, 29, 10};
        largestElement(nums);
    }
}
___________________________________________________________________________________________________________________________________________________________________________
//Q2.Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
public class Solution {
   public static int secondLargest(int arr[]){
    int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;

    if (arr.length < 2){
        return -1;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>first){
            second=first;
            first=arr[i];
        }
        else if(arr[i]<first&&arr[i]>second){
            second=arr[i];
        }
    }
    return (second==Integer.MIN_VALUE)?-1:second;
    
}
        
   public static void main(String[] args) {
            int[] nums1 = {10, 20, 4, 45, 99};
            int[] nums2 = {5, 5, 5};  
            int[] nums3 = {42};       
    
            System.out.println("Second largest: " + secondLargest(nums1));
            System.out.println("Second largest: " + secondLargest(nums2)); 
            System.out.println("Second largest: " + secondLargest(nums3)); 
        }
    }
___________________________________________________________________________________________________________________________________________________________________________
//Q3.Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
  class Solution{
    public static boolean sortedOrnot(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]){
        int arr[] ={1,2,3,4,5};
        int arr1[] ={10,15,20,7};

        System.out.println(sortedOrnot(arr1));
        System.out.println(sortedOrnot(arr));
    }
}
______________________________________________________________________________________________________________________________________________________________________________
//Q4.Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
//If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

  class Solution{
    public static int removeDuplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicate(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
__________________________________________________________________________________________________________________________________________________________________________
