package matematik

object Vec2Calculations {

  fun average(list: Iterable<Vec2>): Vec2 {
    val iterator = list.iterator()
    val first = iterator.next()
    var max = 1
    var result = first
    while (iterator.hasNext()) {
      result += iterator.next()
      max++
    }
    return result / max
  }

  fun closest(list: Iterable<Vec2>, point: Vec2): Vec2 {
    val iterator = list.iterator()
    val first = iterator.next()
    var result = first
    fun calcDist(to: Vec2) = to.distanceTo(point)
    var distance = calcDist(result)
    while (iterator.hasNext()) {
      val next = iterator.next()
      val newDistance = calcDist(next)
      if (newDistance < distance) {
        distance = newDistance
        result = next
      }
    }
    return result
  }

}