# FunctionalProgramming
# Higher Order Functions:

---

- These are the functions that can accept other functions as parameters, return functions as parameters and can do both.
- Instead of passing Int, String and other data as parameters, we can pass functions as parameters to other functions.

- for eg:
    
    fun funName(param1, param2,::OtherFun){
    
    // Here param1 and param2 are normal parameters whereas the OtherFun is a function passed as parameter//
    
    // Note that while passing function as a parameter you should use :: operator //
    
    }
    

- Higher Order functions are possible as functions are treated as normal objects in Kotlin and they can be passed as parameters.

# Lambda functions:

- Also known as anonymous functions, They don’t have any name.
- Defined within curly braces {} , takes variables as parameters and body of the function defined after variables using - > operator.
    
    
    val var_name = { // Definition of Lambda function//
    
    var1 : Type , var2 : Type - > Expression}
    

A higher Order function can be converted into lambda function by passing lambda function as parameter.
