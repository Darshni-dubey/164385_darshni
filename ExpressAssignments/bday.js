var express = require('express');
var app = express();
app.get('/year', function(req, res){
var age=req.query.dob;
var date=new Date();
var currentYear= date.getFullYear();
var diff = currentYear-age;
   res.send('Bday Year ' + diff);
});
app.listen(3000);