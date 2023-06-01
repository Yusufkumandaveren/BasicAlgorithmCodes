package com.yusufkumandaveren.basickodlar
import java.util.Scanner



fun main() {

    val girdi = Scanner(System.`in`)

    println("Kucuk sayi:")
    var sayac1 = girdi.nextInt()
    println("Buyuk sayi: ")
    var sayac2 = girdi.nextInt()
    var toplam = 0
    if (sayac2 <= sayac1){
        println("Sayi degerlerini yanlis girdiniz.")
    }else if (sayac2== null && sayac1==null){
        println("Hatalı girdi")
    }else{
        for (i in sayac1..sayac2) {
            toplam += i
        }
        println("Toplam: ${toplam}")
    }

}


/*fun main() {
    val scanner = Scanner(System.`in`)

    println("İki sayı girin:")
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    var total = 0
    for (i in num1..num2) {
        total += i
    }
    println("Toplam: $total")
}*/
