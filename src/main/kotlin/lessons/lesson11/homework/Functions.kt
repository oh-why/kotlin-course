package lessons.lesson11.homework

fun main() {
    println(findFirstNegative(listOf(1, 12, -2, -3)))
    println(findFirstNegative(listOf(1, 12, 2, 3)))
}

// Задачи на сигнатуру метода
// Напишите сигнатуру метода в которую входит модификатор доступа, название функции,
// список аргументов с типами и возвращаемое значение.
// В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
//Не принимает аргументов и не возвращает значения.
fun e1() {}
//Принимает два целых числа и возвращает их сумму.
fun e2(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}
//Принимает строку и ничего не возвращает.
fun e3(arg1: String) {}
//Принимает список целых чисел и возвращает среднее значение типа Double.
fun e4(args: List<Int>): Double {
    return 0.0
}
//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun e5(arg: String?): Int? {
    return arg?.length
}
//Не принимает аргументов и возвращает nullable вещественное число.
fun e6(): Double? {
    return null
}
//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun e7(args: List<Int>?) {}
//Принимает целое число и возвращает nullable строку.
fun e8(arg: Int): String? {
    return null
}
//Не принимает аргументов и возвращает список nullable строк.
fun e9(): List<String?> {
    return listOf()
}
//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun e10(arg1: String?, arg2: Int?): Boolean? {
    return null
}

//Задачи на написание кода
//Напишите валидную сигнатуру метода а так же рабочий код для задач.
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(arg: Int): Int {
    return arg * 2
}

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное,
// и false в противном случае.
fun isEven(arg: Int): Boolean {
    if (arg % 2 == 0) {
        return true
    } else {
        return false
    }
}

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое
// отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(args: List<Int>): Int? {
    for (i in args) {
        if (i < 0) {
            return i
        }
    }
    return null
}

//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку
// и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение
// с помощью return без возврата значения.
fun processList(args: List<String?>) {
    for (item in args) {
        if (item == null) {
            return
        }
        else {
            println(item)
        }
    }
}
