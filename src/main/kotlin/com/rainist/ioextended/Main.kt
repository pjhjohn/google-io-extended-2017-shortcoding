package com.rainist.ioextended


fun solve(combinedList: List<Long>): List<Long> {
    if (combinedList.isEmpty()) return emptyList()

    val unsolved = combinedList.toMutableList()
    unsolved.remove(combinedList[0])
    unsolved.remove(combinedList[0] * 4 / 3)

    return listOf(combinedList[0]) + solve(unsolved)
}
