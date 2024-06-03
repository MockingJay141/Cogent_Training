
/* var x=10;
var  y="10";
console.log(x==y);
console.log(x===y); */

/* var name="Satyank"
console.log(name)
console.log(`${name}`);
console.log(name.length)
console.log(name.toUpperCase())
console.log(name.toLowerCase())
console.log(name.indexOf('a'))
console.log(name.lastIndexOf('a'));
console.log(name.substr(0,3))
console.log(name.substr(1,3)); */

/* var d=new Date();
console.log(d.getDate())
console.log(d.getMonth()+1)
console.log(d.getFullYear())
console.log(d.getHours())
console.log(d.getMinutes())
console.log(d.getSeconds())
console.log(d.toLocaleDateString())
console.log(d.toLocaleTimeString()) */

/* for(let i=1;i<=10;i++){
    console.log(i)
}
  

  console.log(i) */

/* var item=["1","2","3"]
var item1=["pencil",1,'sharpner','scale']
 var x="10";
 console.log(typeof x)
console.log(typeof item);
console.log(typeof item1);
console.log(item)
console.log(item1) */

/* var item=["1","2","3"]
var item1=["pencil",1,'sharpner','scale']

for(let i of item)
console.log(i)

for(let i of item1)
console.log(i)

for(let i in item)
console.log(item[i])

for(let i in item1)
console.log(i) */


/* var item=["pencil",1,'sharpner','scale']
console.log(item)
item.push("paper")
console.log(item)
item.splice(2,1,"abc")
console.log(item)
item.unshift("gum")
console.log(item)
item.pop()
console.log(item)
item.shift()
console.log(item)
item.splice(2,2)
console.log(item) 
nodemon
*/

/* var e = { id: 1, ename: 'Irfan', job: 'Trainer' }
console.log(typeof e);
console.log(e.id)
console.log(e.ename)
console.log(e.job)
e.address='USA'
console.log(e) */

/* var employee=[
    {id:1,name:"Allen",job:"Manager",salary:345678},
    {id:2,name:"Satyank",job:"Developer",salary:2345678},
    {id:3,name:"Nikhil",job:"Tester",salary:345078},
    {id:4,name:"Hani",job:"Team Lead",salary:3456781}
]; */
/* for(let i=0;i<employee.length;i++){
   // console.log(employee[i].id+","+employee[i].name+","+employee[i].job+", "+employee[i].salary)
   var e=employee[i];
   console.log(e.id+","+e.name+","+e.job+","+e.salary)
} */

/* for(let e of employee){
    console.log(e.id+","+e.name+","+e.job+","+e.salary);
} */

/* for(let e of employee){
   for(var i in e){
       console.log(`${i}=${e[i]}`)
   }
}
*/
/*
  java script module
   it a file which contain code and we can export.
   The code inside module are imported in other file all together or specified .
*/

/* var m1= require('./myModule').employee

//console.log(m1);
//console.log(m1.location)
for(let e of m1){
    console.log(e.id+","+e.name+","+e.job+","+e.salary); 
}
 */

/* 
Function


*/

/* function sayHello(){
    console.log("From sayHello Function")
} */

/* function table(n){
  return n*n;
}

var result= table(18);
console.log(result);
console.log(table(10)); */

/* 
 Function Expression
    The function defination can be assigned to a variable, called as a function .
       FE be provide without name*/

/* var addition = function (x) {
    return x*x
}

console.log(addition(10)) */

/* var sayHello=require('./myModule').sayHello
var display=require('./myModule').display */

/* sayHello();
display(); */
/* 
  IIFE(Immediate invoked function Expression)
  This is self invoking function, similar 
  to constructor
   It is mainly used to intialize the value
*/

/* (function(name){
  console.log(`${name}`);

}) ('Irfan'); */

/* var iife1= require('./myModule');
            iife1 */

/*  console.log('sfsd')

(function(name){
   console.log(`${name}`);
 
 }) ('Irfan'); */


//Arrow Function

//  ()=>statement

// argument=> statement
// (argument1,argument2)=>statement


/* var wishes=()=>console.log("Hello, welcome to the arrow function");
  wishes();

  var square=x=>x*x;
  console.log(square(8));

  var add=(a,b)=>a+b;
  console.log(add(10,20));

  var big=(a,b)=>a>b?a:b;
  console.log(big(20,10));

  var upper=x=>x.toUpperCase();
  var lower=x=>x.toLowerCase();
  var len=x=>x.length;

  console.log(upper("irfan"));
  console.log(lower("IRFAN"));
  console.log(len("irfan")); */

/* var x = require('./myModule').square;
var y = require('./myModule').add;
console.log(x + "," + y); */

// Asynchronous programming
// it refers to process of all data that  requests at a time asynchronously without blocking IO
// using callback function 

/* function name(functionName){

} */

/* function display(cb) {
    cb();
}

function morning() {
    console.log('Good Morning');
}

function afternoon() {
    console.log('Good Afternoon')
}

display(morning);
display(afternoon);

display(function(){// FE
    console.log('From FE');
})

display(()=>console.log('From Arrow Function')); // Arrow Function */

//callback with Parameterized

//var calculate=function(ip,cb)

/* var calculate= function(ip,cb){
    return cb(ip);
}

var square=function(n){
    return n*n
}

var factorial= function(n){
    var f=1;
    for(var i=n;i>=1;i--)
        f*=i; // f=f*i

        return f;
    
}

console.log(calculate(5,square));
console.log(calculate(6,factorial)); */

// promise







//promise
//promise is a method that eventually produces a value. It can be considered as  the Asynchronous counterparts of 
// a getter function.
//Asynchronous all the statement will be processed in parallel called Asynchronous using promise.
// 

/* var promise1= new Promise(resolve,reject){
   if(condition)
      resolve(data)
      else
         reject(data)

}) 

   promise1
      .then(callback)
      .error(callback)
 
*/
/* var status=true;
 var promise1=new Promise((resolve,reject)=>{
  if(status){
      resolve("Primise satisfied, request processed")
  }
  else{
      reject("promise failed request not processed")
  }
 });

 promise1
 .then(x=>console.log(x))
 .catch(x=>console.log(x)) */

//HTTP Protocol

/* var http= require("http"); //step1
var server=http.createServer(); //step2
server.on('request',function(){
  console.log('A connection made from client...')
})
server.listen(1000,function(){
  console.log("server started listening...")
})
*/

var http = require("http"); //step1
var server = http.createServer((request, response) => {
    response.writeHead(200, { 'content-type': 'text/html' });

    var employees = require('./myModule').emps
    var msg = `<h1>Html Content</h1>
           <table border="1">
           <tr>
           <th>EMP ID </th>
           <th>Ename </th>
           <th>job</th>
           <th>Salary</th>
           </tr>
  ${employees.map(e => `<tr>` + `<td>` + e.id + `</td>` +
        `<td>` + e.name + '</td>' +
        `<td>` + e.job + '</td>' +
        `<td>` + e.salary + '</td>' +
        `</tr>`).join(' ')}
           </table>`
        response.write(msg);
        response.end();
      });
        
    

     server.listen(9000,()=>{
        console.log("server started listening");
     })
      









