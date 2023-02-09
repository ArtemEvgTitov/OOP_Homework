import Seminar_07.View.View as View
import Seminar_07.Model.Rational_model.CalcRational as CalculatorRatio
import Seminar_07.Model.Complex_model.CalcComplex as CalculatorComplex


class Presenter():
    '''Содержит кнопку запуска программы'''

    def button_click(self):
        '''Запуск программы либо выход из неё'''

        view_regime = View.Regime.ViewRegime
        ver = view_regime.regime(self)
        view_close = View.Close.ViewClose

        if ver == 1:
            a, b = View.Constants.ViewConstants.constants(self, ver)
            operation = View.Operation.ViewOperation.oper(self)
            calc_ratio = CalculatorRatio.CalcRational()
            calc_ratio.start_calc(operation, a, b)
        elif ver == 2:
            x1, x2, y1, y2 = View.Constants.ViewConstants.constants(self, ver)
            operation = View.Operation.ViewOperation.oper(self)
            calc_compl = CalculatorComplex.CalcComplex()
            calc_compl.start_calc(operation, x1, x2, y1, y2)
        elif ver == 0:
            print('Выход из программы')
            view_close.close(self)
            exit()
