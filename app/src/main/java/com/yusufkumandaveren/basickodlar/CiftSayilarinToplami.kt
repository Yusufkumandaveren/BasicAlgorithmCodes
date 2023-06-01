package com.yusufkumandaveren.basickodlar

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)
    print("Kucuk deger: ")
    val kucuk = girdi.nextInt()
    print("Buyuk deger: ")
    val buyuk = girdi.nextInt()

    var total = 0
    if (kucuk%2 == 0){
        for (i in kucuk..buyuk){
            if (i%2==0){
                total += i
            }
        }
    }else if (kucuk%2 != 0){
        for (i in kucuk..buyuk){
            if (i%2==0){
                total += i
            }
        }
    }
    println("Toplam deger:$total")
}