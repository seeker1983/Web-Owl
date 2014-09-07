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
	val mapView = new MapView()
	addChild(mapView)

	val routeView = new RouteView(worldState.mapState)
	addChild(routeView)

	Player.setState(worldState.playerState)
	addChild(Player)

	initScroll(stage.canvasSize - mapView.size)

	val comicView = new View()
	addChild(comicView)

	//ShowComic(Comic1)

	def ShowComic(comicData:ComicData)
	{
		comicView.removeChildren()
		comicView.addChild(new ComicView(comicData))
	}

	val battleView = new View()
	addChild(battleView)

	ShowBattle(Battle1)

	def ShowBattle(battleData:BattleData)
	{
		battleView.removeChildren()
		battleView.addChild(new BattleView(battleData))
	}
}

