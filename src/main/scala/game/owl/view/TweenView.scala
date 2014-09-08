package game.owl.view

import geometry.Point

import scala.scalajs.js
import scala.scalajs.js.createjs._
import scala.scalajs.js.Dynamic.literal

class TweenView(x:Double = 0, y:Double = 0) extends View(x, y)
{
  def tweenTo(pos:Point, delay:Int) {
    Tween.get(container).to(literal(x = pos.x, y = pos.y), delay)
  }
}