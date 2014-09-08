package game.owl.view.comic

import game.owl.view.stage
import game.owl.view.View
import game.owl.model.comic._

import scala.scalajs.js
import scala.scalajs.js.createjs._
import js.Dynamic.literal

import geometry.Point


class ComicView(data:ComicData, callback:() => Unit = {() => }) extends ComicBg
{
	val SLIDEPOS = List(
		Point(50,50),
		Point(50 + stage.canvas.width/2,50),
		Point(50,50 + stage.canvas.height/2),
		Point(50 + stage.canvas.width/2,50 + stage.canvas.height/2)
	)
	var slideId = 0

	val slidesView = new View()

	nextSlide()

	def nextSlide() = {
		val pos = SLIDEPOS(slideId % 4)
		if(slideId % 4 == 0)
			slidesView.removeChildren()
		data.dialogs(slideId)  match {
			case ThoughtDialog(text) => fadeIn(ThoughtView(text, pos))
			case SpeechDialog(text) => fadeIn(SpeechView(text, pos))
			case _ => throw new Error("Unknown dialog")
		}
		slideId = slideId + 1
	}

	click(() => {
		if(slideId < data.dialogs.length)
			nextSlide()
		else
			{
			removeChildren()
			callback()
			}
	})

	def fadeIn(item:View)
	{
		addChild(item)
		item.container.alpha = 0
		Tween.get(item.container).to(literal(alpha = 1), 500)
	}
}

