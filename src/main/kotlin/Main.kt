fun main(args: Array<String>) {
    var name1 = greet("cynthia")
    var Rem1 = Remainder(120,60)
    println(Rem1)
    var total = sum(12,145,167,150)
    println(total)
    FACT("you are strong")

}
fun greet (name:String) {
    println("hello,"+name)
}

 fun Remainder (numb1:Int,numb2:Int):Int{
    var rem = numb1 % numb2
    return rem

 }
fun sum(number1:Int,number2:Int,number3:Int,number4:Int):Int{
    var sum = number1+number2+number3+number4
    return sum
}
fun FACT(sentence:String){
    println("Cynthia,"+sentence)
}