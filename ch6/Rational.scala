class Rational(n: Int, d: Int) {
    require(d != 0, "denominator can't be 0")
    
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n/g
    val denom: Int = d/g
    println("g=", g, "numer=", numer, "denom=", denom)

    def this(n: Int) = this(n, 1)

    override def toString = numer + "/" + denom
    
    private def gcd(a: Int, b: Int): Int =
        if(b == 0) a else gcd(b, a % b)

    def + (i: Int): Rational =
        new Rational(numer + i * denom, denom)
    def + (that: Rational): Rational = 
        new Rational(numer * that.denom +
            that.numer * denom, denom * that.denom)

    def - (that: Rational): Rational =
        new Rational( numer * that.denom - that.numer * denom,
                        denom * that.denom)
    def - (i: Int): Rational =
        new Rational(numer - i * denom, denom)

    def * (that: Rational): Rational =
        new Rational(numer * that.numer, denom * that.denom)
    def * (i: Int): Rational =
        new Rational(numer * i, denom)
    
    def / (that: Rational): Rational =
        new Rational(numer * that.denom, denom * that.numer)
    def / (i: Int): Rational =
        new Rational(numer, i * denom)
        
}


object Rational {
    def main(args: Array[String]) = {
        implicit def intToRational(x: Int) = new Rational(x)

        //for (arg <- args)
        //    println(arg + ": " + calculate(arg))
        val x = new Rational(1, 2)
        val y = new Rational(1, 2)

        println(x, y, x + y, x * y, x / y, x * 3, 2 * x)
        
    }
}