package game.owl.view

import game.owl.controller.Owl
import game.owl.model.Assets

import geometry.Point

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global

class MapView() extends View
{
	val bmp = new Bitmap(Assets.img.worldMap)
	addChild(bmp)

	val size = Point(bmp.getBounds().width, bmp.getBounds().height)
}

