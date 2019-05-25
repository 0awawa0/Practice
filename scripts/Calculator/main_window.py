import mainWindow_interface
from PyQt5 import QtWidgets
import math


ctg = lambda a: round(math.sin(math.radians(a)), 3) / round(cos(math.radians(a)), 3)
cos = lambda a: math.cos(math.radians(a))
sin = lambda a: math.sin(math.radians(a))
tan = lambda a: math.tan(math.radians(a))


class CalculatorApp(QtWidgets.QMainWindow,
                    mainWindow_interface.Ui_MainWindow):

    OPERATORS = ["+", "-", "*", "/", "**"]

    FUNCTIONS = ["sin", "cos", "tan", "ctg"]

    def __init__(self):

        super().__init__()
        self.setupUi(self)
        self.expression = ""
        self.is_result = False

        self.opparen_button.clicked.connect(lambda: self.insert_text("("))
        self.clparen_button.clicked.connect(lambda: self.insert_text(")"))

        self.zero_button.clicked.connect(lambda: self.insert_text("0"))
        self.one_button.clicked.connect(lambda: self.insert_text("1"))
        self.two_button.clicked.connect(lambda: self.insert_text("2"))
        self.three_button.clicked.connect(lambda: self.insert_text("3"))
        self.four_button.clicked.connect(lambda: self.insert_text("4"))
        self.five_button.clicked.connect(lambda: self.insert_text("5"))
        self.six_button.clicked.connect(lambda: self.insert_text("6"))
        self.seven_button.clicked.connect(lambda: self.insert_text("7"))
        self.eight_button.clicked.connect(lambda: self.insert_text("8"))
        self.nine_button.clicked.connect(lambda: self.insert_text("9"))

        self.plus_button.clicked.connect(lambda: self.insert_text("+"))
        self.minus_button.clicked.connect(lambda: self.insert_text("-"))
        self.mul_button.clicked.connect(lambda: self.insert_text("*"))
        self.division_button.clicked.connect(lambda: self.insert_text("/"))
        self.pow_button.clicked.connect(lambda: self.insert_text("**"))

        self.sin_button.clicked.connect(lambda: self.insert_text("sin"))
        self.cos_button.clicked.connect(lambda: self.insert_text("cos"))
        self.tan_button.clicked.connect(lambda: self.insert_text("tan"))
        self.cotan_button.clicked.connect(lambda: self.insert_text("ctg"))

        self.dot_button.clicked.connect(lambda: self.insert_text("."))

        self.result_button.clicked.connect(self.calculate)

    def insert_text(self, char: str):
        if self.expression:
            lst = self.expression[-1]
        else:
            lst = ""

        if char.isdigit():
            if lst == ")":
                return
            if self.is_result:
                self.expression = char
                self.result_field.setText(self.expression)
                self.is_result = False
                return
            self.expression += char
            self.result_field.setText(self.expression)
            return

        if char == ".":
            if lst.isdigit():
                if "." in self.expression.split(" ")[-1]:
                    return
                else:
                    self.expression += char
                    self.result_field.setText(self.expression)
            if self.expression == ".":
                return
        if char in CalculatorApp.FUNCTIONS:
            if self.is_result:
                self.expression = f"{char}({self.expression})"
                self.calculate()
                return
            if lst.isdigit():
                return
            self.expression += f"{char}("
            self.result_field.setText(self.expression)
            return
        if char in CalculatorApp.OPERATORS:
            if lst.isdigit() or self.expression[-1] == ")":
                self.expression += f" {char} "
                self.result_field.setText(self.expression)
            return
        if char == "(":
            if lst.isdigit():
                return
            self.expression += "("
            self.result_field.setText(self.expression)
        if char == ")":
            if not lst.isdigit() and lst != ")":
                return
            self.expression += ")"
            self.result_field.setText(self.expression)

    def calculate(self):
        result = round(eval(self.expression, globals(), locals()), 4)

        if int(result) == result:
            result = f"{int(result)}"

        self.expression = f"{result}"
        self.result_field.setText(f"{result}")
        self.is_result = True


if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    window = CalculatorApp()
    window.show()
    app.exec_()
