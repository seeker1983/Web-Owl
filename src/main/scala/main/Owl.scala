package main

import assets.Assets
import createjs._

import org.scalajs.dom.extensions._
import org.scalajs.dom

import scala.scalajs.js
import js.Dynamic.global
import js.Dynamic.literal

import common._

class Owl
{
 	val stage = new Stage("TestCanvas")

 	val assets = new Assets(Map(
 			"pop" -> "sound/pop.mp3",
 			"world" -> "img/world.png"
 		), onLoadComplete
 	)

	init()

	def init ():Unit  =
	{
		Ticker.addEventListener("tick", stage)
		Ticker.addEventListener("click", () => onClick() )
	}

	def onClick():Unit =
	{
		println("Clicked!")
	}

	def onLoadComplete():Unit =
	{
//		stage.addChild(new Bitmap(assets.get("world")))
		println("Complete!")
		Sound.play("pop")
	}

}