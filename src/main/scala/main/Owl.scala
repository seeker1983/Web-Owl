package main

import assets.Assets
import createjs.CreateJS

import org.scalajs.dom.extensions._
import org.scalajs.dom

import scala.scalajs.js
import js.Dynamic.global
import js.Dynamic.literal

class Owl
{
 	val stage = new CreateJS.Stage("TestCanvas")

// 	val assets = new assets.

	init()

	def init ():Unit  =
	{
		CreateJS.Ticker.addEventListener("tick", stage)
		CreateJS.Ticker.addEventListener("click", () => onClick())

		val queue = new CreateJS.LoadQueue(false, "./target/scala-2.11/classes/")
		queue.installPlugin(CreateJS.Sound)

		queue.on("complete", () => onLoadComplete() );

		queue.loadManifest(List(
			literal(id = "pop", src = "sound/pop.mp3"),
			literal(id = "world", src = "img/world.png")
			).toArray[js.Dynamic]);

	}

	def onClick():Unit =
	{
		println("Clicked!")
	}

	def onLoadComplete():Unit =
	{
		println("Complete!")
		CreateJS.Sound.play("pop")
	}

}