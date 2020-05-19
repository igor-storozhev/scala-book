trait Philosophical {
    def philosophize() {
        println("I am consuming memory, therefore I am!")
    }
}

class Frog extends Philosophical {
    override def toString = "green"
}

val frog = new Frog
frog.philosophize()

val phil: Philosophical = frog
phil.philosophize()