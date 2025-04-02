public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
        int arrSize = arr.size();
        long minSum = 0;
        long maxSum = 0;
        
        Collections.sort(arr);
        
        for (int i = 0; i < arrSize - 1; i++){
            minSum += arr.get(i);
        }
        
        for (int j = arrSize - 1; j > 0; j--){
            maxSum += arr.get(j);
        }
        
        System.out.println(minSum + " " + maxSum);
    }