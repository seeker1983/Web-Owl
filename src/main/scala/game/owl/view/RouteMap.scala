package game.owl.view

import game.owl.model.location._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal

case class Path(a:Location, b:Location)

object RouteMap
{
	val locations = StartingLocations.data

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

