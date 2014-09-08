package game.owl.view.button

import game.owl.model._
import game.owl.view._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal


class ButtonView(callback:() => Unit = {() => }) extends View
{
	addEventListener("click", () => callback)
}

