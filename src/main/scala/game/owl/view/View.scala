package game.owl.view

import geometry.Point

import scala.scalajs.js
import scala.scalajs.js.createjs._

class View(x:Double = 0, y:Double = 0)
{
  val container = new Container()
  container.x = x
  container.y = y

  def addChild(child:DisplayObject) = container.addChild(child)
  def addChild(child:View) = container.addChild(child.container)

  def removeChild(child:View):Unit = container.removeChild(child.container)
  def removeChild(child:DisplayObject) = container.removeChild(child)

  def removeChildren() = container.removeAllChildren()

  def addEventListener(eventName:String, handler:EventHandler):Unit =
  	container.addEventListener(eventName, handler)


  def on(eventName:String, handler:EventHandler) = addEventListener(eventName, handler)

  def click(handler:EventHandler) = addEventListener("click", handler)
}