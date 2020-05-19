trait Philosophical {
    def philosophize() {
        println("I am consuming memory, therefore I am!")
    }
}

trait HasLegs
class Animal

class Frog extends Animal with Philosophical with HasLegs {
    override def toString = "green"
    override def philosophize() {
        println("It ain't easy being "+ toString + "!")
    }
}
val phrog: Philosophical = new Frog
phrog.philosophize()