
const closestPairWithNumbers = (nums) => {

    let resultNums = [];

    let diff = Infinity;

    for (let i = 0; i < nums.length - 1; i++){

        let currentDiff = Math.abs(nums[i + 1] - nums[i]);
        if (diff > currentDiff) {
            diff = currentDiff;
            resultNums[0] = nums[i];
            resultNums[1] = nums[i + 1];
        } 
    }

    return resultNums;
}

const nums = [1,351,65,31,56,38,321];

for (let i of closestPairWithNumbers(nums)){
    console.log(i);
}