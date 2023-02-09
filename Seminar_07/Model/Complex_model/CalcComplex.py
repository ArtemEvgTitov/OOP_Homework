import Seminar_07.Model.Complex_model.SumComplex as Sum
import Seminar_07.Model.Complex_model.SubComplex as Sub
import Seminar_07.Model.Complex_model.MultComplex as Mult
import Seminar_07.Model.Complex_model.DivComplex as Div


class CalcComplex():
    '''Модель всего калькулятора для комплексных чисел'''

    def start_calc(self, operation, x1, x2, y1, y2):
        '''Выбор модели исходя из операции, которую ввёл пользователь'''
        if operation == '*':
            res = Mult.MultComplex()
            result = res.result(x1, x2, y1, y2)
        elif operation == '/':
            res = Div.DivComplex()
            result = res.result(x1, x2, y1, y2)
        elif operation == '+':
            res = Sum.SumComplex()
            result = res.result(x1, x2, y1, y2)
        elif operation == '-':
            res = Sub.SubComplex()
            result = res.result(x1, x2, y1, y2)
        result.print_complex_number()