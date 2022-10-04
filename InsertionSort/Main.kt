fun main(){
    val values: IntArray = intArrayOf(9, 5, 7, 3, -1, 8, 0, 6, 1, 1, 10, -59, 101, 1, 6, 90)
    InsertionSort(values)
    for(i in values) println(i)
}

internal fun InsertionSort(arr: IntArray){
    for(i: Int in arr.indices) {
        var curMinInd: Int = i
        for(j: Int in i until arr.size){
            if(arr[curMinInd] > arr[j])
                curMinInd = j
        }
        val temp: Int = arr[i]
        arr[i] = arr[curMinInd]
        arr[curMinInd] = temp
    }
}