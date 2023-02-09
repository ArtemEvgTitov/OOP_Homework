import Seminar_07.Checker.Checker
import Seminar_07.Logger.Logger

class View(Seminar_07.Checker.Checker.Checker, Seminar_07.Logger.Logger.Logger):
    def const(self):
        check = Seminar_07.Checker.Checker.Checker()
        log = Seminar_07.Logger.Logger.Logger()
        ver = check.check_regime(
            '\nВведите режим работы программы:\n0 - Закрыть программу;\n1 - Рациональные числа;\nВвод ')
        if ver == 1:
            a = check.check_float_number('\nВведите первое число ')
            b = check.check_float_number('Введите второе число ')
        elif ver == 2:
            a = check.check_float_number('\nВведите первое число ')
            b = check.check_float_number('Введите второе число ')
        elif ver == 0:
            a = 0
            b = 0
        log.log_error(f'\nВыбран "{ver}" режим работы. \nВ качестве первого числа введено {a}, \nв качестве второго {b}')
        return a, b, ver

    def oper(self):
        check = Seminar_07.Checker.Checker.Checker()
        log = Seminar_07.Logger.Logger.Logger()
        operation = check.check_operation('\nВыберите операцию на числами из списка: "*", "/", "+", "-"\nВвод  ')
        log.log_error(f'Выбрана операция "{operation}"')
        return operation