var request = require('request');

var wikiEndpoint = "https://en.wikipedia.org/w/api.php";
var parameters = [
    "titles=CNN",
    "rvstart=2020-03-01T10:00:00Z",
    "rvdir=newer",
    "action=query",
    "prop=revisions",
    "rvlimit=500",
    "rvprop=ids|flags|user|userid|timestamp|size|sha1|parsedcomment",
    "formatversion=2",
    "format=json"
]

var url = wikiEndpoint + "?" + parameters.join("&");
console.log("url: " + url);

var options = {
    url: url,
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Accept-Charset': 'utf-8'
    }
};

request(options, function (err, res, data){
    if (err) {
        console.log('Error:', err);
    } else if (res.statusCode !== 200) {
        console.log('Error status code:', res.statusCode);
    } else {
        var json = JSON.parse(data);
        var pages = json.query.pages;
        console.log("pages:\n" + JSON.stringify(pages));
    }
});
