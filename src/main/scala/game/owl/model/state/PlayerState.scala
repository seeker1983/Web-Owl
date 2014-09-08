package game.owl.model.state

import game.owl.model._
import game.owl.view.Player

class PlayerState(var location:LocationData, var tags:Set[String] = Set())
{
	def save() =
	{
		storage.LocalStorage.set("PlayerLocation", location.id)
	}

	def addTag(tag:String):Unit = tags = tags + tag
	def hasTag(tag:String):Boolean = tags(tag)

	def setLocation(newLocation:LocationData):Unit = location = newLocation

}

object PlayerState
{
	def load():PlayerState =
	{
		val loc_id = storage.LocalStorage.get("PlayerLocation")
		if(loc_id != null)
			new PlayerState(Locations.getById("" + loc_id))
		else
			DefaultPlayerState
	}
}



object DefaultPlayerState extends PlayerState(Locations.HomeLocation)
