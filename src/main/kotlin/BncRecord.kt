package org.example

class BncRecord {
    private val record: MutableList<Int> = mutableListOf()

    fun add(count: Int) {
        record.add(count)
    }

    fun print() {
        if (record.isEmpty()) {
            println("기록이 없습니다")
            return
        }
        for ((index, record) in record.withIndex()) {
            println("${index + 1}번째 게임 : 시도 횟수 - $record")
        }
    }
}