package matematik


data class Matrix3(
  val m00: Float, val m01: Float, val m02: Float,
  val m10: Float, val m11: Float, val m12: Float,
  val m20: Float, val m21: Float, val m22: Float
) {

  fun determinant() = (m00 * m11 - m01 * m10) * m22 + (m02 * m10 - m00 * m12) * m21 + (m01 * m12 - m02 * m11) * m20;

  fun invert(): Matrix3 {
    val s = 1f / determinant()
    return Matrix3(
      m00 = (m11 * m22 - m21 * m12) * s,
      m01 = (m21 * m02 - m01 * m22) * s,
      m02 = (m01 * m12 - m11 * m02) * s,
      m10 = (m20 * m12 - m10 * m22) * s,
      m11 = (m00 * m22 - m20 * m02) * s,
      m12 = (m10 * m02 - m00 * m12) * s,
      m20 = (m10 * m21 - m20 * m11) * s,
      m21 = (m20 * m01 - m00 * m21) * s,
      m22 = (m00 * m11 - m10 * m01) * s
    )
  }

  fun transpose() = Matrix3(
    m00 = m00, m01 = m10, m02 = m20,
    m10 = m01, m11 = m11, m12 = m21,
    m20 = m02, m21 = m12, m22 = m22
  )

  fun isDiagonal() = false // todo

  companion object {

    fun zero() = Matrix3(
      0f, 0f, 0f,
      0f, 0f, 0f,
      0f, 0f, 0f
    )

    fun identity() = Matrix3(
      1f, 0f, 0f,
      0f, 1f, 0f,
      0f, 0f, 1f
    )

    fun diagonal(m00: Float, m11: Float, m22: Float) = Matrix3(
      m00, 0f, 0f,
      0f, m11, 0f,
      0f, 0f, m22
    )

  }

  override fun toString(): String {
    return "[$m00, $m01, $m02]\n[$m10, $m11, $m12]\n[$m20, $m21, $m22]"
  }

}