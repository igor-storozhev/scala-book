trait Philosophical {
    def philosophize() {
        println("I am consuming memory, therefore I am!")
    }
}

trait HasLegs
class Animal

class Frog extends Animal with Philosophical with HasLegs {
    override def toString = "green"
}

val frog = new Frog
frog.philosophize()

