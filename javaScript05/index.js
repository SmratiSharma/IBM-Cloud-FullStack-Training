// let a = 5;
// let b =6.7;

// console.log(a + b);

// var c;

// console.log(a+b, a-b, c, a*b );

// let arr = [1, 2, "hello", 3, 4, 5];


// //for of is used to iterate over the values of an iterable object like an array, while for in is used to iterate over the keys (or indices) of an object or array.
// for(let  e of arr){
//     console.log(e);
// }

// for(let i in arr){
//     console.log(i);
// }

// //function declaration
// function sum(a, b){
//     console.log(a+b);
//     return a + b;
// }

// console.log(sum(5, 6));

// function sum(a=10, b){
//     console.log(a+b);
//     return a + b;
// }

// sum(null, 9);

// // function closure(){
// //     var a2 = 5;
// //     function inner(){
// //         console.log(a2);
// //     }
// //     inner();
// // }

// function closure(){
//     var a2;
//     function inner(){
//         a2 = 5;
//         console.log(a2);
//     }
//     console.log(a2);
//     inner();
// }

// closure();

// let l = 5;
// var v = 6;

// {
//     // let l = 10; // This l is block-scoped, different from the global l
//     // var v = 20; // This v is function-scoped, it will overwrite the global v
//     console.log("Inside block, l:", l); // 10
//     console.log("Inside block, v:", v); // 20
// }

// console.log("Outside block, l:", l); // 5
// console.log("Outside block, v:", v); // 20

// let str = "Smrati Sharma";
// console.log(str.length);
// console.log(str.toUpperCase());
// console.log(str.includes("tiS"));


let arr2 = [1, "Smrati", true, undefined, null, 90];
// console.log(arr2.length);
// console.log(arr2[0]);
// console.log(arr2.indexOf("Smrati"));

// arr2.forEach(function(element, index){
//     console.log(element, index);
// })


let obj = {
    name: "Smrati",
    city: "Delhi",
    isStudent: true
}

arr2.filter(e => e%2==0).forEach(e => console.log(e));
arr2.map(e => e * 2).forEach(e => console.log(e));

// arr.sort();


let cal = {
    sum : (...e) => e.reduce((acc, e) => acc + e, 0),
    sub : (a, b) => e.reduce((acc, e) => acc - e, 0)
}


//this is called hoisting, where the variable declaration is moved to the top of its scope, but the assignment remains in place. Therefore, when you try to log 'a' before it is assigned a value, it will output 'undefined'.
console.log(a);
var a = 10;

const c = setTimeout(() =>{
    console.log("Smrati is the best.")
}, 2000);

clearTimeout(c);

let count = 0;

function getData(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            if(count > 5){
                resolve("Data fetched successfully");
            }else{
                reject("Error: Data fetch failed");
            }
        }, 1000);
    });
}

getData().then((data) => console.log(data)).catch((error) => console.log(error));

fetch("https://jsonplaceholder.typicode.com/posts")
    .then(((response) => response.json()))
    .then((data => data.filter((d) => d.userId == 1 || d.userId  == 2)))
    .then((data) => console.log(data))
    .catch((error) => console.log(error));