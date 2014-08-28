package assets

import org.scalajs.dom.extensions._
import org.scalajs.dom

import scala.scalajs.js
import js.Dynamic.global
import js.Dynamic.literal

import scala.language.postfixOps
import createjs._
import common._

class Resource extends js.Object

case class Assets(items:Map[String, String], complete: Callback)
{
	val queue = new LoadQueue(false, "./target/scala-2.11/classes/")
	queue.installPlugin(Sound)
	queue.on("complete", complete );
	queue.on("error", (e:js.Dynamic) => error(e) );

	queue.loadManifest(items map {
		case(k,v) => literal(id = k, src = v)
		} toArray : Array[js.Dynamic])

	def error(e:js.Dynamic = null):Unit =
	{
		throw new BasicException("Assets: Error loading file " + e.item.src)
	}
	def get(id:String):Resource =
	{
		null
	}
}


