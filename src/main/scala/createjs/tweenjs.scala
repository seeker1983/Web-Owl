package createjs

import scala.scalajs.js
import js.annotation.JSName

class Tween extends js.Object
{
	def get(item:DisplayObject):Tween = ???
	def to(state:js.Dynamic, time:js.Number = 0):Tween = ???
}

@JSName("createjs.Tween")
object Tween extends Tween

class TimeLine extends js.Object
{
	def addTween(tween:Tween):Unit = ???
}

