package game.owl.view

import scala.scalajs.js
import scala.scalajs.js.createjs._

import org.scalajs.dom.extensions._
import org.scalajs.dom

import geometry.Point

package object stage extends View
{
	val canvasId = "MainCanvas"

	val stage = new Stage(canvasId)
	stage.addChild(container)
	Ticker.addEventListener("tick", stage)

    val canvas = dom.document.getElementById(canvasId).cast[dom.HTMLCanvasElement]
	val canvasSize = Point(canvas.width, canvas.height)

}