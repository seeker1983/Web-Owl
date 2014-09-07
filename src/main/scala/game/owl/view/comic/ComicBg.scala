package game.owl.view.comic

import game.owl.view._
import game.owl.model.comic.ComicData

import scala.scalajs.js
import scala.scalajs.js.createjs._


class ComicBg() extends View
{
	val bg = new Graphics().beginFill("#dddddd").rect(0, 0, stage.canvas.width, stage.canvas.height)

	addChild(new Shape(bg))
}

