from collections import namedtuple
import operator
import math

# Struct for operators
Operator = namedtuple("Operator", "prec assoc func")

# Struct for fuctions
Function = namedtuple("Function", "arg_count func")

NUMBERS = "0123456789"

OPERATORS = {
    "+": Operator("1", "Left", operator.add),
    "-": Operator("1", "Left", operator.sub),
    "*": Operator("2", "Left", operator.mul),
    "/": Operator("2", "Left", operator.truediv),
    "^": Operator("3", "Right", operator.pow),
    "%": Operator("2", "Left", operator.mod)
}

FUNCTIONS = {
    "sin": Function(1, lambda x: math.sin(math.radians(x))),
    "cos": Function(1, lambda x: math.cos(math.radians(x))),
    "tg": Function(1, lambda x: math.tan(math.radians(x))),
    "ctg": Function(1, lambda x: 1 / math.tan(math.radians(x))),
    "max": Function("multiple", max),
    "log": Function(1, lambda x: math.log10(x)),
    "ln": Function(1, lambda x: math.log(x)),
    "factorial": Function(1, lambda x: math.factorial(x)),
    "sqrt": Function(1, lambda x: math.sqrt(x)),
    "exp": Function(1, lambda x: math.exp(x)),
    "asin": Function(1, lambda x: math.degrees(math.asin(x))),
    "acos": Function(1, lambda x: math.degrees(math.acos(x))),
    "atg": Function(1, lambda x: math.degrees(math.atan(x))),
    "actg": Function(1, lambda x: math.degrees(1 / math.atan(x))),
    "sinh": Function(1, lambda x: math.sinh(math.radians(x))),
    "cosh": Function(1, lambda x: math.cosh(math.radians(x))),
    "tgh": Function(1, lambda x: math.tanh(math.radians(x))),
    "ctgh": Function(1, lambda x: 1 / math.tanh(math.radians(x))),
    "asinh": Function(1, lambda x: math.degrees(math.asinh(x))),
    "acosh": Function(1, lambda x: math.degrees(math.acosh(x))),
    "atgh": Function(1, lambda x: math.degrees(math.atanh(x))),
    "actgh": Function(1, lambda x: math.degrees(1 / math.atanh(x)))
}


def parse_expression(expression):
    """
    This function parses the math expression, excludes all useless characters
    and returns list with numbers, operators, functions, parentherses and
    separators of arguments.
    """

    if expression[-1] == ".":
        raise SyntaxError("Expression can't end with '.'")

    out = []
    pointer = 0
    while pointer < len(expression):

        if expression[pointer] in NUMBERS:

            # If we meet number we start to read the number to the end
            number = ""
            while expression[pointer] in NUMBERS or expression[pointer] == '.':
                if expression[pointer] == '.':
                    if '.' in number:
                        raise SyntaxError("Two '.' in one number")
                    else:
                        number += '.'
                else:
                    number += expression[pointer]
                pointer += 1
                if pointer >= len(expression):
                    break
            # After we've read the number we append it to the out list
            out.append(float(number))
            continue

        if expression[pointer] in OPERATORS:
            out.append(expression[pointer])
            pointer += 1
            continue

        if expression[pointer] in "(),":
            # Open parenthesis, closed parenthesis or separators go to the
            #  out list. Syntax Errors will be revealed later
            out.append(expression[pointer])
            pointer += 1
            continue

        # Spaces are ignored
        if expression[pointer] == " ":
            pointer += 1
            continue

        # All other characters are supposed to be part of function name
        function_name = ""
        while expression[pointer] != "(":
            try:
                function_name += expression[pointer]
            except IndexError:
                raise SyntaxError("There must be '(' after function name")
            pointer += 1

        if function_name in FUNCTIONS:
            out.append(function_name)
            out.append(expression[pointer])
            pointer += 1
            continue
        else:
            raise SyntaxError(f"No such function '{function_name}'")

    return out


