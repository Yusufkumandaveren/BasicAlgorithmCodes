package com.yusufkumandaveren.basickodlar

fun main() {

    print("İsminizi Soy isminizi giriniz: ")

    val adSoyad = readLine()

    print("Tekrar sayisini giriniz:")
    val sayac = readLine()?.toIntOrNull()

    if (adSoyad==null){
        println("Hatalı girdi !!")
    }else if (sayac == null){
        println("Hatalı girdi !!")
    }else if (adSoyad!=null && sayac!= null){
        for (i in 1..sayac){
            println("isim soyisim : ${adSoyad}")
        }
    }else{
        println("Hatalı girdi !!")
    }




}