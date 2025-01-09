fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.replaceAll { it * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10] // Correct Output

    //Alternative using map and assigning the result
    val newList = mutableList.map {it * 2}
    println(newList) // Output: [4, 8, 12, 16, 20]
    println(mutableList) // Output: [2, 4, 6, 8, 10] // Original list is modified
}