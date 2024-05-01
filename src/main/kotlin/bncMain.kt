package org.example

fun bncMain(gameRecord: BncRecord) {
    val randNum = MakeAnswer()
    val userInput = UserInput()
    println("게임을 시작합니다. 숫자를 입력하세요")
    var count = 0
    while (true) {
        var strike = 0
        var ball = 0

        val userNum = userInput.userInputList()

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
        if (strike == 0 && ball == 0) println("Nothing")
        else println("${count}번째, ${strike}스트라이크, ${ball}볼")
        if (strike == 3) {
            println("정답입니다")
            gameRecord.addRecord(count)
            break
        }
    }
}