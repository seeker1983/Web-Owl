package game.owl.view

import game.owl.model.location._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal


class LocationPicture(val data:Location)
{
	val container = new Container()
	val shape = new Shape(
		     new Graphics().beginFill("#ffffff").drawCircle(0,0,18)
		     .beginFill("#777777").drawCircle(0,0,16)
		     .beginFill("#ffffff").drawCircle(0,0,14)
	);
	shape.x = data.pos.x
	shape.y = data.pos.y
	container.addChild(shape)

}

