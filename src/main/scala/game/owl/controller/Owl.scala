package game.owl.controller

import game.owl.view.World
import game.owl.model.Assets

import scala.scalajs.js.createjs._

import scala.scalajs.js

class Owl
{
 	Assets.preload(AssetsLoaded)

	def AssetsLoaded():Unit =
	{
		val world = new World("MainCanvas")
	}

	def fromModel():Owl =
	{
		new Owl()
	}

}