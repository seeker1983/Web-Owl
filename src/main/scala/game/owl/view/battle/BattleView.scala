package game.owl.view.battle

import game.owl.view.View
import game.owl.view.button._
import game.owl.model.battle._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import geometry.Point

class BattleView(data:BattleData, callback:() => Unit = {() => }) extends BattleBg
{
	addChild(new ConcedeButtonView(() => {
		removeChildren()
		callback()
	}), Point(520, 600))

    addChild(new BoardView(), Point(400, 100))

}

