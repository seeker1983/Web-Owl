package game.owl.model.state

import game.owl.model._

class MapState(val locations:List[Location])
{
    def save() =
    {
        throw new Error("Not implemented")
    }
}

object MapState
{
    def load():MapState =
    {
        val mapState = storage.LocalStorage.get("MapState")
        if(mapState != null)
            MapState.fromString("" + mapState)
        else
            DefaultMapState
    }

    def fromString(data:String) =
    {
        throw new Error("Not implemented")
    }
}



object DefaultMapState extends MapState( List[Location](
    Location1,
    Location2,
    Location3,
    Location4,
    Location5,
    Location10,
    Location11,
    Location12,
    Location13,
    Location14
))

