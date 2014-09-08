package game.owl.view.battle

import game.owl.model.battle._
import game.owl.view._

import scala.scalajs.js.createjs._

import scala.util.Random

import geometry.Point

class BoardItemShape(color:String) extends View
{
	val shape = new Shape(
		     new Graphics().beginFill(color)
	)

	addChild(shape)
}

class CircleShape(color:String, r:Double) extends BoardItemShape(color)
{
	shape.graphics.drawCircle(r/2,r/2,r/2-5)
}

class SquareShape(color:String, r:Double) extends BoardItemShape(color)
{
	shape.graphics.rect(5,5,r-10,r-10)
}

class RombShape(color:String, r:Double) extends BoardItemShape(color)
{
	shape.graphics.moveTo(r/2, 5).lineTo(r-5, r/2).lineTo(r/2, r-5).lineTo(5, r/2).closePath
}

class TriangleShape(color:String, r:Double) extends BoardItemShape(color)
{
	shape.graphics.moveTo(r/2, 5).lineTo(r-5, r-5).lineTo(5, r-5).closePath
}

class PentangleShape(color:String, r:Double) extends BoardItemShape(color)
{
	shape.graphics.moveTo(r/2, 5).lineTo(r-5, 2*r/5).lineTo(3*r/4, r-5).lineTo(r/4, r-5).lineTo(5, 2*r/5).closePath
}

class NGonShape(n:Int, color:String, r:Double) extends BoardItemShape(color)
{
	shape.graphics.moveTo(r/2+(r/2-5)*Math.sin(2*Math.PI/n),r/2+(r/2-5)*Math.cos(2*Math.PI/n))
	1 until n+1 map { i =>
		shape.graphics.lineTo(r/2+(r/2-5)*Math.sin(2*Math.PI/n*i),r/2+(r/2-5)*Math.cos(2*Math.PI/n*i))
	}
	shape.graphics.closePath
}

case class BoardItem(itemId:Int, var place:BoardPlace) extends TweenView
{
	val colors = List("blue", "green", "yellow", "magenta", "purple", "red", "black", "red", "lightblue")

	val w=60
	val h=60

	val border = new Shape(
		     new Graphics()
		     .beginFill("#cccccc")
			 .setStrokeStyle(3)
			 .beginStroke("#555")
		     .rect(0,0,w,h)
	);
	addChild(border)

	itemId match {
		case 0 => addChild(new CircleShape(colors(itemId), w))
		case 1 => addChild(new SquareShape(colors(itemId), w))
		case 2 => addChild(new RombShape(colors(itemId), w))
		case 3 => addChild(new TriangleShape(colors(itemId), w))
		case 4 => addChild(new PentangleShape(colors(itemId), w))
		case _ => addChild(new NGonShape(itemId*2-4, colors(itemId), w))
	}

	val selection = new Shape(
		     new Graphics()
		     .beginFill("#ffffff")
		     .rect(0,0,w,h)
	);
	addChild(selection)

	unselect()

	def select() = selection.alpha = 0.6
	def unselect() = selection.alpha = 0

}

