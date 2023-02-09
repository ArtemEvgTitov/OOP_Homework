import Seminar_07.Model.Rational_model.SumRational as Sum
import Seminar_07.Model.Rational_model.SubRational as Sub
import Seminar_07.Model.Rational_model.MultRational as Mult
import Seminar_07.Model.Rational_model.DivRational as Div


class CalcRational():
    '''Модель всего калькулятора для рациональных чисел'''

    def start_calc(self, operation, a, b):
        '''Выбор модели исходя из операции, которую ввёл пользователь'''
        if operation == '*':
            res = Mult.MultRational()
            result = res.result(a, b)
        elif operation == '/':
            res = Div.DivRational()
            result = res.result(a, b)
        elif operation == '+':
            res = Sum.SumRational()
            result = res.result(a, b)
        elif operation == '-':
            res = Sub.SubRational()
            result = res.result(a, b)
        print(result)
