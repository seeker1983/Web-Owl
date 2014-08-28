package main

import scala.scalajs.js
import scala.scalajs.js.JSApp

import org.scalajs.dom.extensions._
import org.scalajs.dom
import js.Dynamic.global
import js.Dynamic.literal


import createjs.CreateJS

object Main extends JSApp
{
 	var stage = new CreateJS.Stage("TestCanvas")

	def main ():Unit  =
	{
		CreateJS.Ticker.addEventListener("tick", stage);
		CreateJS.Ticker.addEventListener("click", () => onClick());

		val queue = new CreateJS.LoadQueue();
		var plugin = CreateJS.Sound
		println(plugin)
		global.console.log(plugin)
		queue.installPlugin(plugin);

/*		queue.on("complete", () => onLoadComplete);

		queue.loadFile(literal(id = "pop", src = "target/scala-2.11/classes/sound/pop.mp3"));
/*		queue.loadManifest([
		    {id:"world", src:"./target/scala-2.11/classes/img/world.png"}
		]);*/*/
	}

	def onClick():Unit =
	{
		println("Clicked!")
	}

	def onLoadComplete():Unit =
	{
		println("Complete!")
	}

}