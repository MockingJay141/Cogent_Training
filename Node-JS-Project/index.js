var express = require("express");

var app = express();

app.get('/', function(req, resp){
    resp.send("This is GET Operations");
});


app.post('/', function(req, resp){
    resp.send("This is POST Operations");
});

app.put('/', function(req, resp){
    resp.send("This is PUT Operations");
});

app.delete('/', function(req, resp){
    resp.send("This is DELETE Operations");
});

app.listen(9000, ()=>console.log("API Started listening..."));