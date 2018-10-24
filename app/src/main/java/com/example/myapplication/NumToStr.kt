package com.example.myapplication

object NumToStr {
    private val thousand = "тысяча"
    private  val hundreds = arrayOf("",
            "сто",
            "двести",
            "триста",
            "четыреста",
            "пятьсот",
            "шестьсот",
            "семьсот",
            "восемьсот",
            "девятьсот")
    private val tens = arrayOf("",
            "десять",
            "двадцать",
            "тридцать",
            "сорок",
            "пятьдесят",
            "шестьдесят",
            "семьдесят",
            "восемьдесят",
            "девяносто")
    private val ones = arrayOf("",
            "один",
            "два",
            "три",
            "четыре",
            "пять",
            "шесть",
            "семь",
            "восемь",
            "девять",
            "десять",
            "одиннадцать",
            "двенадцать",
            "тринадцать",
            "четырнадцать",
            "пятнадцать",
            "шестнадцать",
            "семнадцать",
            "восемнадцать",
            "девятьнадцать")

    fun convert(number: Int):String {
        var res= ""
        if ((number>1000)||(number<1)){
            res = "ошибка"
            return res
        }
        if (number==1000) {
            res = thousand
            return res
        } else {
            val a = number/100
            val b = (number/10)%10
            val c = number%10
            if (a!=0) {
                res += hundreds[a] + ' '
            }
            if (b>1) {
                res += tens[b] + ' '
                if (c>0)
                {
                    res += ones[c]
                }
            } else
            {
                res += ones[10*b+c]
            }
            return res
        }
    }

}