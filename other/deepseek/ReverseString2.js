
const reverseString = (nums) => {

	let first = 0;
	let second = nums.length - 1;

	while (first < second){

		let temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
		first ++;
		second --;
	}

	return nums;
}

let nums = ['h','e','l','l','o'];

for (let m of reverseString(nums)){

	console.log(m);
}
