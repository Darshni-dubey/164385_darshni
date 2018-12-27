var fruits = ["Banana", "Orange", "Apple", "Mango"];
$.ajax("/send", {
     data: { "strArr": fruits.join() },
     type: "POST",
     async: true,

router.post('/send', function(req, res) {
    var fruits = req.body.strArr.split(",");
    console.log(fruits); // This is an array
});