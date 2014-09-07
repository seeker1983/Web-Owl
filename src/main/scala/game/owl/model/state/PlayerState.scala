package game.owl.model.state

import game.owl.model._

class PlayerState(val location:Location)
{
	def save() =
	{
		storage.LocalStorage.set("PlayerLocation", location.id)
	}
}

object PlayerState
{
	def load():PlayerState =
	{
		val loc_id = storage.LocalStorage.get("PlayerLocation")
		if(loc_id != null)
			new PlayerState(Location.getById("" + loc_id))
		else
			DefaultPlayerState
	}
}



object DefaultPlayerState extends PlayerState(Location1)
