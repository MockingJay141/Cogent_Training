console.log("Welcome to Node.Js");

var v = 100;
console.log(v);
console.log(typeof v);



var items = ["pencil","eraser","sharpner","scale"];
 
console.log ( items );
console.log ( items[0]);
console.log ( items[1]);
 
console.log ( items.length);
console.log ( items[items.length-1]);   



var items = ["pencil","eraser","sharpner","scale"];
console.log (`All items are: ${items}` );
console.log ( `First item is: ${items[0]}`);
console.log ( `Second item is: ${items[1]}`);
console.log (`No. of items : ${items.length}`);
console.log (`Last item is: ${items[items.length-1]}` );



var items = ["pencil","eraser","sharpner","scale"];
console.log ( items );
 
items.push("paper");
console.log ( items);
 
items.splice(2,1,"rani");
console.log ( items );
 
items.unshift("gum");
console.log(items);



var e1={id:1, ename:"Allen", job:"Trainer", salary:5500};
 
console.log ( e1.id );
console.log ( e1.ename);
console.log ( e1.job );
console.log ( e1.salary);


var employees = [
    {id:201,ename:"Allen",job:"Admin",salary:12000},
    {id:202,ename:"Bobby",job:"Programmer",salary:15000},
    {id:203,ename:"Cathe",job:"Trainer",salary:21000},
    {id:204,ename:"David",job:"Developer",salary:18000}
];
for ( var i=0 ; i<employees.length ; i++ )
    console.log ( employees[i].id+" "+employees[i].ename+" "+employees[i].job+ " "+employees[i].salary);

