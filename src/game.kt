package src

fun main(args : Array<String>){

	val game = Game()

	var current_scene : Scene = game.scenes[0]

//	do{
//
	//} while(game.placement != null)

	option = current_scene.printOptions()

}

class Game(){
	var placement : Int = -1
	var scenes : Array<Scene>

	init{
		val scene0 = Scene(0, "Preparar", "a", arrayOf(1
		))
		val scene1 = Scene(1, "Largada", "Você saiu", arrayOf(2, 3))
		val scene2 = Scene(2, "aoba", "kkkkk", arrayOf(3))

	//	val scene3 = Scene(3, "eae", "man", {4})
		//val scene4 = Scene(4, "eae2", "voce morreu", {})

	//	scenes = arrayOf(scene1, scene2, scene3, scene4)


		scenes = arrayOf(scene0, scene1, scene2)
	}
}

class Scene(val id : Int,
			val title : String,
			val description : String,
			val options : Array<Int>){
	
	fun getInfo(){
		println("a $description b")
	}

	fun printOptions(){
		print("Lista de opções: ")
		for (option in options){
			println(option)
		}
	}

}