package scala.scalajs.js.createjs

import scala.scalajs.js
import js.annotation.JSName

class Plugin extends js.Object

class Resource extends js.Object

@JSName("createjs.LoadQueue")
class LoadQueue(useXHR:Boolean = true, basePath:js.String="", crossOrigin:js.String="") extends EventDispatcher
{
	def installPlugin(plugin:Plugin):Unit = ???

	def loadFile(params:js.Dynamic):Unit = ???

	def loadManifest(paramList:js.Array[js.Dynamic]):Unit = ???

	def getItem(id:js.String):Resource = ???

	def getResult(id:js.String, raw:js.Boolean = false):Resource = ???
}

