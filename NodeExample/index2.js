var express = require("express");
var app = express();
var bodyParser = require("body-parser");
 
app.set('view engine','ejs');
app.use(bodyParser());
var routes = require('./routesModule');
 
app.get('/',function(req,resp){
    resp.render("index");
});
routes(app);
var employees = [
    {id:2001,ename:"Allen",job:"Trainer",salary:5500},
    {id:2002,ename:"Black",job:"Programmer",salary:5800},
    {id:2003,ename:"James",job:"Developer",salary:7500},
    {id:2004,ename:"Hani",job:"Trainer",salary:5500}
];
app.get('/employees/list',function(req,resp){
    var o = {employees:employees};
    resp.render('empList',o)
});

app.get('/employees/details/:id',function(req,resp){
    var id=req.params.id;
    var emp ={}; 
    emp= employees.find(x=>x.id==id);
    if ( emp==null)
        emp={id:id,ename:'Row Not Exist',job:'',salary:''};
    var o ={emp:emp};
    resp.render('empDetails',o);
});
app.get('/employees/create',function(req,resp){
    resp.render('empCreate');
})
app.post('/employees/create',function(req,resp){
    var emp = req.body;
    employees.push(emp);
    
    var o = {employees:employees};
    resp.render('empList',o)
})
app.get('/employees/delete/:id',function(req,resp){
    var id=req.params.id;
    var emp ={}; 
    emp= employees.find(x=>x.id==id);
    if ( emp==null)
        emp={id:id,ename:'Row Not Exist',job:'',salary:''};
    var o ={emp:emp};
    resp.render('empDelete',o);
});
app.delete('/employees/delete',function(req,resp){
    var id= req.body.id;
    var index = employees.findIndex(x=>x.id==id);
    employees.splice(index,1);
    var o = {employees:employees};
    resp.render('empList',o)
});
app.get('/employees/update/:id',function(req,resp){
    var id=req.params.id;
    var emp ={}; 
    emp= employees.find(x=>x.id==id);
    if ( emp==null)
        emp={id:id,ename:'Row Not Exist',job:'',salary:''};
    var o ={emp:emp};
    resp.render('empUpdate',o);
});
app.post('/employees/update',function(req,resp){
    var emp = req.body;
    var index = employees.findIndex(x=>x.id==emp.id);
    employees[index]=emp;
    
    var o = {employees:employees};
    resp.render('empList',o);
});
app.listen(9000,()=>console.log(" Project started listening..."));
