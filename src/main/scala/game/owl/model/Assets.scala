package game.owl.model

import preload.Preloader

import scala.scalajs.js.createjs.Resource

import scala.scalajs.js.Dynamic.global

object Assets
{
	var assets:Preloader = null /* Possible to replace null with throw access ? */

 	def preload(callback:() => Unit):Unit =
 	{
    if(assets != null)
        throw new Error("Assets already loaded")
    else
        assets =  new Preloader(Map(
	 			"pop" -> "sound/pop.mp3",
	 			"world" -> "img/world.png"
	 		), callback
	 	)
 	}

 	private def get(id:String):Resource =
 	{
 		if(assets == null)
 			{
 			throw new Error("Assets not loaded")
 			null  // Same as above
 			}
        else
 		  assets.get(id)
 	}
 	object img
 	{
 		def worldMap:Resource = get("world")
 	}

}
