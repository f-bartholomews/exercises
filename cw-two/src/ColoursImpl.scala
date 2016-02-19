/**
  *
  */
class ColoursImpl extends Colours {

 //val s: Set[String] = Set("Blue", "ASD")

  /**
    * Takes a set of Strings and return the first letter of each, capitalized
    *
    * @param colours the set of valid colours
    * @return the first letter of each, capitalized
    */
  override def getPegs(colours: Set[String]): Array[Char] = {
    val pegs: Array[Char] = new Array[Char](colours.size)
      pegs :+ colours.map(_.charAt(0).toUpper)
        println(colours.map(_.charAt(0).toUpper))
      //println(pegs.mkString("\n"))
      pegs
    }
}
