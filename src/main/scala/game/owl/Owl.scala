package game.owl

import assets.Assets
import createjs._

import scala.scalajs.js

import common._

class Owl
{
 	val stage = new Stage("MainCanvas")
// 	val stage = new CreateJS.Stage("MainCanvas")

 	val assets = new Assets(Map(
 			"pop" -> "sound/pop.mp3",
 			"world" -> "img/world.png"
 		), AssetsLoaded
 	)

	def AssetsLoaded():Unit =
	{
		Ticker.addEventListener("tick", stage)

		val world = new World(this)

		stage.addChild(world.container)
	}

}