package game.owl.view.battle

import game.owl.model.battle._
import game.owl.view._

import scala.util.Random

import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.createjs._

import geometry.Point

case class BoardPlace(row:Int, col:Int)

class BoardView extends View
{
  var selected:BoardItem = null // Rewrite somehow more clean

  val w=7
  val h=7
  0 until h map { i=>
    0 until w map { j=>
      val item = BoardItem(Random.nextInt(7), BoardPlace(i, j))
      item.click(() => {clicked(item)})
      addChild(item, Point(i*item.w, j*item.h))
    }
  }

  def clicked(item:BoardItem) =
  {
  	selected match {
  		case null => selected = item; item.select()
  		case `item` => selected = null; item.unselect()
  		case BoardItem(_, BoardPlace(row, col)) if(
  			List[Int](Math.abs(row - item.place.row), Math.abs(col - item.place.col)).sortWith(_<_).equals(List[Int](0, 1))
  			) =>
		{
			selected.unselect
			swap(item, selected)
			selected = null
		}
  		case BoardItem(_,_) =>
  		{
			selected.unselect
			item.select
			selected=item
		}
  	}

  }

  def swap(item1:BoardItem, item2:BoardItem) = {

  	item1.tweenTo(item2.pos, 500)
  	item2.tweenTo(item1.pos, 500)

  	val sw = item1.place
  	item1.place=item2.place
  	item2.place=sw
  }
}

