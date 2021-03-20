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

    when(dl0){
        Dlugosc.MILIMETRY->println("dl0 to dlugosc w milimetrach")
        Dlugosc.CENTYMETRY,Dlugosc.MILIMETRY->println("To jednostka mniejsza od metra")

        Dlugosc.METRY->println("dl0 to dlugosc w metrach")

        else->println("dl0 to inna jednostka dlugosci")
    }

    val i = 2

    when(i){
        1,2,3,4,5->println("[1,5]")
        6->println("6")
        else->println("inna liczba")
    }


}
