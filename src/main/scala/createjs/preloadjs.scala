package createjs

import scala.scalajs.js
import js.annotation.JSName

class Plugin extends js.Object

@JSName("createjs.LoadQueue")
class LoadQueue(useXHR:Boolean = true, basePath:String="", crossOrigin:String="") extends js.Object
{
	def installPlugin(plugin:Plugin):Unit = ???

	def on(event:String, handler:EventHandler):Unit = ???

	def addEventListener(event:String, handler:EventHandler):Unit = ???

	def loadFile(params:js.Dynamic):Unit = ???

	def loadManifest(paramList:js.Array[js.Dynamic]):Unit = ???
}

