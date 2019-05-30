import random
from datetime import datetime


class Heap:
    """
    This class implements min heap for heap sorting.
    Time of the sorting: O(n*lg(n))
    """

    def __init__(self, array):
        self.heap = array[:]
        self.size = len(array) - 1
        self.build_heap()

    @staticmethod
    def parent(i):
        return i // 2

    @staticmethod
    def left_child(i):
        return 2 * i

    @staticmethod
    def right_child(i):
        return 2 * i + 1

    def build_heap(self):
        for i in range(self.size // 2, -1, -1):
            self.sift_down(i)

    def sift_down(self, i):
        min_index = i
        l = self.left_child(i)
        if l <= self.size and self.heap[l] < self.heap[min_index]:
            min_index = l

        r = self.right_child(i)
        if r <= self.size and self.heap[r] < self.heap[min_index]:
            min_index = r

        if i != min_index:
            self.swap(i, min_index)
            self.sift_down(min_index)

    def sift_up(self, i):
        while i > 0 and self.heap[self.parent(i)] > self.heap[i]:
            self.swap(self.parent(i), i)
            i = self.parent(i)

    def swap(self, i, j):
        t = self.heap[i]
        self.heap[i] = self.heap[j]
        self.heap[j] = t

    def insert(self, p):
        self.size += 1
        self.heap.append(p)
        self.sift_up(self.size)

    def extract_min(self):
        result = self.heap[0]
        self.heap[0] = self.heap[self.size]
        self.heap.pop(self.size)
        self.size = self.size - 1
        self.sift_down(0)
        return result

    def heap_sort(self):
        return [self.extract_min() for _ in range(self.size+1)]


def insertion_sort(array):
    """
    This function implements sorting of the array.

    Time: O(n^2)
    """

    for i in range(1, len(array)):

        key = array[i]
        j = i - 1

        while j >= 0 and array[j] > key:

            array[j + 1] = array[j]

            j = j - 1

        array[j + 1] = key

    return array


def quick_sort(array, p, r):
    """
    This function implements quick sort algorithm

    Time: O(n*lg(n))
    """

    def partition(array, p, r):
        x = array[r]
        i = p - 1

        for j in range(p, r):
            if array[j] <= x:
                i = i + 1
                array[i], array[j] = array[j], array[i]
        array[i + 1], array[r] = array[r], array[i + 1]
        return i + 1

    if p < r:
        q = partition(array, p, r)
        quick_sort(array, p, q-1)
        quick_sort(array, q+1, r)

    return array


if __name__ == "__main__":
    a1 = [random.randint(-100000, 100000) for _ in range(100000)]
    a2 = a1[:]
    a3 = a1[:]
    a4 = a1[:]
    a5 = a1[:]
    print("Array generated")

    start1 = datetime.now()
    h = Heap(a2)
    end1 = datetime.now()
    h.heap_sort()
    print(f"Heap sort time: {end1 - start1}")

    start2 = datetime.now()
    quick_sort(a3, 0, len(a3)-1)
    end2 = datetime.now()
    print(f"Quick sort time: {end2 - start2}")

    start3 = datetime.now()
    a4.sort()
    end3 = datetime.now()
    print(f"Python sort time: {end3 - start3}")

    start = datetime.now()
    insertion_sort(a1)
    end = datetime.now()
    print(f"Insertion sort time: {end - start}")
