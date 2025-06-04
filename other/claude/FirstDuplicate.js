
const findFirstDuplicate = (arr) => {

	const set = new Set();
	let resultNumber = arr[0];

	for (let i = 0; i < arr.length; i++){

		if (set.has(arr[i])) {
			resultNumber = arr[i];
			break;
		}
		set.add(arr[i]);
	}

	return resultNumber;
}


const arr = [1,2,3,45,64,13,45,44,3,898];

console.log(findFirstDuplicate(arr));
