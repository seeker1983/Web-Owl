import scala.scalajs.js

import js.annotation.JSName

import common._

package object createjs
{
	type EventHandler = js.Function

	@JSName("createjs")
	object CreateJS

	class EventDispatcher extends js.Object
	{
		def addEventListener(eventName:String, handler:EventHandler):Unit = ???
		def addEventListener(eventName:String, stage:Container):Unit = ???
		def on(event:js.String, handler:EventHandler):Unit = ???
	}


	@JSName("createjs.Ticker")
	object Ticker extends EventDispatcher
}

