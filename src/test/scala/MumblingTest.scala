import org.scalatest.FunSuite

class MumblingTest extends FunSuite {
    test("OnlyLowerCase") {
        assert(Mumbling.accum("abcd") === "A-Bb-Ccc-Dddd")
    }

    test("MixedLetters") {
        assert(Mumbling.accum("RqaEzty") === "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy")
        assert(Mumbling.accum("cwAt") === "C-Ww-Aaa-Tttt")
    }

    test("With numbers") {
        assert(Mumbling.accum("4bcd") === "Not a valid input")
        assert(Mumbling.accum("AbCd3") === "Not a valid input")
        assert(Mumbling.accum("Ab5d3") === "Not a valid input")
    }
}
