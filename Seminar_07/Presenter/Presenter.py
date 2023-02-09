import Seminar_07.View.View
import Seminar_07.Model.Rational_model.CalcRational as Calculator

class Presenter():

    def button_click(self):
        view = Seminar_07.View.View.View()
        a, b, ver = view.const()
        operation = view.oper()
        calc = Calculator.CalcRational()
        calc.start_calc(operation, a, b)


