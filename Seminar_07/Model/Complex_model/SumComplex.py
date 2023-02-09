import Seminar_07.Model.Rational_model.SumRational as Sum
import Seminar_07.Model.Complex_model.ComplexNumber as ComplexNumber

class SumComplex():

    def result(self, x1, x2, y1, y2):
        new_real = Sum.SumRational.result(self, x1, x2)
        new_image = Sum.SumRational.result(self, y1, y2)
        result = ComplexNumber.Complex(new_real, new_image)
        return result