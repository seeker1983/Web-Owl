package game.owl.view.battle

import game.owl.view._
import game.owl.model.comic.ComicData

import scala.scalajs.js
import scala.scalajs.js.createjs._


class BattleBg extends View
{
	val bg = new Graphics().beginFill("#ccccdd").rect(0, 0, stage.canvas.width, stage.canvas.height)

	addChild(new Shape(bg))
}

