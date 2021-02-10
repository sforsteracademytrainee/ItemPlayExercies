package services

object Words {



  def doWords(num: Int) = {

    var words = ""
    for ( i <- 1 to num) {
      words = words.concat(s"wake up$i ")
    }
    words
  }

}
