package game.owl.view

import game.owl.model._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal


class LocationView(val location:LocationData) extends View
{
	val shape = new Shape(
		     new Graphics().beginFill("#ffffff").drawCircle(0,0,18)
		     .beginFill("#777777").drawCircle(0,0,16)
		     .beginFill("#ffffff").drawCircle(0,0,14)
	);
	shape.x = location.pos.x
	shape.y = location.pos.y
	addChild(shape)

	val text = new Text(location.name, "18px Arial", "white")
	text.x = location.pos.x - text.getBounds().width/2
	text.y = location.pos.y + 25
	addChild(text)


	addEventListener("click", () =>
	{
		Player.travelTo(location)
	})
}

