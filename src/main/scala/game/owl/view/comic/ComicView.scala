package game.owl.view.comic

import game.owl.view.View
import game.owl.model.comic.ComicData

import scala.scalajs.js
import scala.scalajs.js.createjs._


class ComicView(data:ComicData) extends ComicBg
{
	addChild(new Speech(data.dialog, 200, 200))
	addChild(new Thought(data.dialog, 400, 200))

	click(() => {
		removeChildren()
	})
}

