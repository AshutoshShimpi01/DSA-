/*
Tweeter alert Box-
var tweet = prompt("Compose Your Tweet: ");
var tweetCount = tweet.length;
alert("you have written" + tweetCount + "Chracter you have " + (140 - tweetCount) + "chracter remaining." );

*/


/*
varName.Slice():-
var tweet = prompt("compose your tweet");
var tweetUnder140 = tweet.slice(0,120);
alert(tweetUnder140);
    OR
alert(prompt("composed your Tweet").slice(0,140));
*/


/*
var name = "Ashutosh";
name = name.toUpperCase();
name = name.LowerCase();
*/

/* Firstlet toUpperCase
name=ashutosh To name=Ashutosh
var name = prompt("Composed your name");
var firstName = name.slice(0,1);
var upperF = firstName.toUpperCase();
var newName = name.slice(1,name.length);
newName = newName.toLowerCase();
var fname = upperF+newName;
alert(fname);
*/

/* Life in Weeks Code
function lifeInweeks(age)
{
  var yearsRemaining = 90 - age;
  var days = yearsRemaining * 365;
  var weeks = yearsRemaining * 52;
  var month = yearsRemaining * 12;

  console.log("you have "+ days + "days, "+ "weeks, and "+ months + "months left.");
}
lifeInweeks(12);
*/
