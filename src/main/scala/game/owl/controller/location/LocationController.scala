package game.owl.controller

import game.owl.model._

import scala.scalajs.js
import scala.scalajs.js.createjs._

import js.Dynamic.global
import js.Dynamic.literal

import game.owl.view.Player
import game.owl.model.comic._

import game.owl.model.battle._

/* TODO: maybe this generally may be somehow better structured ??? */

package object LocationController
{
	def arrive(location:LocationData) {
		location match {
	        case Locations.MountainLocation => {
        		Player.state.addTag("location 3")
	        	Owl.world.ShowComic(Comic1, () => {
	        		Owl.world.ShowMap()
	        		})
	        }
	        case Locations.LairLocation => {
	        	Owl.world.ShowComic(Comic2, () => {
		        	Owl.world.ShowBattle(Battle1, () => {
		        		Owl.world.ShowMap()
		        	})
	        	})
	        }
	        case _ => ;
		}
	}

}

