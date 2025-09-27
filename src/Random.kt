import kotlin.random.Random

fun main() {
//    println(Random.nextInt(100))
//    println(Random.nextInt(1,100))
//    println(Random.nextLong(100))
//    println(Random.nextLong(1,100))
//    println(Random.nextFloat())
//    println(Random.nextDouble(5.0))
//    println(Random.nextDouble(0.0,5.0))
//    val target = Random.nextInt(1,100)
//    println("Угадай число от 1 до 100")
//    while (true) {
//        print("Введи число: ")
//        val input = readln().toInt()
//        when {
//            input < target -> println("Загаданное число больше.")
//            input > target -> println("Загаданное число меньше.")
//            else -> {
//                println("Поздравляю! Ты угадал число: $target")
//                break
//            }
//        }
//    }

//    val dice1 = Random.nextInt(1,7)
//    val dice2 = Random.nextInt(1,7)
//    val sum = dice1 + dice2
//    println("Первый кубик: $dice1")
//    println("Второй кубик: $dice2")
//    println("Сумма: $sum")

    val n1 = Random.nextDouble(0.0,10.0)
    val n2 = Random.nextDouble(0.0,10.0)
    val n3 = Random.nextDouble(0.0,10.0)
    val sr = (n1+n2+n3)/3
    println("Числа: $n1, $n2, $n3")
    println("Среднее: $sr")
}