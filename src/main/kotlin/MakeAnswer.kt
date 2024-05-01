package org.example

import java.util.*

class MakeAnswer : ArrayList<Int>() {
    init {
        val randNum: MutableSet<Int> = mutableSetOf<Int>() // Set는 중복된 값이 안생김
        val random = Random() // 랜덤값을 while안에서 초기화하면 난수가 계속 겹칠 가능성
        while (randNum.size < 3) {
            val num = random.nextInt(10) // 0부터 9까지의 난수
            if (num != 0 || randNum.isNotEmpty()) randNum.add(num) // 맨 앞자리가 0이 아니거나, 비어있지 않은 경우에 추가
        }
        addAll(randNum)
    }
}