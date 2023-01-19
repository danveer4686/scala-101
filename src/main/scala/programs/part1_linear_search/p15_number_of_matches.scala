package programs.part1_linear_search

object p15_number_of_matches {

  def numberOfMatches(n: Int): Int = {
    var teams  = n
    var matches  = 0
    while (teams>1) {
      if (teams%2==0) {
        matches += teams/2
        teams = teams/2
      }
      else {
        matches += (teams-1)/2
        teams = (teams-1)/2 +1
      }
    }
    matches
  }

}
