module.exports = function(app){
    app.get('/about',function(req,resp){
        resp.render("about");
    });
    app.get('/contact',function(req,resp){
        resp.render("contact");
    });
    app.get('/help',function(req,resp){
        resp.render("help");
    });
}
