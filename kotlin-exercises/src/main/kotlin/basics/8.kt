package basics

import java.util.Scanner

/**
 * Desenvolva um programa que leia uma distância em metros e mostre os valores
 * relativos em outras medidas.
 * Ex:
 * Digite uma distância em metros: 185.72
 * A distância de 85.7m corresponde a:
 * 0.18572Km
 * 1.8572Hm
 * 18.572Dam
 * 1857.2dm
 * 18572.0cm
 * 185720.0mm
 * */

internal class Ruler(
    val metters: Double
){
    var kilometers: Double =  metters / 1000
    var hectometers: Double = metters / 100
    var decameters: Double =  metters / 10
    var decimeters: Double =  metters * 10
    var centimeters: Double = metters * 100
    var milimeters: Double =  metters * 1000

    fun toKilometers(): String {
        return "${kilometers}Km"
    }

    fun toHectometers(): String {
        return "${hectometers}Hm"
    }

    fun toDecameters(): String {
        return "${decameters}Dam"
    }

    fun toDecimeters(): String {
        return "${decimeters}dm"
    }

    fun toCentimeters(): String {
        return "${centimeters}cm"
    }

    fun toMilimeters(): String {
        return "${milimeters}mm"
    }
}

internal fun exercise8(){
    val scanner = Scanner(System.`in`)
    print("Write the distance in meters: ")
    val distance = scanner.nextDouble()
    val ruler = Ruler(distance)
    print("""
    A distância de ${ruler.metters}m corresponde a:
    ${ruler.toKilometers()}   ${ruler.toHectometers()}     ${ruler.toDecameters()}
    ${ruler.toDecimeters()}   ${ruler.toCentimeters()}   ${ruler.toMilimeters()}
    """.trimIndent())
}

internal fun main(){
    exercise8()
}
