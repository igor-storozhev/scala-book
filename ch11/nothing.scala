def error(message: String): Nothing = 
    throw new RuntimeException(message)

def divide(x: Int, y: Int): Int =
    if(y != 0) x/y
    else error("can't divide by zero.")

println(divide(4, 0))