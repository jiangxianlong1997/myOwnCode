// /**
//  * the survey application used in tutorial
//  */
//
// var express = require('express')
// var path = require('path')
// var bodyParser = require('body-parser');
//
// var app = express()
// var products=['iPhone XS Max', 'Huawei Mate 20X', 'Pixel 3 XL', 'Samsung S10']
// var surveyresults = {
// 	fp:[0,0,0,0],
// 	mp:[0,0,0,0]
// }
//
// app.use(bodyParser.json())
// app.use(bodyParser.urlencoded())
// app.set('views', path.join(__dirname,'views'));
// app.use(express.static(path.join(__dirname, 'public')));
// console.log("in js")
// app.get('/', function(req,res){
// 	console.log("in get")
// 	console.log(req.body)
// 	res.render('survey.ejs',{products:products})
// });
// app.post('/survey', function(req,res){
// 	console.log("in post")
// 	console.log(req.body)
// 	console.log(req.body["gender"])
// 	if (req.body["gender"] === '0') {
// 		console.log("in 0")
// 		surveyresults['fp'][parseInt(req.body["vote"])]++;
// 		console.log(surveyresults)
// 	} else if (req.body["gender"] === '1') {
// 		console.log("in 1")
// 		surveyresults['mp'][parseInt(req.body["vote"])]++;
// 	}
//
// 	res.render('surveyresult.ejs', {products: products, surveyresults: surveyresults})
// });
// app.listen(3000, function () {
//   console.log('survey app listening on port 3000!')
// })