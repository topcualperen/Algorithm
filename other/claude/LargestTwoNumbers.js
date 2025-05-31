
const nums = [1, 31, 65, 16, 51, 6, 5315];

const largerstTwoNumbers = (arr) => {
  let firstNum = Math.max(arr[0], arr[1]);
  let secondNum = Math.min(arr[0], arr[1]);

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > firstNum) {
      secondNum = firstNum;
      firstNum = arr[i];
    } else if (arr[i] < firstNum && arr[i] > secondNum) secondNum = arr[i];
  }

  return [firstNum , secondNum];
};

console.log(largerstTwoNumbers(nums));
