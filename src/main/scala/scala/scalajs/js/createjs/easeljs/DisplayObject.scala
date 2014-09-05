package scala.scalajs.js.createjs

import scala.scalajs.js
import js.annotation.JSName

class Bounds extends js.Object
{
	var x:js.Number = _
	var y:js.Number = _
	var width:js.Number = _
	var height:js.Number = _
}

@JSName("createjs.DisplayObject")
class DisplayObject extends EventDispatcher
{
	var alpha : js.Number = _

	var cacheCanvas : js.Object = _

	var id : js.Number = _

	var mouseEnabled : js.Boolean = _

	var tickEnabled : js.Boolean = _

	var name : js.Object = _

	var parent : js.Object = _

	var regX : js.Number = _

	var regY : js.Number = _

	var rotation : js.Number = _

	var scaleX : js.Number = _

	var scaleY : js.Number = _

	var skewX : js.Number = _

	var skewY : js.Number = _

	var shadow : js.Object = _

	var visible : js.Boolean = _

	var x : js.Number = _

	var y : js.Number = _

	var compositeOperation : js.Object = _

	var snapToPixel : js.Boolean = _

	var filters : js.Object = _

	var cacheID : js.Number = _

	var mask : js.Object = _

	var hitArea : js.Object = _

	var cursor : js.Object = _

	var _cacheOffsetX : js.Number = _

	var _cacheOffsetY : js.Number = _

	var _cacheScale : js.Number = _

	var _cacheDataURLID : js.Number = _

	var _cacheDataURL : js.Object = _

	var _matrix : js.Object = _

	var _rectangle : js.Object = _

	var _bounds : js.Object = _

	/* Function0 */

	def initialize() : Unit = ???

	def isVisible() : js.Boolean = ???

	def uncache() : Unit = ???

	def getCacheDataURL() : js.String = ???

	def getStage() : Stage = ???

	def getBounds() : Bounds = ???

	def getTransformedBounds() : js.Any = ???

	def hitTest (x:js.Number, y:js.Number) : js.Boolean = ???

	def set (props:js.Any) : Unit = ???

	def setBounds (x:js.Number, y:js.Number, width:js.Number, height:js.Number) : Unit = ???

/*

	/* Function1- */


	def draw (ctx:js.Any, ignoreCache:js.Any) : js.Any

	def updateContext (ctx:js.Any) : js.Any

	def cache (x:js.Any, y:js.Any, width:js.Any, height:js.Any, scale:js.Any) : js.Any

	def updateCache (compositeOperation:js.Any) : js.Any

	def localToGlobal (x:js.Any, y:js.Any) : js.Any

	def globalToLocal (x:js.Any, y:js.Any) : js.Any

	def localToLocal (x:js.Any, y:js.Any, target:js.Any) : js.Any

	def setTransform (x:js.Any, y:js.Any, scaleX:js.Any, scaleY:js.Any, rotation:js.Any, skewX:js.Any, skewY:js.Any, regX:js.Any, regY:js.Any) : js.Any

	def getMatrix (matrix:js.Any) : js.Any

	def getConcatenatedMatrix (matrix:js.Any) : js.Any

	def cloneProps (o:js.Any) : js.Any

	def _applyShadow (ctx:js.Any, shadow:js.Any) : js.Any

	def _tick (params:js.Any) : js.Any

	def _testHit (ctx:js.Any) : js.Any

	def _applyFilterBounds (x:js.Any, y:js.Any, width:js.Any, height:js.Any) : js.Any

	def _getBounds (matrix:js.Any, ignoreTransform:js.Any) : js.Any

	def _transformBounds (bounds:js.Any, matrix:js.Any, ignoreTransform:js.Any) : js.Any
*/

}

