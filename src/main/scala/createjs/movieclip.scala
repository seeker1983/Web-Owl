package createjs

import scala.scalajs.js
import js.annotation.JSName

@JSName("createjs.MovieClip")
class MovieClip(mode:js.String=MovieClip.INDEPENDENT,startPosition:js.Number=0, loop:js.Boolean=true, labels:js.Object = null) extends DisplayObject
{

	def addEventListener(eventName:String, target:EventHandler):Unit = ???
	var timeline:TimeLine = _
	def gotoAndPlay(where:String):Unit = ???
}

// TODO: Is enum done this way ???
object MovieClip
{
	@JSName("createjs.MovieClip")
	var INDEPENDENT:js.String = _
	@JSName("createjs.SINGLE_FRAME")
	var SINGLE_FRAME:js.String = _
	@JSName("createjs.SYNCHED")
	var SYNCHED:js.String = _
}

