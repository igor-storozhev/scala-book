def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
        if(num < 0)
            exists = true
    exists
}
def containsNeg2(nums: List[Int]): Boolean = nums.exists(_ < 0)

def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
        if(num % 2 == 1)
            exists = true
    exists
}
def containsOdd2(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)

println(containsNeg(List(1,2,3,-4,5)))
println(containsNeg(List(1,2,3,4,5)))

println(containsNeg2(List(1,2,3,-4,5)))
println(containsNeg2(List(1,2,3,4,5)))
println(containsNeg2(Nil))

println(containsOdd(List(1,2,3,4)))
println(containsOdd(List(8,2,6,4)))

println(containsOdd2(List(1,2,3,4)))
println(containsOdd2(List(8,2,6,4)))