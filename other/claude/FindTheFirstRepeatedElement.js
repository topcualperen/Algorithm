
const findFirstRepeatNumber = (nums) => {

    if (nums.length === 1) return nums[0];
    if (nums.length <= 0) return -1;

    let set = new Set();

    for (let i of nums){

        if (set.has(i)) return i;
        set.add(i);
    }
}

let nums = [1,2,34,653,2,4,34,9];
console.log(findFirstRepeatNumber(nums));