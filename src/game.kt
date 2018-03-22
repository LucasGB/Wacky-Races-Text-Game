package src

fun main(args : Array<String>){
	

	val game = Game(1)

	println(game.scenes[0])

}

class Game(var currentScene : Int){
	init{
		val scene1 = Scene(1, "title1", "cogeti")
		val scene2 = Scene(2, "title2", "cogeti2")
		scene1.getInfo()

		val scenes = arrayOf(scene1, scene2)
	}
}

class Scene(val id : Int,
			val title : String,
			val description : String){
	
	fun getInfo() : Unit{
		println("a $description b")
	}

}