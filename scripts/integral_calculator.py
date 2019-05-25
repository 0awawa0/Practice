from math import sin, pi, exp


function = sin  # (0, pi) 2
function1 = lambda x: x / (x ** 4 + 16) ** 0.5  # (0, 3**0.5) ~0,.35
function2 = lambda x: exp(1 / x) / x ** 2  # (1, 2) e - e ** 0.5
function3 = lambda x: exp(-x ** 2)

def rectangle_method(lower_bound:float, upper_bound:float,
	interval_count: int, function):
	
	if interval_count == 0:
		return

	if lower_bound > upper_bound:
		lower_bound, upper_bound = upper_bound, lower_bound

	result = 0

	step = (upper_bound - lower_bound) / interval_count

	while lower_bound < upper_bound:
		result += function(lower_bound) * step
		lower_bound += step

	return result


def trapezium_method(lower_bound:float, upper_bound:float,
	interval_count:int, function):
	
	if interval_count == 0:
		return

	if lower_bound > upper_bound:
		lower_bound, upper_bound = upper_bound, lower_bound

	result = 0

	step = (upper_bound - lower_bound) / interval_count

	while lower_bound < upper_bound:
		result += (function(lower_bound) + function(lower_bound + step))\
			/ 2 * step
		lower_bound += step

	return result


def simpson_method(lower_bound:float, upper_bound:float,
	interval_count:int, function):
	
	if interval_count == 0:
		return

	if lower_bound > upper_bound:
		lower_bound, upper_bound = upper_bound, lower_bound

	result = 0

	step = (upper_bound - lower_bound) / interval_count

	while  lower_bound < upper_bound:
		result += step / 3 * (
			function(lower_bound) + 
			4 * function(lower_bound + step) + 
			function(lower_bound + 2 * step)
			)
		lower_bound += 2 * step
	
	return result


def floating_quad(lower_bound:float, upper_bound:float,
	interval_count:int, function, precision:float=0.01):

	if interval_count == 0:
		return

	if lower_bound >= upper_bound:
		lower_bound, upper_bound = upper_bound, lower_bound

	result = 0

	step = (upper_bound - lower_bound) / interval_count

	while lower_bound < upper_bound:

		inner_step = step
		delta = abs(function(lower_bound + inner_step) - function(lower_bound))

		while  delta > precision:
			inner_step = delta / interval_count
			delta = function(lower_bound + inner_step) - function(lower_bound)

		inner_upper = lower_bound + step

		while lower_bound < lower_bound + inner_step:
			result += function(lower_bound) * inner_step

			lower_bound += inner_step

	return result


if __name__ == "__main__":
	rm = rectangle_method(0, pi, 10000, function)
	tm = trapezium_method(0, pi, 10000, function)
	sm = simpson_method(0, pi, 10000, function)
	#fm = floating_quad(0, pi, 10000, function, precision=1e-3)
	print(f"Rectangle method: {rm}, delta: {abs(2 - rm)}")
	print(f"Trapezium method: {tm}, delta: {abs(2 - tm)}")
	print(f"Simpson method: {sm}, delta: {abs(2 - sm)}")
	print()
	#print(f"Floating quad: {fm}, delta: {abs(2 - fm)}")

	rm = rectangle_method(0, 3 ** 0.5, 10000, function1)
	tm = trapezium_method(0, 3 ** 0.5, 10000, function1)
	sm = simpson_method(0, 3 ** 0.5, 10000, function1)

	print(f"Rectangle method: {rm}, delta: {abs(0.35 - rm)}")
	print(f"Trapezium method: {tm}, delta: {abs(0.35 - tm)}")
	print(f"Simpson method: {sm}, delta: {abs(0.35 - sm)}")
	print()

	rm = rectangle_method(1, 2, 10000, function2)
	tm = trapezium_method(1, 2, 10000, function2)
	sm = simpson_method(1, 2, 10000, function2)

	print(f"Rectangle method: {rm}, delta: {abs((exp(1) - exp(0.5)) - rm)}")
	print(f"Trapezium method: {tm}, delta: {abs((exp(1) - exp(0.5)) - tm)}")
	print(f"Simpson method: {sm}, delta: {abs((exp(1) - exp(0.5)) - sm)}")
	print()

	rm = rectangle_method(0, 2, 10000, function3)
	tm = trapezium_method(0, 2, 10000, function3)
	sm = simpson_method(0, 2, 10000, function3)

	print(f"Rectangle method: {rm}")
	print(f"Trapezium method: {tm}")
	print(f"Simpson method: {sm}")
	print()
