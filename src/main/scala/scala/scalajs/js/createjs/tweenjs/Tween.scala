package scala.scalajs.js.createjs

import scala.scalajs.js
import js.annotation.JSName

class Tween extends js.Object
{
	def get(target:js.Object, props:js.Object, pluginData:js.Object = null, _override:js.Boolean = false):Tween = ???
	def get(target:js.Object):Tween = ???

	def tick(delta:js.Number, paused:js.Boolean):Tween = ???

	def handleEvent(event:EventHandler):Tween = ???

	def removeTweens(target:js.Object):Tween = ???

	def removeAllTweens():Tween = ???

	def hasActiveTweens(target:js.Object):Tween = ???

	def installPlugin(plugin:js.Object, properties:js.Array[js.Any]):Tween = ???

	def wait(duration:js.Number, passive:js.Boolean):Tween = ???

	def to(props:js.Object, duration:js.Number = 0, ease:js.Function = null):Tween = ???

	def call(callback:js.Function, params:js.Object = null, scope:js.Object = null):Tween = ???

	def set(props:js.Object, target:js.Object = null):Tween = ???

	def play(tween:Tween):Tween = ???

	def pause(tween:Tween):Tween = ???

	def setPosition(value:js.Number, actionsMode:js.Number):Tween = ???

	def tick(delta:js.Number):Tween = ???

	def setPaused(value:js.Boolean):Tween = ???
}

@JSName("createjs.Tween")
object Tween extends Tween
