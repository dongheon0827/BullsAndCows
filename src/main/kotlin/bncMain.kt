package org.example

import java.util.*

fun bncMain() {
    var count: Int = 0
    var strike: Int = 0
    var ball: Int = 0
    var userInput: List<Int>
    var randNum = mutableSetOf<Int>() // Set는 중복된 값이 안생김
    while (randNum.size < 3) {
        randNum.add(Random().nextInt(8) + 1) // 0부터 시작이라 1~9를 하려면 (0~8)+1
    }
    println("게임을 시작합니다 / 숫자는 띄어쓰기로 구분하여 세개를 입력해주세요 / 예)1 2 3")
    // while문 따로 함수로 뺄 수 있을거 같음

    while (strike != 3) {
        do {
            print("숫자를 입력하세요 :")
            userInput = readln().split(' ').map { it.toInt() } // 띄어쓰기로 끝내면 Null을 받는듯
            if (userInput.size == 3) continue

        else println("숫자 세개를 중복되지 않게 입력해주세요")// 예외처리 더 정밀하게 하기
    } while (userInput.size != 3)

        println(userInput.size)
    println(userInput)
    println(randNum.size)
    println(randNum)


}

}