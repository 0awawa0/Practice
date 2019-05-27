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
    "^": Operator("3", "Right", operator.pow)
}

FUNCTIONS = {
    "sin": Function(1, lambda x: math.sin(math.radians(x))),
    "cos": Function(1, lambda x: math.cos(math.radians(x))),
    "tg": Function(1, lambda x: math.tan(math.radians(x))),
    "ctg": Function(1, lambda x: 1 / math.tan(math.radians(x))),
    "max": Function("multiple", max)
}


def parse_expression(expression: str):
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

            out.append(float(number))
            continue

        if expression[pointer] in OPERATORS:
            out.append(expression[pointer])
            pointer += 1
            continue

        if expression[pointer] in "(),":
            out.append(expression[pointer])
            pointer += 1
            continue

        if expression[pointer] == " ":
            pointer += 1
            continue

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


def shunting_yard(expression: list):
    """
    This function implements Shunting yard algorithm. 
    Function needs preprocessed list from parse_expression function.
    Function returns list of expression in reversed polish notation.
    """
    if isinstance(expression, str):
        expression = parse_expression(expression)

    out = []
    stack = []
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


def calculate(expression: list):
    """
    This function calculates the expression in reversed polish notation.
    Function takes list from shunting_yard function.
    Function returns number - result of calculation.

    I know, I can calculate the expression in the shunting_yard function.
    I will make it later.
    """

    if isinstance(expression, str):
        expression = shunting_yard(expression)

    stack = []
    right_stack = []
    for token in expression:
        if isinstance(token, float) or isinstance(token, int):
            if len(right_stack) < 0:
                op1 = stack.pop()
                op2 = token
                oper = right_stack.pop()
                stack.append(OPERATORS[oper].func(op1, op2))
            else:
                stack.append(token)
            continue
        if token in OPERATORS:
            op2 = stack.pop()
            op1 = stack.pop()
            stack.append(OPERATORS[token].func(op1, op2))
            continue
        if token in FUNCTIONS:
            if FUNCTIONS[token].arg_count == "multiple":
                count = stack.pop()
                args = [stack.pop() for _ in range(count)]
                stack.append(FUNCTIONS[token].func(args))
            else:
                stack.append(FUNCTIONS[token].func(stack.pop()))
            continue

    return stack.pop()


if __name__ == "__main__":

    inp = input("Write the expression: ")
    parsed = parse_expression(inp)
    print(parsed)
    polish = shunting_yard(parsed)
    print(polish)
    result = calculate(polish)
    print(result)
