package queue

class Queue<T> {
    class Node<T>(var value: T, var previous: Node<T>? = null, var next: Node<T>? = null) {}

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    //проверка на пустоту
    private fun isEmpty(): Boolean {
        return size == 0
    }

    //добавление в конец очереди
    fun push(newElement: T){
        if(isEmpty()) {
            head = Node(newElement)
            tail = head
            size++
        }
        else{
            val tmp: Node<T>? = tail
            tail?.next = Node(newElement)
            tail = tail?.next
            tail?.previous = tmp
            size++
        }
    }

    //удалениие с начала
    fun pop(): T? {
        val removingValue: Node<T>? = head
        head = head?.next
        head?.previous = null
        if(size > 0)
            size--
        return removingValue?.value
    }

    //неразрушающее чтение элемента из очереди
    fun read(): T? {
        val removingValue: Node<T>? = head
        head = head?.next
        if(size > 0)
            size--
        return removingValue?.value
    }

    //определение текущего числа элементов в очереди
    fun size(): Int{
        return this.size
    }

    //очистка очереди
    fun clean(){
        size = 0
        head = null
        tail = null
    }
}