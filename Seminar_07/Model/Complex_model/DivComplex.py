import Seminar_07.Model.Rational_model.DivRational as Div
import Seminar_07.Model.Complex_model.ComplexNumber as ComplexNumber

class DivComplex():

    def result(self, x1, x2, y1, y2):
        new_real = Div.DivRational.result(self, (x1 * x2 + y1 * y2), (x2 * x2 + y2 * y2))
        new_image = Div.DivRational.result(self, (y1 * x2 - x1 * y2), (x2 * x2 + y2 * y2))
        result = ComplexNumber.Complex(new_real, new_image)
        return result