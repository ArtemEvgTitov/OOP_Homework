import Seminar_07.Model.Rational_model.SubRational as Sub
import Seminar_07.Model.Complex_model.ComplexNumber as ComplexNumber

class SubComplex():

    def result(self, x1, x2, y1, y2):
        new_real = Sub.SubRational.result(self, x1, x2)
        new_image = Sub.SubRational.result(self, y1, y2)
        result = ComplexNumber.Complex(new_real, new_image)
        return result