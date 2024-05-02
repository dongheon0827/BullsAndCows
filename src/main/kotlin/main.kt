package org.example

fun main() {
    val gameRecord = BncRecord()

    while (true) {
        println("1.게임 시작하기 2.게임 기록 보기 3.종료하기")
        val selectNum: Int = readln().toInt()

        when (selectNum) {
            1 -> bncMain(gameRecord)
            2 -> gameRecord.print()
            3 -> {
                println("숫자 야구 게임을 종료합니다")
                return
            }

            else -> {
                println("올바른 숫자를 입력해주세요")
            }
        }
    }
}

