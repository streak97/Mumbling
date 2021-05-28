import org.scalatest.FunSuite

class MumblingTest extends FunSuite {
    test("OnlyLowerCase") {
        assert(Mumbling.accum("abcd") === "A-Bb-Ccc-Dddd")
    }

    test("MixedLetters") {
        assert(Mumbling.accum("RqaEzty") === "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy")
        assert(Mumbling.accum("cwAt") === "C-Ww-Aaa-Tttt")
    }
}
