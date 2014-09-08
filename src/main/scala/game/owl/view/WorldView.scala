package game.owl.view

import game.owl.controller.Owl
import game.owl.model.Assets
import game.owl.model.comic._
import game.owl.model.battle._
import game.owl.view.battle._
import game.owl.model.state._
import game.owl.view.comic.ComicView

import geometry.Point

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global

class WorldView(worldState:WorldState) extends ScrollView
{
//	ShowBattle(Battle1)
//	ShowComic(Comic1)
	ShowMap()

	def ShowMap() = {
		removeChildren()
		val mapView = new MapView()
		addChild(mapView)

		Player.setState(worldState.playerState)
		addChild(Player)

		initScroll(stage.canvasSize - mapView.size)
	}

	def ShowComic(comicData:ComicData, callback:() => Unit = {() => })
	{
		removeChildren()
		addChild(new ComicView(comicData, callback))
	}

	def ShowBattle(battleData:BattleData, callback:() => Unit = {() => })
	{
		removeChildren()
		addChild(new BattleView(battleData, callback))
	}
}

