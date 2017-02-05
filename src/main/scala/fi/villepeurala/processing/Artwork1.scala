package fi.villepeurala.processing

import processing.core.PApplet

class Artwork1 extends PApplet {
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
    if (mousePressed) {
      line(mouseX, mouseY, pmouseX, pmouseY)
    }
  }
}
