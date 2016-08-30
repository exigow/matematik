package matematik

data class Vec2(val x: Float, val y: Float) {

  constructor(x: Int, y: Int) : this(x.toFloat(), y.toFloat())
  constructor(x: Float, y: Int) : this(x, y.toFloat())
  constructor(x: Int, y: Float) : this(x.toFloat(), y)

  operator fun plus(other: Vec2) = copy(x + other.x, y + other.y)

  operator fun minus(other: Vec2) = copy(x - other.x, y - other.y)

  operator fun times(other: Vec2) = copy(x * other.x, y * other.y)
  operator fun times(multiplier: Float) = copy(x * multiplier, y * multiplier)
  operator fun times(multiplier: Int) = times(multiplier.toFloat())

  operator fun div(other: Vec2) = copy(x / other.x, y / other.y)
  operator fun div(divider: Float) = copy(x / divider, y / divider)
  operator fun div(divider: Int) = div(divider.toFloat())

  fun length() = FloatMath.sqrt(x * x + y * y)

  fun normalize(): Vec2 {
    val l = length()
    if (l == 0f)
      return this
    return this / l
  }

  fun distanceTo(other: Vec2) = (this - other).length()

  fun angle() = FloatMath.atan2(y, x)

  fun angleTo(other: Vec2) = -(this - other).angle()

  fun onlyX() = copy(x, 0f)

  fun onlyY() = copy(0f, y)

  fun rotate90Clockwise() = copy(-y, x)

  fun rotate90CounterClockwise() = copy(y, -x)

  fun rotate(angle: Float): Vec2 {
    val c = FloatMath.cos(angle)
    val s = FloatMath.sin(angle)
    val dx = x  * c - y * s
    val dy = x  * s + y * c
    return copy(dx, dy)
  }

  fun negate() = this * -1

  fun isZero() = x == 0f && y == 0f

  fun toFloatArray() = floatArrayOf(x, y)

  companion object {

    @JvmStatic fun zero() = matematik.Vec2(0f, 0f)

    @JvmStatic fun one() = matematik.Vec2(1f, 1f)

  }

  override fun toString() = "($x, $y)"

}