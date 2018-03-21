import Scene from scene

class Game{
	val a : Int = 1
	val obj = Scene()

	fun printname(){
		print(a)
		obj.printname()
	}
}

fun main(args: Array<String>){
	val game = Game()
	game.printname()
}