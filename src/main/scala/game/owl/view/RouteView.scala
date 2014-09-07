package game.owl.view

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal

import game.owl.model.state._

//case class Path(a:Location, b:Location)

object RouteMap
{
//	val locations = StartingLocations.data

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

class RouteView(mapState:MapState) extends View
{
	val locations = mapState.locations.map(
		location => addChild(new LocationView(location))
	)
}

