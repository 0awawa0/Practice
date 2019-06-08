from PyQt5 import QtWidgets
import programmerCalc_interface
from math_parser_test import MathParser


class ProgrammerCalcApp(QtWidgets.QMainWindow,
                        programmerCalc_interface.Ui_MainWindow):

    def __init__(self):

        super().__init__()
        self.setupUi(self)
        self.expression = ""
        self.is_result = False
        self.mem = None

        self.num_base = 10
        self.dec_button.setChecked(True)
        self.a_button.setEnabled(False)
        self.b_button.setEnabled(False)
        self.c_button.setEnabled(False)
        self.d_button.setEnabled(False)
        self.e_button.setEnabled(False)
        self.f_button.setEnabled(False)

        self.parser = MathParser(num_type=int, num_base=self.num_base)

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
        self.a_button.clicked.connect(lambda: self.insert_text("A"))
        self.b_button.clicked.connect(lambda: self.insert_text("B"))
        self.c_button.clicked.connect(lambda: self.insert_text("C"))
        self.d_button.clicked.connect(lambda: self.insert_text("D"))
        self.e_button.clicked.connect(lambda: self.insert_text("E"))
        self.f_button.clicked.connect(lambda: self.insert_text("F"))

        self.plus_button.clicked.connect(lambda: self.insert_text("+"))
        self.minus_button.clicked.connect(lambda: self.insert_text("-"))
        self.mul_button.clicked.connect(lambda: self.insert_text("*"))
        self.division_button.clicked.connect(lambda: self.insert_text("/"))
        self.pow_button.clicked.connect(lambda: self.insert_text("^"))
        self.mod_button.clicked.connect(lambda: self.insert_text("%"))

        self.actionRegular.triggered.connect(self.load_regular_interface)
        self.actionExtended.triggered.connect(self.load_extended_interface)
        self.actionProgrammer.triggered.connect(
            lambda: self.actionExtended.setChecked(True)
        )

        self.del_button.clicked.connect(self.delete)
        self.clear_button.clicked.connect(self.clear_field)
        self.toMem_button.clicked.connect(self.to_mem)
        self.fromMem_button.clicked.connect(self.from_mem)

        self.oct_button.clicked.connect(
            lambda: self.change_view(8)
        )
        self.bin_button.clicked.connect(
            lambda: self.change_view(2)
        )
        self.dec_button.clicked.connect(
            lambda: self.change_view(10)
        )
        self.hex_button.clicked.connect(
            lambda: self.change_view(16)
        )

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
            self.mem = int(self.expression, self.num_base)
        except Exception:
            return

    def from_mem(self):
        if not self.mem:
            return

        if self.expression == "" or self.is_result:
            if self.num_base == 10:
                self.expression = str(self.mem)
            elif self.num_base == 8:
                self.expression = str(oct(self.mem))
            elif self.num_base == 2:
                self.expression = str(bin(self.mem))
            elif self.num_base == 16:
                self.expression = str(hex(self.mem))
            else:
                self.expression = str(self.mem)

            self.result_field.setText(self.expression)
            return

        try:
            int(self.expression)
            if self.num_base == 10:
                self.expression = str(self.mem)
            elif self.num_base == 8:
                self.expression = str(oct(self.mem))
            elif self.num_base == 2:
                self.expression = str(bin(self.mem))
            elif self.num_base == 16:
                self.expression = str(hex(self.mem))
            else:
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

        # if char == ".":
        #
        #     if lst.isdigit():
        #
        #         # There must not be two dots in one number
        #         if "." in self.expression.split(" ")[-1]:
        #             return
        #
        #         else:
        #             self.expression += char
        #             self.result_field.setText(self.expression)
        #             self.is_result = False
        #             return
        #
        #     # Dot can't be first character in the expression
        #     if self.expression == "":
        #         return

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
            self.result_field.setText(str(exception))
            return

        # if int(result) == result:
        #     result = f"{int(result)}"

        self.expression = f"{result}"
        self.result_field.setText(f"{result}")
        self.is_result = True

    def load_regular_interface(self):
        import regularCalc_App
        window = regularCalc_App.RegularCalcApp()
        window.show()
        self.close()

    def load_extended_interface(self):
        import extendedCalc_App
        window = extendedCalc_App.ExtendedCalcApp()
        window.show()
        self.close()

    def change_view(self, base):
        self.num_base = base
        if base == 8:
            self.two_button.setEnabled(True)
            self.three_button.setEnabled(True)
            self.four_button.setEnabled(True)
            self.five_button.setEnabled(True)
            self.six_button.setEnabled(True)
            self.seven_button.setEnabled(True)
            self.eight_button.setEnabled(False)
            self.nine_button.setEnabled(False)
            self.a_button.setEnabled(False)
            self.b_button.setEnabled(False)
            self.c_button.setEnabled(False)
            self.d_button.setEnabled(False)
            self.e_button.setEnabled(False)
            self.f_button.setEnabled(False)
        elif base == 2:
            self.two_button.setEnabled(False)
            self.three_button.setEnabled(False)
            self.four_button.setEnabled(False)
            self.five_button.setEnabled(False)
            self.six_button.setEnabled(False)
            self.seven_button.setEnabled(False)
            self.eight_button.setEnabled(False)
            self.nine_button.setEnabled(False)
            self.a_button.setEnabled(False)
            self.b_button.setEnabled(False)
            self.c_button.setEnabled(False)
            self.d_button.setEnabled(False)
            self.e_button.setEnabled(False)
            self.f_button.setEnabled(False)
        elif base == 16:
            self.two_button.setEnabled(True)
            self.three_button.setEnabled(True)
            self.four_button.setEnabled(True)
            self.five_button.setEnabled(True)
            self.six_button.setEnabled(True)
            self.seven_button.setEnabled(True)
            self.eight_button.setEnabled(True)
            self.nine_button.setEnabled(True)
            self.a_button.setEnabled(True)
            self.b_button.setEnabled(True)
            self.c_button.setEnabled(True)
            self.d_button.setEnabled(True)
            self.e_button.setEnabled(True)
            self.f_button.setEnabled(True)
        else:
            self.two_button.setEnabled(True)
            self.three_button.setEnabled(True)
            self.four_button.setEnabled(True)
            self.five_button.setEnabled(True)
            self.six_button.setEnabled(True)
            self.seven_button.setEnabled(True)
            self.eight_button.setEnabled(True)
            self.nine_button.setEnabled(True)
            self.a_button.setEnabled(False)
            self.b_button.setEnabled(False)
            self.c_button.setEnabled(False)
            self.d_button.setEnabled(False)
            self.e_button.setEnabled(False)
            self.f_button.setEnabled(False)

        if self.expression == "":
            return

        parsed = self.parser.parse_expression(self.expression)
        self.expression = ""
        for token in parsed:
            if isinstance(token, int):
                if base == 8:
                    self.insert_text(oct(token)[2:])
                elif base == 2:
                    self.insert_text(bin(token)[2:])
                elif base == 16:
                    self.insert_text(hex(token)[2:])
                else:
                    self.insert_text(str(token))
            else:
                self.insert_text(token)
        self.parser.num_base = self.num_base


if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    window = ProgrammerCalcApp()
    window.show()
    app.exec_()
