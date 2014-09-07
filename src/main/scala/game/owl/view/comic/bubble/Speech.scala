package game.owl.view.comic

import game.owl.view.View

import scala.scalajs.js
import scala.scalajs.js.createjs._


class Speech(dialog:String, x:Double, y:Double) extends View(x,y)
{
	val shape = new Shape()
    addChild(shape)

    val text = new Text(dialog, "18px Arial", "#7777ff")
    text.x = 15
    text.y = 15

    val h = text.getBounds().height + 40
    val w = text.getBounds().width + 40
    val bw = 4
    shape.graphics.beginFill("gray").drawRoundRectComplex(0,0,w,h,10,10,10,10)
    shape.graphics.beginFill("white").drawRoundRectComplex(bw,bw,w-2*bw,h-2*bw,10,10,10,10)
    shape.graphics.beginFill("gray").moveTo(w/4,h-bw).lineTo(w/4,h*4/3).lineTo(w/2,h).closePath()
    shape.graphics.beginFill("white").moveTo(w/4+bw,h-bw).lineTo(w/4+bw,h*4/3-bw).lineTo(w/2-bw,h-bw).closePath()

    addChild(text)
}

