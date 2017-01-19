var b: Int
//println(b) // not found: value b

var c: Int = 10
println(c)

//println(b) // not found: value b

println("hello")

// ### 참조 자료형 AnyRef

var str: String = "hello"

def manOf[T: Manifest](t: T): Manifest[T] = manifest[T]

println(manOf(str))
//println(manOf(b))
println(manOf(c))

// 4장에서 본격적으로 할 것