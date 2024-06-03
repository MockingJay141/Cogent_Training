
var express = require("express");
var app = express();
 app.set('view engine','ejs');
 app.get('/',function(req,resp){
    resp.render('index')
 });
 // sending data from js to ejs
 app.get('/fruits',function(req,resp){
    var fruits=['Apple','Banana','Cherry'];
    var o={f:fruits};
    resp.render('fruits',o)
 });

 app.get('/post',function(req,resp){
    
    var o={msg:'Hi ,Welcome to post request'};
    resp.render('index1',o);
 });


app.listen(9000, () => console.log("API started Listening"));

// ejs--embedded java script-- template/ view 
// it is external module used to render a page html and view engine for programming
// send data from ejs to js--sending data from presentation layer to Application layer