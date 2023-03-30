/**
 * survey.server.controller.js
 *
 * This controller module exposes two methods:
 *  - showForm is used for displaying the form
 *  - showResult is used for showing the results
 * The methods are not mapped to URL yet
 */

var express = require('express');

module.exports.showForm = function (req, res) {
  products = req.app.locals.products;
  res.render('survey.ejs', {products: products});
};

module.exports.showResult = function (req, res) {
  // if gender == 0 then it's male (mp), else female (fp)
  var gender = (req.body.gender == '0') ? 'mp' : 'fp';

  // get vote index

  var voteIdx = req.body.vote;

  // 'req.app.locals' is used to share application scope variables from main file (server.js).
  // Each request object has a reference to the current running express application: req.app
  // This means that 'app.locals' can be used to store properties that are local variables
  // within the application (application scope data), you can refer to server.js and compare
  var products = req.app.locals.products;
  var surveyresults = req.app.locals.surveyresults;

  //get session
  let session = req.session;
  console.log(session)
  if (session && "vote" in session) {
    console.log("in")
    res.render('votedsurveyresult.ejs',
        {products: products, surveyresults: surveyresults, vote: session.vote})
  } else {
    // increment the vote for the selected phone
    session.vote = voteIdx
    surveyresults[gender][voteIdx]++;

    console.log(session.vote)
    res.render('surveyresult.ejs',
        {products: products, surveyresults: surveyresults, vote: voteIdx});
  }
};
