
const numberReversal = (num) => {

    if (num < 0) return -1;
    else if (num < 10) return num;

    let cloneNum = num;
    let reverseNum = 0;

    while (cloneNum > 0){
        let remainder = cloneNum % 10;
        reverseNum = reverseNum * 10 + remainder;
        cloneNum = Math.floor(cloneNum / 10);
    }

    return reverseNum;
}

let num = 568;
console.log(numberReversal(num));
