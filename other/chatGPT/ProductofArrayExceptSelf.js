
const productOfArrayExceptSelf = (nums) => {

    let total = 1;

    let resultNums = [];

    for (let j of nums){
        total *= j;
    }

    for (let k = 0; k < nums.length; k++){
        resultNums[k] = total / nums[k];
    }

    return resultNums;
}

const nums = [1,2,4,9,5];
for (let i of productOfArrayExceptSelf(nums)){
    console.log(i);
}