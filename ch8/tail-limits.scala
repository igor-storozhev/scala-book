// compiled with error

def isEven(x: Int): Boolean = if(x == 0) true else isOdd(x-1)

def isOdd(x: Int): Boolean  = if(x == 0) false else isEven(x-1)

println(isEven(11))