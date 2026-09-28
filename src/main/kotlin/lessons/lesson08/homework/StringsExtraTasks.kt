package lessons.lesson08.homework

//Задания повышенной сложности. Оформляются в отдельном файле.
fun main() {
    correctCases("klmfdkvm JDLFD lIkr")
    encrypt("Kotlin")
    encrypt("Kot")
    decrypt("oKltni")
    decrypt("oK t")
    multitable(3, 5)
    multitable(15, 4)
}
//7. Все слова с большой буквы
//Напишите метод, который преобразует строку из нескольких слов в строку, где каждое слово начинается
// с заглавной буквы а все остальные - строчные. Используй перебор, анализ символов и замену букв
// на заглавную с помощью метода uppercase() для конкретной буквы.
fun correctCases(arg: String) {
    val arr = arg.split(" ")
    var newLine = ""
    for (word in arr) {
        newLine += word[0].uppercase()
        for (i in 1 until word.length) {
            newLine += word[i].lowercase()
        }
        newLine += " "
    }
    println(newLine)
}
//8. Игра в разведчика
//Напишите шифратор/дешифратор для строки. Шифровка производится путём замены двух соседних букв
// между собой: Kotlin шифруется в oKltni. Дешифровка выполняется аналогично.
//Если длина строки - нечётная, в конец добавляется символ пробела до начала шифрования.
// Таким образом все шифрованные сообщения будут с чётной длинной. Должно получиться два
// публичных метода: encrypt() и decrypt() которые принимают строку и печатают результат в консоль.
fun encrypt(arg: String) {
    var value = arg
    if (arg.length % 2 != 0) {
        value += " "
    }
    var result = ""
    for (i in 0 until value.length step 2) {
        result += value[i+1]
        result += value[i]
    }
    println(result)
}

fun decrypt(arg: String) {
    var value = arg
    if (arg.length % 2 != 0) {
        value += " "
    }
    var result = ""
    for (i in 0 until value.length step 2) {
        result += value[i+1]
        result += value[i]
    }
    println(result)
}


//9. Таблица умножения
//Напишите функцию, которая принимает два числа и выводит таблицу умножения, у которой в заголовках
// столбцов и строк находятся перемножаемые числа, а в перекрестии заголовка и столбца - результат
// перемножения. Важно: каждый столбец должен быть выровнен по правому краю с помощью шаблона
// с форматированием строк. Размер форматирования каждой строки нужно вычислять динамически
// для каждого столбца. Результат должен быть похож на этот пример:
fun multitable(arg1: Int, arg2: Int) {
    print(" \t")
    for (k in 1..arg2) {
        print("$k\t")
    }
    println()
    for (i in 1..arg1) {
        print("$i\t")
        for (k in 1..arg2) {
            val value = i * k
            print("$value\t")
        }
        println()
    }
    println("----")
}
