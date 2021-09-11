
fun main(){

   val filtroAgua: (Int) -> Int = {suciedad -> suciedad / 2}

   println(sobreSuciedad(30,filtroAgua))
   println(sobreSuciedad(15, ::incrementaSuciedad))

  var nivelSuciedad = 19
  nivelSuciedad = sobreSuciedad(nivelSuciedad) { nivelSuciedad -> nivelSuciedad + 23}
  println(nivelSuciedad)

}

fun sobreSuciedad(suciedad: Int, operacion: (Int) -> Int) : Int
{
    return operacion(suciedad)
}

fun incrementaSuciedad(start: Int) = start + 1



