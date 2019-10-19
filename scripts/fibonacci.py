def find_pisano(n, m):
    pisano = []
    pisano.append(0)
 
    if m == 1:
        return pisano

    pisano.append(1)

    if n <= 1:
        return pisano
 
    n0 = 0
    n1 = 1
    for __ in range(m * 6):
        n0, n1 = n1, (n0 + n1) % m
 
        pisano.append(n1 % m)
 
        if pisano[len(pisano) - 1] == 1 \
            and pisano[len(pisano) - 2] == 0:
            break
 
    return pisano[:-2]


def fibonacci_mod(n, m):
    if n <= 2:
        return 1
    else:
        pisano = find_pisano(n, m)
        return pisano[n % len(pisano)]


def fibonacci_slow(n):
    if n <= 1:
        return n
    else:
        return fibonacci_slow(n - 1) + fibonacci_slow(n - 2)


def fibonacci_fast(n, m = None):
    f0 = 0
    f1 = 1
    fn = f0 + f1
    for i in range(2, n + 1):
        if m:
            fn = (f0 + f1) % m
        else:
            fn = f0 + f1
        f0 = f1
        f1 = fn
    return fn


if __name__ == "__main__":

    from datetime import datetime

    print("Calculation of n-th number of Fibonacci sequence")
    n = int(input("Enter n >> "))

    print("Slow algorithm")
    start = datetime.now()
    print(f"Result: {fibonacci_slow(n)}")
    end = datetime.now()
    print(f"Time: {end - start}\n")

    print("Fast algorithm")
    start = datetime.now()
    print(f"Result: {fibonacci_fast(n)}")
    end = datetime.now()
    print(f"Time: {end - start}\n")

    print("Module calculation")
    n = int(input("Enter new n >> "))
    m = int(input("Enter m >> "))

    print("Slow algorithm")
    start = datetime.now()
    print(f"Result: {fibonacci_fast(n, m)}")
    end = datetime.now()
    print(f"Time: {end - start}\n")

    print("Fast algorithm")
    start = datetime.now()
    print(f"Result: {fibonacci_mod(n, m)}")
    end = datetime.now()
    print(f"Time: {end - start}")
