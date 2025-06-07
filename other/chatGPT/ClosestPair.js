
const findClosestPair = (nums) => {

    nums.sort((a,b) => a - b);
    let diff = Infinity;

    for (let i = 0; i < nums.length - 1; i++){

        let currentDiff = Math.abs(nums[i + 1] - nums[i]);
        if (currentDiff < diff) diff = currentDiff;
    }

    return diff;
}

const nums = [1,38,461,3513,21,78];
console.log(findClosestPair(nums));