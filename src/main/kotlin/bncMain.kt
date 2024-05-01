package org.example

var GameRecord = BncRecord()

fun bncMain() {
    val randNum = MakeAnswer()
    val userInput = UserInput()
    println("게임을 시작합니다. 숫자를 입력하세요")
    var count = 0
    while (true) {
        var strike = 0
        var ball = 0

        val userNum = userInput.UserInputList()

        count++

//        println(userNum)
//        println(randNum)

        for ((index, num) in userNum.withIndex()) {
            if (randNum[index] == num) {
                strike++
            } else if (randNum.contains(num)) {
                ball++
            }
        }
        println("$count 번째, $strike 스트라이크, $ball 볼")
        if(strike==3) {
            println("정답입니다")
            GameRecord.addRecord(count)
            break
        }
    }
}
fun bncRecord() {
    GameRecord.printRecord()
}