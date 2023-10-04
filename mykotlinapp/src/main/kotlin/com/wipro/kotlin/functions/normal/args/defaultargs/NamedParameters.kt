package com.wipro.kotlin.functions.normal.args.defaultargs

fun format(str: String = "str", normalizeCast: Boolean = false, upperCaseFirstLetter: Char = 'A') {
    println("Str $str noralizeCase ${normalizeCast} UpperCaseFirstLetter ${upperCaseFirstLetter}")
}

fun main() {
    format();
    //named parameters
    format(str = "Hello", upperCaseFirstLetter = 'B', normalizeCast = true)
    format(normalizeCast = false);
}