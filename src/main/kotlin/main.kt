enum class Dlugosc {
    MILIMETRY, CENTYMETRY, METRY, KILOMETRY
}

fun main() {
    var dl0: Dlugosc = Dlugosc.MILIMETRY
    var dl1: Dlugosc = Dlugosc.MILIMETRY

    if(dl0==Dlugosc.METRY)
        println("dl0 to dlugosc w metrach")

    if(dl0==Dlugosc.MILIMETRY)
        println("dl0 to dlugosc w milimetrach")



}
