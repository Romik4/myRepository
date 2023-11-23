
val name = "Roma" // name can't be changed
var age = 24 // age can be changed
var isManualTester = true
var surnameFirstLetter = "P"
var textA = "Hello, my name is $name $surnameFirstLetter, I'm $age years old, I'm Manual QA at SurfStudio"
var textB = "Hello, World!"

/* Переменные для
практики
арифметических
выражений: */

var a = 30
var b = 10
var c = 50
var d = 2
var e = 100

fun math() {
    var f = a - b // вычитание
    var g = c / d // деление
    var h = d % a // деление с остатком
    var i = b * d // умножение
    // один println вместо четырех
    println("$f, $g, $h, $i")
}
var counter = 1
var num = counter++

val scan = java.util.Scanner(System.`in`)
var newText = scan.nextLine()
fun main() {
    if (a < b || e == d) {
        println(textA)
    } else if (c == e){
        println(textB)
    } else {
        println("Hello, $newText!")
    }

    println(math())


}