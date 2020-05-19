var assertionsEnabled = true

def myAssert(predicate: () => Boolean) =
    if(assertionsEnabled && !predicate())
        throw new AssertionError

def byNameAssert(predicate: => Boolean) =
    if(assertionsEnabled && !predicate)
        throw new AssertionError

def boolAssert(predicate: Boolean) =
    if(assertionsEnabled && !predicate)
        throw new AssertionError

myAssert(() => 1 == 1)
byNameAssert(5 > 3)
boolAssert(5 > 3)

assertionsEnabled = false
byNameAssert(3/0 == 3)
//boolAssert(3/0 == 3)

