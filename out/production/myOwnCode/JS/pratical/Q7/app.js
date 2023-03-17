let express = require('express')
let app = express()
let seq = 1

app.use(function(req,res,next){
  console.log('Request' + seq + + ": " + req.url)
  seq++
  next()
})

app.get('/', function (req,res) {
  res.send("Hello world!")
})

app.get('/greeting',function (req, res){
  let name = "World"
  if(req.query.name)
    name = req.query.name
  res.send("Hello" + name)
})


app.listen(3000, function() {
  console.log("listen on port 3000")
})

module.exports = app;