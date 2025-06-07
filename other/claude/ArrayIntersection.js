
const findIntersection = (nums, nums2) => {

    let set = new Set();
    let resultNums = [];
    let number = 0;


    for (let i = 0; i < nums.length; i++){

        set.add(nums[i]);
    }

    for (let j = 0; j < nums2.length; j++){

        if (!resultNums.includes(nums2[j])){
            if (set.has(nums2[j])) {
            resultNums[number++] = nums2[j];
        }
        }
    }

    return resultNums;
}

const nums = [1,13,165,1,31,5,3,1];
const nums2 = [11,3,163,1,13,1,2,5];

for (let i of findIntersection(nums, nums2)){
    console.log(i);
}