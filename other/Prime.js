
const isPrime = (num) => {

    if (num < 2 || num % 2 === 0) return false;
    if (num === 2 || num === 3) return true;

    for (let i = 3; i <= Math.sqrt(num); i+=2){

        if (num % i === 0) return false;
    }
    return true;
}

let num = 13;
console.log(isPrime(num));