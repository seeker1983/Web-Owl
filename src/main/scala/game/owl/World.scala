package game.owl

import scala.scalajs.js
import common._
import assets.Assets
import createjs._

import js.Dynamic.global

case class Point(x:Double, y:Double) {
  override def toString():String = "(" + x + ", " + y + ")"

  def -(p: Point): Point = {
    Point(x - p.x, y - p.y)
  }

  def +(p: Point): Point = {
    Point(x + p.x, y + p.y)
  }
}


class World(parent:Owl)
{
	var dragStart:Point = Point(0,0)
	val assets = parent.assets

	val container = new Container()
	val mapContainer = new Container()
	val bmp = new Bitmap(assets.get("world"))
	val bmpSize = bmp.getBounds()
	val canvasSize = Point(1200, 700)

	mapContainer.addChild(bmp)
	container.addChild(mapContainer)

	val routeMap = new RouteMap(this)
	mapContainer.addChild(routeMap.container)

	List("click","dblclick","mousedown","mouseout","mouseover","pressmove","pressup","rollout","rollover");

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
		if(mapContainer.x>0)
			mapContainer.x=0
		if(mapContainer.y>0)
			mapContainer.y=0

		if(mapContainer.x<canvasSize.x-bmpSize.width)
			mapContainer.x=canvasSize.x-bmpSize.width
		if(mapContainer.y<canvasSize.y-bmpSize.height)
			mapContainer.y=canvasSize.y-bmpSize.height
		dragStart = Point(e.stageX, e.stageY)
	})
}

