"""This module contains three functions to calculate n numbers of pi.
"""

from decimal import *
from datetime import datetime
from math import factorial


def bellard(n):
	pi = Decimal(0)
	for i in range(n):
		tmp = (Decimal(-1) ** i / (1024 ** i))
		tmp_2 = Decimal(256) / (10 * i + 1) + Decimal(1) / (10 * i + 9)
		tmp_2 += - Decimal(64) / (10 * i + 3) - Decimal(32) / (4 * i + 1)
		tmp_2 += - Decimal(4)/(10* i +5) - Decimal(4)/(10* i +7) - Decimal(1)/(4 * i+3)
		pi += tmp * tmp_2
	pi *= Decimal(1 / 64)
	return pi


def bbp(n):
	pi = Decimal(0)
	pi = Decimal(4) - Decimal(2) / 4 - Decimal(1) / 5 - Decimal(1) / 6
	if n == 1:
		return pi

	tmp = Decimal(1) / 16
	tmp_2 = Decimal(4) / 9 - Decimal(2) / 12 - Decimal(1) / 13 - Decimal(1) / 14
	pi += tmp * tmp_2
	if n == 2:
		return pi

	for i in range(2, n):
		tmp *= Decimal(1) / 16
		tmp_2 = Decimal(4) / (8 * i + 1) - Decimal(2) / (8 * i + 4)
		tmp_2 +=  - Decimal(1) / (8 * i + 5) - Decimal(1) / (8 * i + 6)
		pi += tmp * tmp_2
	return pi


def chudnovsky(n):

    pi = Decimal(13591409)
    ak = Decimal(1)
    k = 1
    while k < n:
        ak *= -Decimal((6*k-5)*(2*k-1)*(6*k-1))/Decimal(k*k*k*26680*640320*640320)

        val = ak*(13591409 + 545140134*k)
        
        d = Decimal((6*k-5)*(2*k-1)*(6*k-1))/Decimal(k*k*k*26680*640320*640320)
        
        pi += val
        k += 1
    pi = pi * Decimal(10005).sqrt()/4270934400
    pi = pi**(-1)
    return pi


def main():
	n = int(input("Enter how much numbers to calculate: "))
	getcontext().prec = n + 2

	start = datetime.now()
	pi = str(bellard(n))[:n]
	end = datetime.now()
	print(f"Bellard: {end - start}")

	start = datetime.now()
	pi = str(bbp(n))[:n]
	end = datetime.now()
	print(f"BBP: {end - start}")

	start = datetime.now()
	pi = str(chudnovsky(n))[:n]
	end = datetime.now()
	print(f"Chudnovsky: {end - start}")


if __name__ == "__main__":
	main()