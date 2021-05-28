object Mumbling extends App {
    def accum(input: String): String = {
        val lowercaseInput = input.toLowerCase()
        var arrInput: Array[String] = lowercaseInput.sliding(1).toArray

        for (i <- arrInput.indices) yield {
            arrInput(i) *= (i + 1)
            arrInput(i) = arrInput(i).capitalize
        }

        arrInput.mkString("-")
    }
}
