// let a : number = 10;
// let b : number = 20;

// let sum : number = a + b;

// console.log("Sum of the numbers is : " + sum);


function sum(...nums : number[]) : number {
    return nums.reduce((a,b) => a + b, 0);
}

console.log("Sum of the numbers is : " + sum(1,2,3,4,5,6,7,8,9));