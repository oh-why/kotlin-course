package lessons.lesson18.homework

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

// Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.
//Холодильник
//Стиральная машина
//Умная лампа
//Электронные часы
//Робот-пылесос
//Механические часы
//Фонарик
//Кофемашина
//Умная колонка
abstract class RefrigeratorAbstract: Powerable, Openable, TemperatureRegulatable, Cleanable
abstract class WashingMachineAbstract: Powerable, Openable, TemperatureRegulatable, WaterConnection, AutomaticShutdown,
    Drainable, Timable, Cleanable
abstract class SmartLamp: Powerable, AutomaticShutdown, LightEmitting, Programmable
abstract class ElectronicWatch: Powerable, Timable, BatteryOperated, Rechargeable
abstract class RobotVacuumCleaner: Powerable, Openable, WaterContainer, AutomaticShutdown, Drainable, BatteryOperated,
    Movable, Cleanable, Rechargeable
abstract class MechanicalWatch: Mechanical
abstract class Flashlight: Powerable, BatteryOperated, LightEmitting, Rechargeable
abstract class CoffeeMaker: Powerable, Openable, WaterContainer, TemperatureRegulatable, AutomaticShutdown, Cleanable
abstract class SmartSpeaker: Powerable, AutomaticShutdown, BatteryOperated, SoundEmitting, Programmable, Rechargeable

//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй
// соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
abstract class PowerableDevice: Powerable {
    var isPowered: Boolean = false

    override fun powerOn() {
        println("powering on...")
        isPowered = true
    }

    override fun powerOff() {
        println("powering off...")
        isPowered = false
    }
}
//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией
// соответствующего интерфейса и реализацией методов) и наследуй его от
// абстрактного класса включаемого оборудования.
abstract class  ProgrammableDevice: PowerableDevice(), Programmable {
    override fun programAction(action: String) {
        println("program action: $action")
    }
    override fun execute() {
        println("executing")
    }
}
//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру
// и открываться и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.
abstract class TemperatureRegulatableDevice: ProgrammableDevice(), TemperatureRegulatable {
    override fun setTemperature(temp: Int) {
        println("setTemperature: $temp")
    }
}
//Задача 5. Создай не абстрактные классы устройств с наследованием от абстрактного класса
// с возможностью устанавливать температуру и открываться. Пусть это будет холодильник,
// стиральная машина, чайник, духовка. Добавь недостающие интерфейсы и реализуй
// необходимые методы (достаточно вывод в консоль производимого действия).
// Обрати внимание на то, что установка температуры и программирование устройства
// (считай - задание режима работы) не имеет смысла при выключенном питании - добавь эту проверку.
// Создай объекты этих устройств и позапускай их с различными методами.
class Refrigerator(override val maxTemperature: Int): TemperatureRegulatableDevice(), Openable  {
    override fun open() {
        println("opening Refrigerator")
    }
    override fun close() {
        println("closing Refrigerator")
    }
    override fun setTemperature(temp: Int) {
        if (isPowered) {
            println("setTemperature: $temp")
        }
    }
    override fun programAction(action: String) {
        if (isPowered) {
            println("program action: $action")
        }
    }
}
class WashingMachine(override val maxTemperature: Int): TemperatureRegulatableDevice(), Openable {
    override fun open() {
        println("opening WashingMachine")
    }
    override fun close() {
        println("closing WashingMachine")
    }
    override fun setTemperature(temp: Int) {
        if (isPowered) {
            println("setTemperature: $temp")
        }
    }
    override fun programAction(action: String) {
        if (isPowered) {
            println("program action: $action")
        }
    }
}
class Kettle(override val maxTemperature: Int): TemperatureRegulatableDevice(), Openable {
    override fun open() {
        println("opening Kettle")
    }
    override fun close() {
        println("closing Kettle")
    }
    override fun setTemperature(temp: Int) {
        if (isPowered) {
            println("setTemperature: $temp")
        }
    }
    override fun programAction(action: String) {
        if (isPowered) {
            println("program action: $action")
        }
    }
}
class Oven(override val maxTemperature: Int): TemperatureRegulatableDevice(), Openable {
    override fun open() {
        println("opening Oven")
    }
    override fun close() {
        println("closing Oven")
    }
    override fun setTemperature(temp: Int) {
        if (isPowered) {
            println("setTemperature: $temp")
        }
    }
    override fun programAction(action: String) {
        if (isPowered) {
            println("program action: $action")
        }
    }
}

fun main() {
    val r = Refrigerator(maxTemperature = 6)
    r.setTemperature(4)
    r.powerOn()
    r.setTemperature(5)
    val w = WashingMachine(maxTemperature = 90)
    w.close()
    val k = Kettle(maxTemperature = 100)
    k.open()
    val o = Oven(maxTemperature = 270)
    o.powerOn()
    o.programAction("baking")
    o.powerOff()
}
