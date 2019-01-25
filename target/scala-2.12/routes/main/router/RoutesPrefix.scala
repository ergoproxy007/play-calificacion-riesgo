// @GENERATOR:play-routes-compiler
// @SOURCE:D:/play-framework/git/play-calificacion-riesgo/conf/routes
// @DATE:Fri Jan 25 08:45:17 COT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
