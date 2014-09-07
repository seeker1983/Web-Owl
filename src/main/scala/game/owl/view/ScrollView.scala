package game.owl.view

import game.owl.controller.Owl
import game.owl.model.Assets

import geometry.Point

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global

class ScrollView extends View
{
	def initScroll(bounds:Point) =
	{

		var dragStart:Point = Point(0,0)

		container.addEventListener("mousedown",  (e:MouseEvent) =>
		{
			dragStart = Point(e.stageX, e.stageY)
		})
		container.addEventListener("pressmove", (e:MouseEvent) =>
		{
			val delta = Point(e.stageX, e.stageY) - dragStart
			container.x += delta.x
			container.y += delta.y

			/* Can be written more nice way? */
			if(container.x>0)
				container.x=0
			if(container.y>0)
				container.y=0

			if(container.x<bounds.x)
				container.x=bounds.x
			if(container.y<bounds.y)
				container.y=bounds.y

			dragStart = Point(e.stageX, e.stageY)
		})
	}
}

