package lessons.lesson09.homework

fun main() {
    // Работа с массивами Array
    //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val a1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    //Создайте пустой массив строк размером 10 элементов.
    val a2 = Array(10) {""}
    //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val a3: Array<Double> = Array(5) {0.0}
    for (i in a3.indices) {
        a3[i] = i*2.0
    }
    println(a3.joinToString(", "))

    //Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
    // равное его индексу, умноженному на 3.
    val a4: Array<Int> = Array(5) {0}
    for (i in a4.indices) {
        a4[i] = i*3
    }

    //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val a5v0: Array<String?> = arrayOf(null, "первая", "вторая")
    val a5v1 = arrayOf<String?>(null, "первая", "вторая")
    val a5v2 = arrayOfNulls<String>(3)
    a5v2[1] = "первая"
    a5v2[2] = "вторая"

    //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val a6 = arrayOf(1, 46, 9999)
    val a6new: Array<Int> = Array(a6.size) {0}
    for (i in a6.indices) {
        a6new[i] = a6[i]
    }
    println(a6new.joinToString(", "))

    //Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    // Распечатайте полученные значения.
    val a7v1: Array<Int> = arrayOf(1, 1, 2, 2)
    val a7v2: Array<Int> = arrayOf(10, 10, 20, 20)
    val a7v3: Array<Int> = Array(a7v1.size) {0}
    for (i in a7v3.indices) {
        a7v3[i] = a7v2[i] - a7v1[i]
    }
    //Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1.
    // Реши задачу через цикл while.
    val a8 = arrayOf(1, 2, 3, 4, 6, 7, 8)
    var i8 = 0
    var flag8 = false
    while (i8 < a8.size) {
        if (a8[i8] == 5) {
            println(i8)
            flag8 = true
        }
        i8++
    }
    if (!flag8) {println("-1")}

    //Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
    // Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val a9 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    for (item in a9) {
        if (item % 2 == 0) { println("чётное") }
        else { println("нечётное") }
    }
    //Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
    // в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    fun a10(array: Array<String>, searchBy: String) {
        for (item in array) {
            if (item.contains(searchBy)) {println(item)}
        }
    }

    a10(arrayOf("abc", "def", "efe"), "ef")

    // Работа со списками List
    //Создайте пустой неизменяемый список целых чисел.
    val l1: List<Int> = listOf()
    println(l1)
    //Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val l2: List<String> = listOf("Hello", "World", "Kotlin")
    //Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val l3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    //Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val l4: MutableList<Int> = mutableListOf(1)
    l4.add(6)
    l4.add(7)
    l4.add(8)
    //Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val l5: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    l5.remove("World")
    println(l5)
    //Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val l6: List<Int> = listOf(1, 2, 3, 4, 5)
    for (item in l6) {
        println(item)
    }
    //Создайте список строк и получите из него второй элемент, используя его индекс.
    val l7: List<String> = listOf("Hello", "World", "Kotlin")
    println(l7[1])
    //Имея изменяемый список чисел, измените значение элемента на определенной позиции (например,
    // замените элемент с индексом 2 на новое значение).
    val l8: MutableList<Int> = mutableListOf(1, 10, 100)
    l8[2] = 123
    println(l8)
    //Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
    // Реши задачу с помощью циклов.
    val l9v1: List<String> = listOf("Hello", "World", "Kotlin")
    val l9v2: List<String> = listOf("one", "two", "three", "four", "five")
    val l9v3: MutableList<String> = mutableListOf()
    for (item in l9v1) {
        l9v3.add(item)
    }
    for (item in l9v2) {
        l9v3.add(item)
    }
    println(l9v3)
    //Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val l10: List<Int> = listOf(10, 2, -3, 4, 5)
    var min = 0
    var max = 0
    for (item in l10) {
        if (item <= min) {
            min = item
        }
        else if (item >= max) {
            max = item
        }
    }
    println("min: $min max: $max")

    //Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val l11: List<Int> = listOf(10, 2, -3, 4, 5)
    val l11even: MutableList<Int> = mutableListOf() // Variable is never modified, so it can be declared using 'val'
    for (item in l11) {
        if (item % 2 == 0) {
            l11even.add(item)
        }
    }
    println(l11even)

    // Работа с Множествами Set
    //Создайте пустое неизменяемое множество целых чисел.
    val s1: Set<Int> = setOf()
    //Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val s2 = setOf<Int>(1, 2, 3)
    //Создайте изменяемое множество строк и инициализируйте его несколькими значениями
    // (например, "Kotlin", "Java", "Scala").
    val s3 = mutableSetOf<String>("Kotlin", "Java", "Scala")
    //Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val s4 = mutableSetOf<String>("Kotlin", "Java", "Scala")
    s4.add("Swift")
    s4.add("Go")
    println(s4)
    //Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val s5 = mutableSetOf<Int>(3, 2, 6)
    s5.remove(2)
    println(s5)
    //Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val s6 = setOf<Int>(1, 2, 5, 8)
    for (item in s6) {
        println(item)
    }
    //Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве
    // указанная строка. Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
    fun s7(arg1: Set<String>, arg2: String) {
        for (item in arg1) {
            if (item == arg2) {
                println(true)
            }
        }
    }
    s7(setOf("a", "b"), "b")
    //Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла
    val s8: Set<String> = setOf("Kotlin", "Java", "Scala")
    val s8New: MutableList<String> = mutableListOf()
    for (item in s8) {
        s8New.add(item)
    }
    println(s8New)
}
