import Seminar_07.View.View
import Seminar_07.Model.Rational_model.CalcRational as Calculator

class Presenter():
    '''Содержит кнопку запуска программы'''

    def button_click(self):
        '''Запуск программы либо выход из неё'''
        view = Seminar_07.View.View.View()
        a, b, ver = view.const()
        if a == 0 and b == 0:
            print('Выход из программы')
            view.close()
            exit()
        operation = view.oper()
        calc = Calculator.CalcRational()
        calc.start_calc(operation, a, b)


