package game.owl.model.state

class WorldState(val playerState:PlayerState) extends StorageableState
{
	def save() =
	{
		playerState.save()
	}
}

object WorldState
{
	def load() =
	{
		new WorldState(PlayerState.load())
	}
}

object DefaultState extends WorldState(DefaultPlayerState)

