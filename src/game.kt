package src

fun main(args : Array<String>){

	val game = Game()
	val parser = Parser()

	var current_scene : Scene = game.scenes[0]
	current_scene.printDescription()

	do{
		var args = readLine()!!.split(' ')
		parser.executeCommand(args[0])

	} while(game.placement != null)

}

class Game(){
	var placement : Int = -1
	var scenes : Array<Scene>

	init{
		val scene0 = Scene(0, "Preparar", "Você se ingressou à corrida.")
		val scene1 = Scene(1, "Largada", "Você saiu")
		val scene2 = Scene(2, "aoba", "kkkkk")

	//	val scene3 = Scene(3, "eae", "man", {4})
		//val scene4 = Scene(4, "eae2", "voce morreu", {})

	//	scenes = arrayOf(scene1, scene2, scene3, scene4)


		scenes = arrayOf(scene0, scene1, scene2)
	}
}

class Scene(val id : Int,
			val title : String,
			val description : String){
	
	fun printDescription(){
		println("$description")
	}

}

class Parser(){
	var commands : Array<Command>

	init{
		val use = Command("use", "use <objeto>\nuse <objeto> with <objeto>")
		val help = Command("help", "help")
		
		commands = arrayOf(help, use)
	}

	fun executeCommand(command : String){
		if(checkCommand(command)){
			if(command.equals("help")){
				printCommands()
			}	
		}
	}

	fun checkCommand(token : String) : Boolean{
		for(command in commands){
			if(command.syntax.equals(token)){
				return true
			}
		}
		println("Comando \"$token\" desconhecido. Digite help para ver a lista de comandos.")
		return false
	}

	fun printCommands(){
		for(command in commands){
			println(command.printSyntax())
		}
	}
}

class Command(val id : String,
			  val syntax : String){
	
	fun printSyntax(){
		println("$syntax")
	}
}