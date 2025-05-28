
const largestElement = (arr) => {

    let biggestNumber = arr[0];

    for (let i = 1; i < arr.length; i++){

        if (arr[i] > biggestNumber) biggestNumber = arr[i];
    }

    return biggestNumber;
}

const arr = [1,2,3,34,5,45,21,3,8];
console.log(largestElement(arr));