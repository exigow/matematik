package matematik

import org.testng.Assert.assertEquals
import org.testng.Assert.assertTrue
import org.testng.annotations.Test

class Vec2Test {

  @Test fun plus() {
    assertEquals(Vec2(1, 2) + Vec2(3, 4), Vec2(4, 6))
  }

  @Test fun minus() {
    assertEquals(Vec2(1, 2) - Vec2(3, 4), Vec2(-2, -2))
  }
  
  @Test fun times() {
    assertEquals(Vec2(1, 2) * Vec2(3, 4), Vec2(3, 8))
    assertEquals(Vec2(1, 2) * 3, Vec2(3, 6))
  }

  @Test fun div() {
    assertEquals(Vec2(1, 2) / Vec2(5, 4), Vec2(.2f, .5f))
    assertEquals(Vec2(2, 4) / 2, Vec2(1, 2))
  }

  @Test fun length() {
    assertEquals(Vec2.zero().length(), 0f)
    assertEquals(Vec2(1, 0).length(), 1f)
    assertEquals(Vec2(3, 4).length(), 5f)
    assertEquals(Vec2.one().length(), 1.4142135f)
  }

  @Test fun normalize() {
    assertEquals(Vec2.zero().normalize(), Vec2.zero())
    assertEquals(Vec2(1, 0).normalize(), Vec2(1, 0))
    assertEquals(Vec2(.0542f, 0).normalize(), Vec2(1, 0))
    assertEquals(Vec2(102145313, 0).normalize(), Vec2(1, 0))
    assertEquals(Vec2(0, .5f).normalize(), Vec2(0, 1))
    assertEquals(Vec2.one().normalize(), Vec2(.70710677f, .70710677f))
  }

  @Test fun testDistanceTo() {
    assertEquals(Vec2.zero().distanceTo(Vec2(3, 4)), 5f)
  }

  @Test fun isZero() {
    assertTrue(Vec2.zero().isZero())
    assertTrue(Vec2(0, 0).isZero())
  }

  @Test fun onlyX() {
    assertEquals(Vec2.one().onlyX(), Vec2(1, 0))
    assertEquals(Vec2(3, 2).onlyX(), Vec2(3, 0))
  }

  @Test fun onlyY() {
    assertEquals(Vec2.one().onlyY(), Vec2(0, 1))
    assertEquals(Vec2(-7, 4).onlyY(), Vec2(0, 4))
  }

  @Test fun rotate90Clockwise() {
    assertEquals(Vec2(2, 3).rotate90Clockwise(), Vec2(-3, 2))
  }

  @Test fun rotate90CounterClockwise() {
    assertEquals(Vec2(2, 3).rotate90CounterClockwise(), Vec2(3, -2))
  }

  @Test fun toFloatArray() {
    assertEquals(Vec2(1, 2).toFloatArray(), floatArrayOf(1f, 2f))
  }

  @Test fun negate() {
    assertEquals(Vec2.one().negate(), Vec2(-1, -1))
  }

  @Test fun staticFactories() {
    assertEquals(Vec2.zero(), Vec2(0, 0))
    assertEquals(Vec2.one(), Vec2(1, 1))
  }

}