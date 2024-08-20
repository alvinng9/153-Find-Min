package org.example;

public class Solution {
    public int findMin(int[] nums) {
        //create 2 pointers
        int left = 0;
        int right = nums.length - 1;
        //start the binary search to find the mind in the given rotated sorted array
        while (left < right) {
            //find the mid point
            int mid = left + (right - left) / 2;
            //if nums[mid] is still less than nums[right] then the array is either
            //has not been sorted or not sorted enough in the first run of the while loop
            //the min of the array has to be on the left side
            if (nums[mid] < nums[right]) {
                right = mid;
                //the min of the array is on the right if nums[mid] is bigger than nums[right]
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
