package game.owl.view.button

import game.owl.model._
import game.owl.view._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal


case class ConcedeButtonView(callback:() => Unit) extends View
{
	val text = new Text("Concede", "48px Arial", "#88а")

	val border = new Shape(
		     new Graphics()
		     .beginFill("#ccddff")
			 .setStrokeStyle(3)
			 .beginStroke("#555")
		     .rect(-20,-10,text.getBounds().width+40, text.getBounds().height+30)
//		     .beginFill("#000000")
//		     .rect(-20,-10,text.getBounds().width+20, text.getBounds().height+10)
	);

	addChild(border)
	addChild(text)

	addEventListener("click", () => callback())
}

