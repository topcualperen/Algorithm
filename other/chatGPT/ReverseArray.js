
const reverseArray = (nums) => {

    let left = 0;
    let right = nums.length - 1;

    while (right > left){

        let temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left ++;
        right --;
    }

    return nums;
}

const nums = [153,1,63,1];
for (let i of reverseArray(nums)){
    console.log(i);
}