package insertionSort

class InsertionSort {
    companion object {
        fun <T : Comparable<T>> insertionSort(arr: Array<T>) {
            for (i: Int in arr.indices) {
                var curMinInd: Int = i
                for (j: Int in i until arr.size) {
                    if (arr[curMinInd] > arr[j])
                        curMinInd = j
                }
                val temp: T = arr[i]
                arr[i] = arr[curMinInd]
                arr[curMinInd] = temp
            }
        }

    }
}
