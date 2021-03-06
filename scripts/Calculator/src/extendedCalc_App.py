from PyQt5 import QtWidgets
from interface import extendedCalc_interface
from src.math_parser_test import MathParser


class ExtendedCalcApp(QtWidgets.QMainWindow,
                      extendedCalc_interface.Ui_MainWindow):

    def __init__(self):

        super().__init__()
        self.setupUi(self)
        self.expression = ""
        self.is_result = False
        self.mem = None

        self.parser = MathParser()

        # Connect buttons to functions
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
        self.pow_button.clicked.connect(lambda: self.insert_text("^"))
        self.mod_button.clicked.connect(lambda: self.insert_text("%"))

        self.sin_button.clicked.connect(lambda: self.insert_text("sin"))
        self.cos_button.clicked.connect(lambda: self.insert_text("cos"))
        self.tan_button.clicked.connect(lambda: self.insert_text("tg"))
        self.cotan_button.clicked.connect(lambda: self.insert_text("ctg"))
        self.asin_button.clicked.connect(lambda: self.insert_text("asin"))
        self.acos_button.clicked.connect(lambda: self.insert_text("acos"))
        self.atg_button.clicked.connect(lambda: self.insert_text("atg"))
        self.actg_button.clicked.connect(lambda: self.insert_text("actg"))
        self.sinh_button.clicked.connect(lambda: self.insert_text("sinh"))
        self.cosh_button.clicked.connect(lambda: self.insert_text("cosh"))
        self.tgh_button.clicked.connect(lambda: self.insert_text("tgh"))
        self.ctgh_button.clicked.connect(lambda: self.insert_text("ctgh"))
        self.asinh_button.clicked.connect(lambda: self.insert_text("asinh"))
        self.acosh_button.clicked.connect(lambda: self.insert_text("acosh"))
        self.atgh_button.clicked.connect(lambda: self.insert_text("atgh"))
        self.actgh_button.clicked.connect(lambda: self.insert_text("actgh"))

        self.log_ten_button.clicked.connect(lambda: self.insert_text("log"))
        self.log_e_button.clicked.connect(lambda: self.insert_text("ln"))
        self.factorial_button.clicked.connect(
            lambda: self.insert_text("factorial")
        )

        self.exp_button.clicked.connect(lambda: self.insert_text("exp"))
        self.sqrt_button.clicked.connect(lambda: self.insert_text("sqrt"))

        self.dot_button.clicked.connect(lambda: self.insert_text("."))

        self.actionRegular.triggered.connect(self.load_regular_interface)
        self.actionExtended.triggered.connect(
            lambda: self.actionExtended.setChecked(True)
        )
        self.actionProgrammer.triggered.connect(self.load_programmer_interface)

        self.del_button.clicked.connect(self.delete)
        self.clear_button.clicked.connect(self.clear_field)
        self.toMem_button.clicked.connect(self.to_mem)
        self.fromMem_button.clicked.connect(self.from_mem)

        self.result_button.clicked.connect(self.calculate)

    def clear_field(self):
        self.result_field.clear()
        self.expression = ""
        self.is_result = False

    def delete(self):
        if self.is_result:
            self.expression = ""
            self.result_field.clear()

        if self.expression != "":
            if self.expression[-1] == " ":
                self.expression = self.expression[:-2]
            else:
                self.expression = self.expression[:-1]
            self.result_field.setText(self.expression)

    def to_mem(self):
        try:
            self.mem = float(self.expression)
        except Exception:
            return

    def from_mem(self):
        if not self.mem:
            return

        if self.expression == "" or self.is_result:
            self.expression = str(self.mem)
            self.result_field.setText(self.expression)
            return

        try:
            float(self.expression)
            self.expression = str(self.mem)
            self.result_field.setText(self.expression)
            return
        except ValueError:
            lst = self.expression[-1]
            if lst == " ":
                self.expression += str(self.mem)
            if lst == "(":
                self.expression += str(self.mem) + " "
            self.result_field.setText(self.expression)

    def insert_text(self, char: str):
        """
        Insert number, operation or function to the final expression
        :param char:
        :return:
        """

        # lst is last entered character
        if self.expression != "":
            lst = self.expression[-1]
        else:
            lst = ""

        if char.isdigit():
            # Digit can't come after closed parenthesis
            if lst == ")":
                return

            # If current expression is result of calculation, erase it and
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

                # There must not be two dots in one number
                if "." in self.expression.split(" ")[-1]:
                    return

                else:
                    self.expression += char
                    self.result_field.setText(self.expression)
                    self.is_result = False
                    return

            # Dot can't be first character in the expression
            if self.expression == "":
                return

        if char in MathParser.FUNCTIONS:

            # If current expression is the result of calculation so calculate
            #  the function immediately
            if self.is_result:
                self.expression = f"{char}({self.expression})"
                self.calculate()
                return

            # Function can't come after digit
            if lst.isdigit():
                return

            self.expression += f"{char}("
            self.result_field.setText(self.expression)
            return

        if char in MathParser.OPERATORS:

            # Operator can come only after the number or after closed parenthesis
            if lst.isdigit() or self.expression[-1] == ")":
                self.expression += f" {char} "
                self.result_field.setText(self.expression)
                self.is_result = False
            return

        if char == "(":

            # Open parenthesis can't come after digit
            if lst.isdigit():
                return

            self.expression += "("
            self.result_field.setText(self.expression)

        if char == ")":

            # Closed parenthesis can come only after digit or closed parenthesis
            if not lst.isdigit() and lst != ")":
                return

            self.expression += ")"
            self.result_field.setText(self.expression)

    def calculate(self):
        """
        Calculate the expression and print the result
        :return:
        """
        try:
            # result = round(math_parser.calculate(self.expression), 4)
            result = round(self.parser.calculate(self.expression), 4)
        except SyntaxError as exception:
            self.expression = ""
            self.is_result = False
            self.mem = None
            self.result_field.setText(f"Wrong syntax! {exception}")
            return
        except Exception as exception:
            self.expression = ""
            self.is_result = False
            self.mem = None
            self.result_field.setText(exception)
            return

        if int(result) == result:
            result = f"{int(result)}"

        self.expression = f"{result}"
        self.result_field.setText(f"{result}")
        self.is_result = True

    def load_regular_interface(self):
        from src import regularCalc_App
        window = regularCalc_App.RegularCalcApp()
        window.show()
        self.close()

    def load_programmer_interface(self):
        from src import programmerCalc_App
        window = programmerCalc_App.ProgrammerCalcApp()
        window.show()
        self.close()

