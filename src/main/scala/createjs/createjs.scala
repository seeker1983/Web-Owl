package createjs

import scala.scalajs.js
import js.annotation.JSName

object CreateJS
{
	sealed trait EventListener extends js.Object

	type EventHandler = () => Unit

	class DisplayObject extends js.Object
	{
	}

	class Container extends DisplayObject
	{
		def addChild(item:DisplayObject):Unit = ???
		def update():Unit = ???
	}

	@JSName("createjs.Stage")
	class Stage(canvasId:String) extends Container with EventListener

	// TODO: Is enum done this way ???
	object MovieClip
	{
		@JSName("createjs.MovieClip")
		var INDEPENDENT:String = _
		@JSName("createjs.SINGLE_FRAME")
		var SINGLE_FRAME:String = _
		@JSName("createjs.SYNCHED")
		var SYNCHED:String = _
	}

	@JSName("createjs.MovieClip")
	class MovieClip(mode:js.String=MovieClip.INDEPENDENT,startPosition:js.Number=0, loop:js.Boolean=true, labels:js.Object = null) extends DisplayObject
	{

		def addEventListener(eventName:String, target:EventHandler):Unit = ???
		var timeline:TimeLine = _
		def gotoAndPlay(where:String):Unit = ???
	}

	class TimeLine extends js.Object
	{
		def addTween(tween:Tween):Unit = ???
	}

	@JSName("createjs.Shape")
	class Shape(graphics:Graphics = null) extends DisplayObject

	@JSName("createjs.Graphics")
	class Graphics extends js.Object
	{
		def beginFill(color:String):Graphics = ???
		def drawCircle(x:js.Number, y:js.Number, r:js.Number):Graphics = ???
	}

	@JSName("createjs.Ticker")
	object Ticker extends js.Object
	{
		def addEventListener(eventName:String, handler:EventHandler):Unit = ???
		def addEventListener(eventName:String, target:EventListener):Unit = ???
	}

	class Tween extends js.Object
	{
		def get(item:DisplayObject):Tween = ???
		def to(state:js.Dynamic, time:js.Number = 0):Tween = ???
	}

	@JSName("createjs.Tween")
	object Tween extends Tween


/*   Load queue */
	class Plugin extends js.Object

	@JSName("createjs.Sound")
	var Sound:Plugin = _

	@JSName("createjs.LoadQueue")
	class LoadQueue(useXHR:Boolean = true, basePath:String="", crossOrigin:String="")
	{
		def installPlugin(plugin:Plugin):Unit = ???

		def on(event:String, handler:EventHandler):Unit = ???

		def addEventListener(event:String, handler:EventHandler):Unit = ???

		def loadFile(params:js.Dynamic):Unit = ???

		def loadManifest(params:js.Dynamic):Unit = ???
	}


}

