package game.owl.view

import game.owl.model._
import game.owl.model.state._
import game.owl.controller._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal



object Player extends View
{
  val MOVEANIMATIONSPEED = 5

  var state:PlayerState = DefaultPlayerState

	val shape = new Shape(
		     new Graphics().beginFill("blue").drawCircle(0,0,10)
	)

  addChild(shape)

  def setState(state:PlayerState): Unit =
  {
    shape.x=state.location.pos.x
    shape.y=state.location.pos.y
  }

	def travelTo(location:LocationData) =
	{
    val animationTime = location.pos.distanceTo(state.location.pos)

    Tween.get(shape).to(literal(x = location.pos.x, y = location.pos.y), animationTime * MOVEANIMATIONSPEED)
    .call(() => {
        state.setLocation(location)
        LocationController.arrive(location)
    })
	}
}

