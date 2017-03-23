package fi.villepeurala.processing

import processing.core.PApplet

class Artwork1 extends PApplet {
  var point: (Int, Int) = (0, 0)

  override def settings(): Unit = {
    size(1024, 768)
  }

  override def setup(): Unit = {
    background(100)
    smooth()
  }

  override def draw(): Unit = {
    stroke(200)
    strokeWeight(10.0f)
    val (originX, originY) = point
    if (mousePressed) {
      line(mouseX, mouseY, originX, originY)
    }
    if (distance((originX, originY), (mouseX, mouseY)) > 200.0) {
      point = (mouseX, mouseY)
    }
  }

  def distance(p1: (Int, Int), p2: (Int, Int)): Double = {
    val xDist = p2._1 - p1._1
    val yDist = p2._2 - p1._2
    Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2))
  }
}

object Artwork1 {
  def main(args: Array[String]): Unit = {
    PApplet.main(classOf[Artwork1].getName)
  }
}
