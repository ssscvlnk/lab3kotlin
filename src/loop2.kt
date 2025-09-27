fun main() {
//    var number = 1
//    while (number <= 5) {
//        println("Число: $number")
//        number++
//    }
    var number1 = 0
    while (number1 < 10) {
        number1++
        if (number1 == 3) {
            println("Останавливаемся на $number1")
            continue
        }
        println(number1)
    }
}