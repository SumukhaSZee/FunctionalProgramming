fun main(){
    val isEven = { a:Int -> a%2==0 } // A simple lambda function //
    println(isEven(4))
    val res = highFn(3.0,4.0,{a:Double,b:Double -> a+b})
    /* Note if lambda function is the last parameter of any function, it can be passed in the following form:
    val res = highFn(3.0,4.0,){a:Double,b:Double -> a+b}
     */
    println(res)
}

fun highFn(a:Double,b:Double,fn:(Double,Double)->Double):Double{
    val res = fn(a,b);
    return res;                 // A higherOrder function converted into lambda function //
}