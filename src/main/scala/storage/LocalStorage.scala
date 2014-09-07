package storage

import scala.scalajs.js
//import org.scalajs.dom.Storage
import js.Dynamic.global

object LocalStorage
{
	/* For some reaseon, this throws illegal constructor run-time exception
	var storage = new org.scalajs.dom.Storage()

	def set(key:String, value:String) : Unit = storage.setItem(key, value)
	def get(key:String) : Dynamic = storage.getItem(key)

	def remove(key:String) : Unit = storage.removeItem(key)

	Have to write this way: */
	def get(key:String) : Dynamic = global.localStorage.getItem(key)

	def set(key:String, value:String) : Unit = global.localStorage.setItem(key, value)


	def load(key:String) : Dynamic = get(key)
	def save(key:String, value:String) : Unit = set(key, value)
}