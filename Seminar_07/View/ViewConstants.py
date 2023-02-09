import Seminar_07.Checker.CheckFloat as CheckFloat
import Seminar_07.Checker.CheckRegime as CheckRegime
import Seminar_07.Logger.Logger

class ViewConstants():
    '''Выбор режима работы и приём чисел от пользователя'''

    def constants(self):
        '''Выбор режима работы и приём чисел от пользователя'''
        check_number = CheckFloat.CheckFloat()
        check_vers = CheckRegime.CheckRegime()
        log = Seminar_07.Logger.Logger.Logger()
        ver = check_vers.check_regime(
            '\nВведите режим работы программы:\n0 - Закрыть программу;\n1 - Рациональные числа;\nВвод ')
        if ver == 1:
            a = check_number.check_float_number('\nВведите первое число ')
            b = check_number.check_float_number('Введите второе число ')
        elif ver == 0:
            a, b = 0, 0
        log.log_text(f'\nВыбран "{ver}" режим работы. \nВ качестве первого числа введено {a}, \nв качестве второго {b}')
        return a, b, ver