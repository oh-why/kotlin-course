package lessons.lesson17.homework

// 1. Игровой автомат
//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var)
// и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)
//Поля:
//цвет
//модель
//включен
//ОС загружена
//список установленных игр
//наличие джойстика
//баланс вырученных средств
//владелец
//телефон поддержки.
//игровой сеанс оплачен
//стоимость одного игрового сеанса
//пин-код автомата
//Методы:
//включить
//выключить
//загрузить ОС
//завершить работу ОС
//показать список игр
//включить игру
//оплатить игровой сеанс
//забрать наличные с помощью пин-кода
//открыть сейф и выдать наличные
class GameMachine(
    val model: String,
    val colour: String
) {
    private var isOn = false
    private var isOSLoaded= true
    var gamesList: MutableList<String> = mutableListOf("1", "2")
    val hasJoystick = true
    private var incomeBalance: Double = 0.0
    private var owner = "a"
    private var supportPhone = "123"
    private var isSessionPayed = false
    private var costPerSession = 1000.5
    private var pin = 1000

    fun turnOn() {}
    fun turnOff() {}
    private fun loadOS() {}
    private fun stopOS() {}
    fun showGames(): List<String> {
        return gamesList.toList()
    }
    fun startGame(game: String) {}
    fun payForSession() {}
    fun withdrawCash(pin: Int) {}
    private fun openSafe() {}
}

//2. Почемучка
// Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях и заданным образом
// доработать класс ChildrenClass (BaseClass доработке не подлежит)
abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // в ChildrenClass поле с таким названием public
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    // оно наследуется как Protected => доступно внутри класса и в производных классах
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()" // ???
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. объясни, почему эта функция не может быть публичной
    // из-за protected class ProtectedClass
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // override
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    // private class PrivateClass
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // это поле
    publicVal: String,
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // наследуется из BaseClass
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // нет override privatePrint
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun changeProtected(value: String) {
        protectedField = value
    }
}

fun main() {
    val obj = ChildrenClass(
        privateVal = "aaa",
        protectedVal = "protectedVal",
        publicVal = "publicVal"
    )
    obj.publicField = "Антонио Бандераса"
    println(obj.getAll())
    obj.changeProtected("new value")
    println(obj.getAll())
    obj.printText()
}