package geometry

/* Probably add some class with nothing, throwing exception on any access action */
case class Point(x:Double, y:Double)
{
  override def toString():String = "(" + x + ", " + y + ")"

  def -(p: Point): Point = {
    Point(x - p.x, y - p.y)
  }

  def +(p: Point): Point = {
    Point(x + p.x, y + p.y)
  }

  def distanceTo(that:Point):Double =
    Math.sqrt((that.x - x)*(that.x - x) + (that.y - y)*(that.y - y))
}
