
const moveZeroes = (nums) => {

    let temp = 0;

    for (let i = 0; i < nums.length; i++){

        if (nums[i] != 0) nums[temp++] = nums[i];
    }

    for (let k = temp; k < nums.length; k ++){
        nums[k] = 0;
    }

    return nums;
}

let nums = [1,6,0,3,12,0];

for (let j of moveZeroes(nums)){
    console.log(j);
}