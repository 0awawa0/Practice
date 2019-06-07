import sys
from PyQt5 import QtWidgets
import regularCalc_App


def run():
    app = QtWidgets.QApplication(sys.argv)
    window = regularCalc_App.RegularCalcApp()
    window.show()
    app.exec_()


if __name__ == "__main__":
    run()
