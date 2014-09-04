package game.owl

import scala.scalajs.js
import common._
import assets.Assets
import createjs._

import js.Dynamic.global
import js.Dynamic.literal


class LocationPicture(val data:Location)
{
	val container = new Container()
	val shape = new Shape(
		     new Graphics().beginFill("#ffffff").drawCircle(0,0,18)
		     .beginFill("#777777").drawCircle(0,0,16)
		     .beginFill("#ffffff").drawCircle(0,0,14)
	);
	shape.x = data.pos.x
	shape.y = data.pos.y
	container.addChild(shape)

}

class Location(val pos:Point, val id:String)
object Location1 extends Location(Point(100,100),"Location 1")
object Location2 extends Location(Point(200,200),"Location 2")
object Location3 extends Location(Point(500,100),"Location 3")
object Location4 extends Location(Point(400,400),"Location 4")
object Location5 extends Location(Point(700,700),"Location 5")
object Location6 extends Location(Point(300,600),"Location 6")

case class Path(a:Location, b:Location)

object RouteMap
{
	val locations = List[Location] (
		Location1,
		Location2,
		Location3,
		Location4,
		Location5,
		Location6
		)

/*	val path = List[Path](
		Path(Location1,Location1),
		Path(Location2,Location1),
		Path(Location3,Location1),
		Path(Location3,Location4),
		Path(Location4,Location5),
		Path(Location1,Location6),
		Path(Location5,Location6)
		)*/
}

class RouteMap(parent:World)
{
	val container = new Container()

	var mc = new MovieClip();

	container.addChild(mc);

	val assets = parent.assets

	val locations = RouteMap.locations.map(
		location => {
			val loc = new LocationPicture(location)
			container.addChild(loc.container)
			loc.container.addEventListener("click", () =>
			{
				//TravelTo(loc)


			})
		}
	)

	def TravelTo(pic:LocationPicture):Unit =
	{
		mc.timeline.addTween(
		     Tween.get(parent.container)
		         .to(literal(x = 0)).to(literal(x = 60), 50).to(literal(x = 0), 50));
	}
//	val pathMap = new PathMap(Graph.vertex, Graph.path)

	//container.addChild(vertexMap.container)
	//container.addChild(pathMap.container)


}

