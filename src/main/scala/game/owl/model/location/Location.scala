package game.owl.model.location

import geometry.Point

class Location(val pos:Point, val id:String)
object Location1 extends Location(Point(100,100),"Location 1")
object Location2 extends Location(Point(200,200),"Location 2")
object Location3 extends Location(Point(500,100),"Location 3")
object Location4 extends Location(Point(400,400),"Location 4")
object Location5 extends Location(Point(700,700),"Location 5")
object Location6 extends Location(Point(300,600),"Location 6")

object StartingLocations {
  val data = List[Location](
    Location1,
    Location2,
    Location3,
    Location4,
    Location5,
    Location6
  ) /* TODO: Remove data field possible?  */
}
