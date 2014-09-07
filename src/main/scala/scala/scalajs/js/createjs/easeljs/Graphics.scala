package scala.scalajs.js.createjs

import scala.scalajs.js
import js.annotation.JSName

@JSName("createjs.Graphics")
class Graphics extends js.Object {
  def getRGB(r: js.Number, g: js.Number, b: js.Number, alpha: js.Number): js.String = ???

  def getHSL(hue: js.Number, saturation: js.Number, lightness: js.Number, alpha: js.Number): js.String = ???

  def initialize(): Graphics = ???

  def isEmpty(): Graphics = ???

  def draw(ctx: js.Object): Graphics = ???

  def drawAsPath(ctx: js.Object): Graphics = ???

  def moveTo(x: js.Number, y: js.Number): Graphics = ???

  def lineTo(x: js.Number, y: js.Number): Graphics = ???

  def arcTo(x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number, radius: js.Number): Graphics = ???

  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number, anticlockwise: js.Number): Graphics = ???

  def quadraticCurveTo(cpx: js.Number, cpy: js.Number, x: js.Number, y: js.Number): Graphics = ???

  def bezierCurveTo(cp1x: js.Number, cp1y: js.Number, cp2x: js.Number, cp2y: js.Number, x: js.Number, y: js.Number): Graphics = ???

  def rect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Graphics = ???

  def closePath(): Graphics = ???

  def clear(): Graphics = ???

  def beginFill(color: js.String): Graphics = ???

  def beginLinearGradientFill(colors: js.Array[js.String], ratios: js.Number, x0: js.Number, y0: js.Number, x1: js.Number, y1: js.Number): Graphics = ???

  def beginRadialGradientFill(colors: js.Array[js.String], ratios: js.Number, x0: js.Number, y0: js.Number, r0: js.Number, x1: js.Number, y1: js.Number, r1: js.Number): Graphics = ???

  //	def beginBitmapFill(image, repetition, matrix):Graphics = ???
  def endFill(): Graphics = ???

  //	def setStrokeStyle(thickness, caps, joints, miterLimit, ignoreScale):Graphics = ???
  def beginStroke(color: js.String): Graphics = ???

  def beginLinearGradientStroke(colors: js.Array[js.String], ratios: js.Number, x0: js.Number, y0: js.Number, x1: js.Number, y1: js.Number): Graphics = ???

  def beginRadialGradientStroke(colors: js.Array[js.String], ratios: js.Number, x0: js.Number, y0: js.Number, r0: js.Number, x1: js.Number, y1: js.Number, r1: js.Number): Graphics = ???

  //	def beginBitmapStroke(image, repetition):Graphics = ???
  def endStroke(): Graphics = ???

  def drawRoundRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number, radius: js.Number): Graphics = ???

  def drawRoundRectComplex(x: js.Number, y: js.Number, w: js.Number, h: js.Number, radiusTL: js.Number, radiusTR: js.Number, radiusBR: js.Number, radiusBL: js.Number): Graphics = ???

  def drawCircle(x: js.Number, y: js.Number, radius: js.Number): Graphics = ???

  def drawEllipse(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Graphics = ???

  def inject(callback: js.Function, data: js.Object): Graphics = ???

  def drawPolyStar(x: js.Number, y: js.Number, radius: js.Number, sides: js.Number, pointSize: js.Number, angle: js.Number): Graphics = ???

  def decodePath(str: js.String): Graphics = ???

  override def clone(): Graphics = ???
}

