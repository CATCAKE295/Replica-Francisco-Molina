fun main()
{

    val decoraciones = listOf ("roca", "pagoda", "planta artificial", "lagarto", "maceta")

     println(decoraciones.filter {it [0] == 'p'})


     val eager = decoraciones.filter { it [0] == 'p' }
     println("ansioso: $eager")

     val filtrado = decoraciones.asSequence().filter { it[0] == 'p' }
     println("filtrado: $filtrado")

     val nuevaLista = filtrado.toList()
    println("nueva lista: $nuevaLista")

    val MapaPerezoso = decoraciones.asSequence().map{

        println("Acseso: ${it}")
        it

    }

    println("Con Pereza: ${MapaPerezoso}")
    println("---------------------------")
    println("Primero: ${MapaPerezoso.first()}")
    println("--------------------------------")
    println("Todo: ${MapaPerezoso.toList()}")

    val MapaPerezoso2 = decoraciones.asSequence().filter { it[0] == 'p' }.map { 

        println("Acceso: ${it}")
        it
     }
     println("-----------------------------------")
     println("Filtrado: ${MapaPerezoso2.toList()}")

     
val misdeportes = listOf("basketball", "Pesca", "running")
val misJugadores = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
val misCiudades = listOf("Los Angeles", "Chicago", "Jamaica")
val miLista = listOf(misdeportes, misJugadores, misCiudades)     
println("-----")
println("Flat: ${miLista.flatten()}")



}



