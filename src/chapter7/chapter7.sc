val ns = List(1,2,3,4)
ns

var ns2 = List()
ns2

ns.foreach(println(_))

ns.map(println(_))

println("haha")

// tuple
// 22개 까지 허용 됨
//(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)

None

var none1 = None

var strNone = "None"

def matchFunction(input: Any): Any = input match {
  case "None" => println("none")
  case Some("None") => println("some none")
  case None => println("none type")
  case 100 => "hundred"
  case "hundred" => 100
  case etcNumber: Int => "입력값은 100이 아닌 Int형 정수입니다." + etcNumber
  case _ => "기타"
}

println(matchFunction(none1))
println(matchFunction(strNone))
