package game.owl.model.state

class WorldState(val playerState:PlayerState, val mapState:MapState) extends StorageableState
{
	def save() =
	{
		playerState.save()
		mapState.save()
	}
}

object WorldState
{
	def load() =
	{
		new WorldState(PlayerState.load(), MapState.load())
	}
}

object DefaultState extends WorldState(DefaultPlayerState, DefaultMapState)