def shunting_yard(expression):
    """
    This function implements Shunting yard algorithm. 
    Function needs preprocessed list from parse_expression function.
    Function returns list of expression in reversed polish notation.
    """

    # Don't know if it's necessary to explain the algorithm but whatever.
    if isinstance(expression, str):
        expression = parse_expression(expression)

    out = []
    # Stack is for operands
    stack = []
    # This stack contains count of arguments for functions
    functions_args_counter = []

    for token in expression:
        if isinstance(token, float):
            out.append(token)
            continue

        if token in FUNCTIONS:
            functions_args_counter.append(0)
            stack.append(token)
            continue

        if token == ",":
            # If we meet the separator so there must be a function with many
            #  arguments and it must be on the stack
            functions_args_counter[-1] += 1
            while stack[-1] != "(":
                try:
                    out.append(stack.pop())
                except IndexError:
                    raise SyntaxError("Missing ',' or '('")
            continue

        if token in OPERATORS:
            op1 = OPERATORS[token]
            if len(stack) == 0:
                stack.append(token)
                continue

            op2 = stack[-1]
            if op2 not in OPERATORS:
                stack.append(token)
                continue

            op2 = OPERATORS[op2]
            while (op1.assoc == "Left" and op1.prec <= op2.prec or
                   op1.assoc == "Right" and op1.prec < op2.prec) and len(stack) > 0:
                out.append(stack.pop())
            stack.append(token)
            continue

        if token == "(":
            stack.append(token)
            continue

        if token == ")":
            while stack[-1] != "(":
                out.append(stack.pop())

            stack.pop(len(stack)-1)

            if stack[-1] in FUNCTIONS:

                if FUNCTIONS[stack[-1]].arg_count == "multiple":
                    out.append(functions_args_counter[-1] + 1)

                out.append(stack.pop())

                functions_args_counter.pop()
            continue

    while len(stack) > 0:
        if stack[-1] in "()":
            raise SyntaxError("Unclosed parentheses")
        out.append(stack.pop(len(stack)-1))

    return out


def calculate(expression):
    """
    This function calculates the expression in reversed polish notation.
    Function takes list from shunting_yard function.
    Function returns number - result of calculation.

    I know, I can calculate the expression in the shunting_yard function.
    I will make it later.
    """

    if isinstance(expression, str):
        expression = shunting_yard(expression)

    # Well, the calculation is pretty simple. I read tokens from the list
    #  until I meet the function or operator.
    stack = []
    for token in expression:

        # If I meet the number I just put it on the stack
        if isinstance(token, float) or isinstance(token, int):
            stack.append(token)
            continue

        # If I meet the operator, I pop two operands from the stack,
        #  calculate the operation and put the result on the stack
        if token in OPERATORS:
            op2 = stack.pop()
            op1 = stack.pop()
            stack.append(OPERATORS[token].func(op1, op2))
            continue

        # Idea of calculation of the functions is the same as for operators.
        # Although some functions have many arguments, that's why I count amount
        # of arguments in the shunting_yard function. When I meet the
        # multi-argument function I know that first number on the stack is  the
        # count of arguments for function. So I read this number and after that
        # I read arguments from the stack to the list and pass it to the
        #  function. Result is being pushed to the stack.
        # For function with just one argument calculation is primitive.
        if token in FUNCTIONS:
            if FUNCTIONS[token].arg_count == "multiple":
                count = stack.pop()
                args = [stack.pop() for _ in range(count)]
                stack.append(FUNCTIONS[token].func(args))
            else:
                stack.append(FUNCTIONS[token].func(stack.pop()))
            continue

    # After all calculations there must be only one value on the stack.
    return stack.pop()


if __name__ == "__main__":

    inp = input("Write the expression: ")
    parsed = parse_expression(inp)
    print(parsed)
    polish = shunting_yard(parsed)
    print(polish)
    result = calculate(polish)
    print(result)
