/*  Fibonacci Algorithm */

object Fibonacci extends App{
    def fibo(x:Int):Int = {
        x match {
            case 0 if(x == 0) => 0
            case 1 if(x == 1) => 1
            case n => fibo(x-1)+fibo(x-2) //Classic 
        }
    }


    //Prove:
    println(fibo(0))
    println(fibo(1))
    println(fibo(2))
    println(fibo(3))
    println(fibo(4))
    println(fibo(5))
    println(fibo(6))
    println(fibo(7))
    println(fibo(8))
    println(fibo(9))
    println(fibo(10))
    println(fibo(11))
}

