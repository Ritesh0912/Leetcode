class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int i = 0;
    int j = numbers.length -1;
    int[] arr = new int[2];
    while(i<j){
    int temp = numbers[i] + numbers[j];
    if(temp==target){
        arr[0] = i+1;
        arr[1] = j+1;
        break;
       
        }

        else if(temp < target){
            i++;
        }

        else {
            j--;
        }
    }
        return arr;
    }
}