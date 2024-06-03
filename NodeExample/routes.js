module.exports = function (app) {
    app.get('/', function (req, resp) {
        resp.json({ msg: 'Hello' })
    });
    app.get('/employee', function (req, resp) {
        var e = { id: 1, ename: 'James', job: 'Developer' }
        resp.json(e);
    });
}