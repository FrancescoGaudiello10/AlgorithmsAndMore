/* Euclidean Algorithm */

// Classic MCD 

object Eucledian extends App{

    def gcd(x: Int, y: Int): Int = {
        if (y == 0) x
        else
            gcd(y, x%y)
    }

    //Prove: 
    println("MCD => "+gcd(10,20))
    println("MCD => "+gcd(4,6))
    println("MCD => "+gcd(2,4))
    println("MCD => "+gcd(2,5))
    println("MCD => "+gcd(504,878))

}

