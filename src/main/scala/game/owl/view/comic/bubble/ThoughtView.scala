package game.owl.view.comic

import game.owl.view.View

import scala.scalajs.js
import scala.scalajs.js.createjs._

import geometry.Point


case class ThoughtView(dialog:String, position:Point) extends View(position.x, position.y)
{
	val shape = new Shape()
    addChild(shape)

    val text = new Text(dialog, "18px Arial", "#7777ff")

    val h = text.getBounds().height + 40
    val w = text.getBounds().width + 40
    val xc = 0
    val yc = 0
    val bw = 4
    shape.graphics.beginFill("gray").drawEllipse(xc,yc,w,h).
    	beginFill("white").drawEllipse(xc+bw,yc+bw,w-2*bw,h-2*bw)
    shape.graphics.beginFill("gray").drawEllipse(xc+w/6,yc+h,30,20).
        beginFill("white").drawEllipse(xc+w/6+2,yc+h+2,24,16)

    text.x = 15
    text.y = 15
    addChild(text)
}

