package matematik

@Suppress("NOTHING_TO_INLINE")
object FloatMath {

  val PI = Math.PI.toFloat()

  @JvmStatic
  inline fun abs(x: Float) = Math.abs(x.toDouble()).toFloat()

  @JvmStatic
  inline fun acos(x: Float) = Math.acos(x.toDouble()).toFloat()

  @JvmStatic
  inline fun asin(x: Float) = Math.asin(x.toDouble()).toFloat()

  @JvmStatic
  inline fun atan(x: Float) = Math.atan(x.toDouble()).toFloat()

  @JvmStatic
  inline fun atan2(x: Float, y: Float) = Math.atan2(y.toDouble(), x.toDouble()).toFloat()

  @JvmStatic
  inline fun cos(x: Float) = Math.cos(x.toDouble()).toFloat()

  @JvmStatic
  inline fun sin(x: Float) = Math.sin(x.toDouble()).toFloat()

  @JvmStatic
  inline fun exp(x: Float) = Math.exp(x.toDouble()).toFloat()

  @JvmStatic
  inline fun max(x: Float, y: Float) = Math.max(x, y)

  @JvmStatic
  inline fun min(x: Float, y: Float) = Math.min(x, y)

  @JvmStatic
  inline fun sqrt(x: Float) = Math.sqrt(x.toDouble()).toFloat()

  @JvmStatic
  inline fun tan(x: Float) = Math.tan(x.toDouble()).toFloat()

  @JvmStatic
  inline fun log(x: Float) = Math.log(x.toDouble()).toFloat()

  @JvmStatic
  inline fun pow(base: Float, exp: Float) = Math.pow(base.toDouble(), exp.toDouble()).toFloat()

}
