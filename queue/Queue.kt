package queue

class Queue<T> {
    private var data: Array<Any?> = arrayOfNulls(0)
    private var increase: Boolean = false
    private var readInd: Int = 0
    private var size: Int = 0

    fun changeSize(data: Array<Any?>, increase: Boolean){
        if(increase){
            val newData = arrayOfNulls<Any?>(data.size + 1)
            for(i in data.indices)
                newData[i] = data[i]
            this.data = newData
        }else{
            val newData = arrayOfNulls<Any?>(data.size - 1)
            for(i in 1 until data.size)
                newData[i  - 1] = data[i]
            this.data = newData
        }
    }

    //включение нового элемента
    fun push(element: T){
        size++
        increase = true
        changeSize(data, this.increase)
        data[data.size - 1] = element
    }

    //исключение элемента из очереди
    fun pop(): T {
        size--
        val removingEl: T = data[0] as T
        increase = false
        changeSize(data, this.increase)
        return removingEl
    }

    //неразрушающее чтение элемента
    fun read(): T {
        size--
        return data[readInd++] as T
    }

    //определение текущего числа элементов в очереди
    fun size(): Int{
        return this.size
    }

    //очистка очереди
    fun clean(){
        size = 0
        data = arrayOfNulls(0)
    }


}