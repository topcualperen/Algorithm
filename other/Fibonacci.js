
const fibonacci = (num) => {

    let a = 0;
    let b = 1;

    for (let i = 0; i < num; i++){

        console.log(a);
        let sum = a + b;
        a = b;
        b = sum;
    }
}

const num = 7;
console.log(fibonacci(num));