//Programa que pinte una piramide por pantalla
//Las pirámides son simétricas respecto a su vertical


fun main(args: Array<String>){
    //var tam = readLine()

    repeat (10){ i->
        repeat (10-i){
            print(" ")
        }
        print("/")
        repeat((i*2)-1){
            print("-")
        }
        print("\\")
        println()
    }
}