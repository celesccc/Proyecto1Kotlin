
//Punto de entrada a mi aplicación Kotlin
fun main(args: Array<String>){
    println("Hola mundo");

    //Creación de una variable
    var textVariable = "Soy una variable";

    //Creando una constante
    val textConstante = "Soy una constante";

    //Definición de una constante cargada por el usuario
    val name = readLine();
    println("Hola $name");

    funWithParams(2);
    funWithoutParams();
    val avg = calculoMedia(args);
    print("El resultado de la función es: $avg");

    bucleRepeat(10);
    bucleRepeatConVariableContadoraPersonalizada(5);

    //DEFINICIÓN DE TIPOS

    //Variable de tipo String
    val miCadena = "Esto es una constante"
    val miCadLarga = """Esto es un String
        |de más de una línea."""
    //Caracteres de escape: \t: tabulación
    // \b: retroceso, \n: salto de línea
    // \\: barra invertida
    println("Contenido de la variable miCadena es $miCadena")
    println("Contenido de miCadLarga es $miCadLarga")

    //Variable de tipo Arrays de enteros sin tipar
    val miArray = arrayOf(10, 20, 30)

    //Definición de array booleanos
    val miArrayBool = booleanArrayOf(true, true, false)

    println(miArray.get(1));
    println("Array de bool $miArrayBool[0]");
}

//Funciones que no retornan nada (Void en Java)

fun funWithoutParams(){
    println("Función sin parámetros");
}

fun funWithParams(number: Int){
    println("Función con parámetros: $number");
}

//Funciones que sí retornan

//Función que hace un cálculo
//Parámetros de entrada: Array de String llamado INPUT
//La función retorna un Double
fun calculoMedia(input: Array<String>): Double{
    var resultado = 0.0;

    //Por ejemplo: El array input = 1 2 3
    for (s in input){
        resultado += s.toDouble();
    }
    return resultado/input.size;
}

//Función para practicar el bucle repeat
fun bucleRepeat(repeat1: Int){

    //Equivale a un for (int i=0;i<repeat;i++)
    //$it equivale a la i de un bucle for.
    repeat(repeat1){
        println("Bucle repeat. Repitiendo esto por $it veces de un total de $repeat1");
    }
}

fun bucleRepeatConVariableContadoraPersonalizada(totalIteraciones: Int){

    repeat(totalIteraciones){ position ->
        println("Bucle repeat. Repitiendo esto por $position veces de un total de $totalIteraciones");
    }
}