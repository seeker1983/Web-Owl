package game.owl.view

import game.owl.controller.Owl
import game.owl.model.Assets

import geometry.Point

import scala.scalajs.js
import scala.scalajs.js.createjs._
import org.scalajs.dom.extensions._
import org.scalajs.dom

import js.Dynamic.global

class World(canvasId:js.String)
{
    val canvas = dom.document.getElementById(canvasId).cast[dom.HTMLCanvasElement]


 	val stage = new Stage(canvasId)
	Ticker.addEventListener("tick", stage)


	val container = new Container()
	stage.addChild(container) /* Can we get rid of all whose containers */
	val mapContainer = new Container()
	val bmp = new Bitmap(Assets.img.worldMap)

	val bmpSize = Point(bmp.getBounds().width, bmp.getBounds().height)
	val canvasSize = Point(canvas.width, canvas.height) /* TODO: get canvas size */
	val mapBounds = canvasSize - bmpSize

	mapContainer.addChild(bmp)
	container.addChild(mapContainer)

	val routeMap = new RouteMap(this)
	mapContainer.addChild(routeMap.container)

	/* List of creajs mouse events. Just a comment right now. */
	List("click","dblclick","mousedown","mouseout","mouseover","pressmove","pressup","rollout","rollover");


	var dragStart:Point = Point(0,0) /* TODO: how to throw access exception here? */

	/* All of this are actually controllers. How to move them to more adequate place? */
	container.addEventListener("click", () =>
	{
	})
	container.addEventListener("mousedown",  (e:MouseEvent) =>
	{
		dragStart = Point(e.stageX, e.stageY)
	})
	container.addEventListener("pressmove", (e:MouseEvent) =>
	{
		val delta = Point(e.stageX, e.stageY) - dragStart
		mapContainer.x += delta.x
		mapContainer.y += delta.y

		/* Can be written more nice way? */
		if(mapContainer.x>0)
			mapContainer.x=0
		if(mapContainer.y>0)
			mapContainer.y=0

		if(mapContainer.x<mapBounds.x)
			mapContainer.x=mapBounds.x
		if(mapContainer.y<mapBounds.y)
			mapContainer.y=mapBounds.y

		dragStart = Point(e.stageX, e.stageY)
	})
}

