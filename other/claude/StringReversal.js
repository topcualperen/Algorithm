
const reverseWord = (word) => {

    let reversedWord = word.split('').reverse().join('');
    return reversedWord;
}

let word = "alper";
console.log(reverseWord(word));