'''
'''

def cut_rod(p, n):

	r = [0] * (n + 1)
	s = [0] * (n + 1)

	for j in range(n + 1):
		q = -1

		for i in range(j + 1):
			if q < p[i] + r[j - i]:
				q = p[i] + r[j - i]
				s[j] = i

		r[j] = q

	return r, s


if __name__ == "__main__":
	length = int(input("Length >> "))
	prices = [0]

	for price in input("Prices (separeted by space) >> ").split(' '):
		prices.append(int(price))

	if len(prices) != length + 1:
		print("Count of prices must be equal to the length")
		exit(1)

	print("Max money: ", str(cut_rod(prices, length)))
