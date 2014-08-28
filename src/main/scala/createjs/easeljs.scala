package createjs

import scala.scalajs.js
import js.annotation.JSName

class DisplayObject extends js.Object

class Container extends DisplayObject
{
	def addChild(item:DisplayObject):Unit = ???
	def update():Unit = ???
}

@JSName("createjs.Stage")
class Stage(canvasId:String) extends Container with EventListener

@JSName("createjs.Shape")
class Shape(graphics:Graphics = null) extends DisplayObject

@JSName("createjs.Graphics")
class Graphics extends js.Object
{
	def beginFill(color:String):Graphics = ???
	def drawCircle(x:js.Number, y:js.Number, r:js.Number):Graphics = ???
}




