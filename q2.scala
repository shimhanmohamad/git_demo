object multiple {
    val numberDivide: Int => Unit = (number => {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                println("Multiple of Both Three and Five")
            } else {
                println("Multiple of Three")
            }
        } else {
            if (number % 5 == 0) {
                println("Multiple of Five")
            } else {
                println("Not a Multiple of Three or Five")
            }
        }
    })
}

object q1 extends App {
    print("Enter the number you want to test: ")
    val num = scala.io.StdIn.readInt()
    multiple.numberDivide(num)
}
