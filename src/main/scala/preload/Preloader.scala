package preload

import org.scalajs.dom.extensions._
import org.scalajs.dom

import scala.scalajs.js
import js.Dynamic.global
import js.Dynamic.literal

import scala.language.postfixOps
import scala.scalajs.js.createjs._


class Preloader(items:Map[String, String], complete: () => Unit, basedir:String = "./target/scala-2.11/classes/")
{
	val queue = new LoadQueue(false, basedir)

	queue.installPlugin(Sound)

	queue.on("complete", () => complete() );
	queue.on("error", () => error() );

	queue.loadManifest(items map {
		case(k,v) => literal(id = k, src = v)
		} toArray : Array[js.Dynamic])

	def error(e:js.Dynamic = null):Unit =
	{
		throw new Error("Preloader: Error loading file " + e.item.src)
	}

	def get(id:String):Resource =
	{
		queue.getResult(id)
	}
}


