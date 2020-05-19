def f(): Int = try { return 1 } finally { return 2 } 
def g(): Int = try { 1 } finally { 2 }

println("f()="+f(), "g()="+g())
// so use finally only for side effects not for return value 