import scala.scalajs.js

import js.annotation.JSName

import common._

package object createjs
{
	type EventHandler = js.Function

	trait EventListener extends js.Object

	@JSName("createjs.Ticker")
	object Ticker extends js.Object
	{
		def addEventListener(eventName:String, handler:EventHandler):Unit = ???
		def addEventListener(eventName:String, callback:Callback):Unit = ???
		def addEventListener(eventName:String, stage:Stage):Unit = ???
	}
}

