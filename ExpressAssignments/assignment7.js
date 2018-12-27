var express = require('express');
var app = express();
app.get('/items',function(req,res){

var arr3 = [ 'bag', 'jeans', 'perfumes','shoes' ];
for( var i=0;i<arr3.length;i++){
res.send('item is:'+ arr3[i]);
}

var arr4=[599,999,399,899];
for(var j=0;j<arr4.length;j++){   
res.send('price is:'+ arr4[j]);
}
});
app.listen(3000);