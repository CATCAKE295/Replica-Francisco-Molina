import java.util.*


fun main()
{
    alimentarPez()
}

fun alimentarPez()
{

    val dia = azarDia()
    val comida = comidaDia(dia)
    println("Hoy es ${dia} y los peces comen ${comida}")
    println("Cambiar agua:  ${cambiarAgua(dia)}")

}

fun azarDia() : String
{

   val semana = arrayOf ("Lunes","Martes","Miercoles","Jueves",
                         "Viernes","Sabado","Domingo")


  return semana[Random().nextInt(semana.size)]
}

fun comidaDia(dia : String): String
{
    
    return when(dia)
    {
        "Lunes" -> "hojuelas"
        "Miercoles" ->  "gusanos"
        "Jueves" ->  "granos"
        "Viernes" ->  "mosquitos"
        "Domingo" ->  "plankton"
        else ->  "nada"
    }  
     
}

fun cambiarAgua(day : String, temperature : Int = 22, dirty: Int  = 20) : Boolean
{
  return when
  {

    isMuyCaliente(temperature) -> true
    isSucio(dirty) -> true
    isDomingo(day) -> true
     else -> false


  }

}


fun isMuyCaliente(temperature: Int) = temperature > 30

fun isSucio(dirty: Int) = dirty > 30

fun isDomingo(day: String) = day == "Domingo"

