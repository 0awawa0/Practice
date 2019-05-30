
def max_subarray(array):
	"""
	This function searches subarray with highest summ of elements in it
	For example:
		array: 3 -4 5 6
		max_subarray: 5 6

	Time: O(n)

	Returns indexes of start and end of subarray and sum of elements in it.
	"""

	if len(array) == 0:
		return
	if len(array) == 1:
		return 0, 0, array[0]

	ans = array[0]
	ans_left = 0
	ans_right = 0
	summ = 0
	min_summ = 0
	min_pos = -1

	for i in range(len(array)):
		summ += array[i]

		cur = summ - min_summ
		if cur > ans:
			ans = cur
			ans_left = min_pos + 1
			ans_right = i

		if summ < min_summ:
			min_summ = summ
			min_pos = i
			
	return ans_left, ans_right, ans


if __name__ == "__main__":
	array = list(map(int, input("Enter array: ").split(' ')))
	print(max_subarray(array))