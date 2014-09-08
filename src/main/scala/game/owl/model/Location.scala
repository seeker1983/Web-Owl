package game.owl.model

import geometry.Point

import game.owl.view.Player

class Location(val pos:Point, val id:String, val isVisible: () => Boolean = () => false)
{
	override def toString():String = id + pos.toString
}
object Locations {

	object Location1 extends Location(Point(100,100),"Location 1", () => true)
	object Location2 extends Location(Point(200,200),"Location 2", () => true)
	object Location3 extends Location(Point(500,100),"Location 3", () => Player.state.hasTag("location 3"))
	object Location4 extends Location(Point(400,400),"Location 4")
	object Location5 extends Location(Point(700,700),"Location 5")
	object Location6 extends Location(Point(300,600),"Location 6")
	object Location7 extends Location(Point(1000,400),"Location 7")
	object Location8 extends Location(Point(700,1000),"Location 8")
	object Location9 extends Location(Point(1100,900),"Location 9")
	object Location10 extends Location(Point(1200,800),"Location 10")
	object Location11 extends Location(Point(1000,300),"Location 11")
	object Location12 extends Location(Point(1200,450),"Location 12")
	object Location13 extends Location(Point(900,500),"Location 13")
	object Location14 extends Location(Point(1300,900),"Location 14")

	val all = List[Location] (
		Location1,
		Location2,
		Location3,
		Location4
	)

    def getById(id:String):Location = {
	    id match { // TODO: can be done better?
	      case "Location 1" => Location1
  	        case "Location 2" => Location2
	        case "Location 3" => Location3
	        case _ => Location1
	    }
    }
}
