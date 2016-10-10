def name = "my name"
def date = new Date().format ("dd-mm-yyyy")
def fruitBag = ["orange","banana","coconut"]

// ex 01 (*). print "my name: 06-18-2016" on the output console using a GString
println "$name: 06-18-2016" 
// ex 02 (*). use a loop for printing the members of 
// the collection fruitBag
for(fruit in ["orange","banana","coconut"]){
  println fruit
}
// ex 03 (*). define a function that given a range of integers, 
// determines the average

def determineAverage(list){
list.sum()/list.size()
}


// ex 04 (**). using a closure check whether fruitBag 
// contains 'banana' 
  println 'banana' == fruitBag.find{it == 'banana'}
//if it contains banana it returns the word banana.

// ex 05 (**). using a closure check whether all the words
// in fruitBag contain the letter 'n'
  println fruitBag.every({it.contains)