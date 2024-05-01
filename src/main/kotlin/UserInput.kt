package org.example

class UserInput {
    fun userInputList(): List<Int> {
        var userNum: List<Int> = emptyList()

        do {
            print("숫자를 입력하세요 :")
            val input = readlnOrNull() ?: ""

            //숫자가 아니어서 올바르지 않은 입력값
            if (!input.all { it.isDigit() }) { // 입력받은 문자를 숫자로 바꿔
                println("숫자만 입력해주세요")
                continue
            }
            val inputList = input.mapNotNull { it.toString().toIntOrNull() } // 숫자라면 List로 변환

            //맨 앞자리에 0이 포함되어 있어 올바르지 않은 입력값
            if (inputList.firstOrNull() == 0) {
                println("맨 앞자리에 0을 입력할 수 없습니다.")
                continue
            }

            //세자리가 아니어서 올바르지 않은 입력값
            if (inputList.size != 3) {
                println("숫자 세 개를 입력해주세요.")
                continue
            }

            //중복된 숫자가 사용되어 올바르지 않은 입력값
            if (inputList.size != inputList.toSet().size) { // 중복이 겹쳐지는 Set로 변환해서 크기 비교
                println("중복된 숫자 없이 입력해주세요.")
                continue
            }

            userNum = inputList
        } while (userNum.isEmpty())

        return userNum
    }

}