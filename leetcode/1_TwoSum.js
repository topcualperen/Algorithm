
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    
    const map = new Map();
    let resultArr = new Array(2);

    for (let i = 0; nums.length; i++){

        if (map.has(target - nums[i])) {
            resultArr[0] = map.get(target - nums[i]);
            resultArr[1] = i;
            break;
        }
        map.set(nums[i], i);
    }

    return resultArr;
};