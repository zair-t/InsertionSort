import insertionSort.InsertionSort
import queue.Queue

fun main(){
    //test InsertionSort
    val values: Array<Int> = arrayOf(9, 5, 7, 3, -1, 8, 0, 6, 1, 1, 10, -59, 101, 1, 6, 90)
    InsertionSort.insertionSort(values)
    for(i in values) println(i)

    //test queue
    val queue: Queue<Int> = Queue()
    queue.push(1)
    queue.push(2)
    println(queue.size())
    queue.push(10)
    queue.push(5)
    println(queue.pop())
    println(queue.size())
    queue.push(0)
    println(queue.pop())
    println(queue.pop())
    println(queue.size())
    queue.clean()
    println(queue.size())

}