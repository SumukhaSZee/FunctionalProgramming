// Higher Order Functions and Lambda functions //

fun main(args: Array<String>) {

    HigherOrderfn(3.0,4.0,::add)// function accepting a parameter as function //
    val res = add(8.0,5.0)// function returning a function//
    println(res)
    val res2 = HigherOrderfn2(3.0,5.0,::mul) // a function accepting function parameter and returning a function //
}

fun sum(a: Double,b: Double):Double{
    return a+b;
}
fun add(a:Double,b:Double):Double{
    return sum(a,b);                // function returning a function //
}
fun mul(a:Double,b:Double):Double{
    return a*b;
}

fun HigherOrderfn(a:Double,b:Double,fn:(Double,Double) -> Double){
    println(fn(a,b))
}

fun HigherOrderfn2(a:Double,b:Double,fn:(Double,Double)->Double):Double{
    val res = fn(a,b);
    println("result of multiplication"+res);
    return sum(a,b);
}
