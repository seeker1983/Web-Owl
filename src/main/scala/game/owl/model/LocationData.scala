package game.owl.model

import geometry.Point

import game.owl.view.Player

class LocationData(
	val id:String,
	val name:String,
	val pos:Point,
	val isVisible: () => Boolean = () => false)
{
	override def toString():String = id + pos.toString
}
object Locations {

	object HomeLocation     extends LocationData(
		"home",
		"Home",
		Point(100,100),
		() => true
	)
	object MountainLocation extends LocationData(
		"mountain",
		"Mountain",
		Point(200,200),
		() => true
	)
	object LairLocation     extends LocationData(
		"lair",
		"Lair",
		Point(500,100),
		() => Player.state.hasTag("location 3")
	)

	val all = List[LocationData] (
		HomeLocation,
		MountainLocation,
		LairLocation
	)

    def getById(id:String):LocationData = {
    	all.map( location => {
    			if(location.id == id)
    				return location
    		})
    	throw new Error("Location " + id +" not found")
    	null
    }
}
