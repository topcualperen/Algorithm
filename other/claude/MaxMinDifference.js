const findMaxMinDifference = (arr) => {

	        maxNum = Math.max(arr[0], arr[1]);
	        minNum = Math.min(arr[0], arr[1]);

	        for (let i = 0; i < arr.length; i++){

			                if (arr[i] > maxNum) maxNum = arr[i];
			                else if (arr[i] < minNum) minNum = arr[i];
			        }

	        return maxNum - minNum;
}

const arr = [1,2,48,65,19,3,31];

console.log(findMaxMinDifference(arr));
