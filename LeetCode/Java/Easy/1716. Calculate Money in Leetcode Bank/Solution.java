class Solution {
    public int totalMoney(int n) {
     int start_monday = 1;
     int sum = 0;
    
    while(n>0){
        int money = start_monday;
        for(int day = 1; day<=Math.min(n,7);day++){
        sum = sum+money;
        money++;
     }
        n = n-7;
        start_monday++; 
    }
    return sum;
    }
}
