package queue

class Queue<T> {
    private var size: Int = 0
    private var data: Array<Any?> = arrayOfNulls(0)
    private var increase: Boolean = false

    fun changeSize(data: Array<Any?>, increase: Boolean){
        if(increase){
            size++
            val newData = arrayOfNulls<Any?>(this.size)
            for(i in data.indices)
                newData[i] = data[i]
            this.data = newData
        }else{
            size--
            val newData = arrayOfNulls<Any?>(this.size)
            for(i in 1 until data.size)
                newData[i  - 1] = data[i]
            this.data = newData
        }
    }

    fun push(element: T){
        increase = true
        changeSize(data, this.increase)
        data[size - 1] = element
    }

    fun pop(): T {
        val removingEl: T = data[0] as T
        increase = false
        changeSize(data, this.increase)
        return removingEl
    }

    fun size(): Int{
        return data.size
    }

    fun clean(){
        data = arrayOfNulls(0)
    }


}