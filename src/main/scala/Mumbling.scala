object Mumbling extends App {
    def accum(input: String): String = {
        if (!isAlpha(input)) return "Not a valid input"

        val lowercaseInput = input.toLowerCase()
        val arrInput: Array[String] = lowercaseInput.sliding(1).toArray

        for (i <- arrInput.indices) yield {
            arrInput(i) *= (i + 1)
            arrInput(i) = arrInput(i).capitalize
        }

        arrInput.mkString("-")
    }

    def isAlpha(input: String): Boolean = {
        val chars: Array[Char] = input.toCharArray

        for (c <- chars) {
            if (!c.isLetter) return false
        }

        true
    }
}
