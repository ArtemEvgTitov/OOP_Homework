import Seminar_07.View.View as View
import Seminar_07.Model.Rational_model.CalcRational as Calculator

class Presenter():
    '''Содержит кнопку запуска программы'''

    def button_click(self):
        '''Запуск программы либо выход из неё'''

        view_close = View.Close.ViewClose
        a, b, ver = View.Constants.ViewConstants.constants(self)

        if a == 0 and b == 0:
            print('Выход из программы')
            view_close.close(self)
            exit()

        operation = View.Operation.ViewOperation.oper(self)
        calc = Calculator.CalcRational()
        calc.start_calc(operation, a, b)


