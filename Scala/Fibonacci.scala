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
    println("F(0) => "+fibo(0))
    println("F(1) => "+fibo(1))
    println("F(2) => "+fibo(2))
    println("F(3) => "+fibo(3))
    println("F(4) => "+fibo(4))
    println("F(5) => "+fibo(5))
    println("F(6) => "+fibo(6))
    println("F(7) => "+fibo(7))
    println("F(8) => "+fibo(8))
    println("F(9) => "+fibo(9))
    println("F(10) => "+fibo(10))
    println("F(11) => "+fibo(11))
}

