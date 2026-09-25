package lessons.lesson07.homework

fun main() {
    // Задания для цикла for
    //Прямой диапазон
    //Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        println(i)
    }

    //Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    //Обратный диапазон
    //Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        println(i)
    }

    //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1) {
        println(i - 2)
    }

    //С шагом (step)
    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        println(i)
    }

    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..2 step 3) {
        println(i)
    }

    //Использование до (until)
    //Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size = 13
    for (i in 2 until size step 3) {
        println(i)
    }

    //Задания для цикла while
    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var counter1 = 1
    while (counter1 <= 5) {
        println(counter1 * counter1)
        counter1++
    }

    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var counter2 = 10
    while (counter2 > 5) {
        counter2--
    }
    println(counter2)

    //Цикл do while
    //Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var counter3 = 5
    do {
        println(counter3)
    } while (counter3-- > 1)

    //Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter4 = 5
    do {
        println(counter4)
    } while (counter4++ < 10)

    //Задания для прерывания и пропуска итерации
    //Использование break
    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }

    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var counter5 = 1
    while (true) {
        if (counter5 == 10) break
        println(counter5++)
    }

    //Использование continue
    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var counter6 = 1
    while (counter6 < 10) {
        if (counter6++ % 3 == 0) continue
        else println(counter6++)
    }

    // 1 Используя вложенный цикл реализовать таблицу умножения, как на картинке
    for (i in 1..10) {
        for (k in 1..10) {
            print(i*k)
            print(" ")
            if (k == 10) println()
        }
    }

    example2(4)
    example3(5)
    example4(4)
    example5()
    example6(6)
}

//2 Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for.
// 'arg' - целочисленный аргумент функции.
fun example2(arg: Int) {
    println("//. 2")
    var sum = 0
    for (i in 1..arg) {
        sum += i
    }
    println(sum)
}
//Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun example3(arg: Int) {
    println("//. 3")
    var result = 1
    var counter = 2
    while (counter <= arg) {
        result *= counter
        counter++
    }
    println(result)
}
//Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun example4(arg: Int) {
    println("//. 4")
    var counter = 1
    var sum = 0
    while(counter <= arg) {
        if (counter % 2 == 0) {
            sum+=counter
        }
        counter++
    }
    println(sum)
}
//Напишите функцию, которая используя вложенные циклы while, выведет заполненный
// прямоугольник размером 5x3 из символов *.
fun example5() {
    println("//. 5")
    var counter1 = 3
    var counter2 = 5
    while (counter1 > 0) {
        while (counter2 > 0) {
            print("*")
            counter2--
        }
        println()
        counter1--
        counter2 = 5
    }
}
//Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun example6(arg: Int) {
    println("//. 6")
    var sum1 = 0
    var sum2 = 0
    for (i in 1..arg) {
        if (i % 2 == 0) {
            sum1 += i
        } else {
            sum2 += i
        }
    }
    println(sum1)
    println(sum2)
}
