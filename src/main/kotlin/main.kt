package org.example

fun main(){
    var selectNum: Int
    while (true) {
        println("1.게임 시작하기 2.게임 기록 보기 3.종료하기")
        selectNum = readln().toInt()
        when (selectNum) {
            1 -> bncMain()
            2 -> BncRecord()
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

