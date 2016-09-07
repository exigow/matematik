package matematik

import org.testng.Assert.*
import org.testng.annotations.Test

class Vec2CalculationsTest {

  @Test fun average() {
    val positions = listOf(
      Vec2(1, 0),
      Vec2(-1, 0),
      Vec2(0, 1),
      Vec2(0, -1)
    )
    assertEquals(Vec2Calculations.average(positions), Vec2.zero())
  }

  @Test fun closest() {
    val positions = listOf(
      Vec2(1, 0),
      Vec2(-1, 0),
      Vec2(0, 1),
      Vec2(0, -1)
    )
    val closest = Vec2Calculations.closest(positions, Vec2(2, 0))
    assertEquals(closest, Vec2(1, 0))
  }

}