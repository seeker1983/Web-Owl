package game.owl.view.battle

import game.owl.view.View
import game.owl.model.battle._

import scala.scalajs.js
import scala.scalajs.js.createjs._


class BattleView(data:BattleData, callback:() => Unit = {() => }) extends BattleBg
{
	click(() => {
		removeChildren()
		callback()
	})

    addChild(new BoardView())
}

