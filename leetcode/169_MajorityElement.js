/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    
    let candidate = 0;
    let counter = 0;

    for (let i = 0; i < nums.length; i++){

        if (counter === 0) {
            candidate = nums[i];
            counter++;
        }
        else if (nums[i] === candidate) counter++;
        else if (nums[i] != candidate) counter--;
    }

    return candidate;
};