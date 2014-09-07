package game.owl.view.battle

import game.owl.model.battle._


class BoardView() extends BattleBg
{
  val w=7
  val h=7
  0 until h map { i=>
    0 until w map { j=>
      println(i,j)
    }
  }
  addChild(new BoardView())
}

