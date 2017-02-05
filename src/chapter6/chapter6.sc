// 추출자로 작동하는 unapply() 개념만 잘 이해하고 넘어가면 됨
// 패턴 매칭은 되도록 케이스 클래스를 이용한 간략한 방식을 이용하는 편을 추천함
// 케이스 클래스는 내부적으로 apply() 와 unapply() 가 적절히 구성되어 있기 때문에 바로바로 인수를 뽑아내어 쓸 수 있기 때문

object MatchTest1 extends App {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  println(matchTest(3))
}