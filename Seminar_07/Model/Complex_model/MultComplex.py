import Seminar_07.Model.Rational_model.MultRational as Mult
import Seminar_07.Model.Complex_model.ComplexNumber as ComplexNumber


class MultComplex():
    '''Умножение'''

    def result(self, x1, x2, y1, y2):
        new_real = Mult.MultRational.result(
            self, x1, x2) - Mult.MultRational.result(self, y1, y2)
        new_image = Mult.MultRational.result(
            self, y1, x2) + Mult.MultRational.result(self, x1, y2)
        result = ComplexNumber.Complex(new_real, new_image)
        return result
