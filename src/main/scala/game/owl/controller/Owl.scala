package game.owl.controller

import game.owl.model.state.WorldState
import game.owl.view.stage
import game.owl.view.WorldView
import game.owl.model.Assets

import scala.scalajs.js.createjs._

import scala.scalajs.js

import storage.LocalStorage

object Owl
{
	lazy val world = new WorldView(WorldState.load())

	def init():Unit = Assets.preload(AssetsLoaded)

	def AssetsLoaded():Unit =
	{
		stage.addChild(world)
	}
}