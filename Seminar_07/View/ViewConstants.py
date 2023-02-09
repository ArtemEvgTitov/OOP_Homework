import Seminar_07.Checker.CheckFloat as CheckFloat

import Seminar_07.Logger.Logger


class ViewConstants():
    '''Выбор режима работы и приём чисел от пользователя'''

    def constants(self, ver):
        '''Выбор режима работы и приём чисел от пользователя'''
        check_number = CheckFloat.CheckFloat()
        log = Seminar_07.Logger.Logger.Logger()
        if ver == 1:
            a = check_number.check_float_number('\nВведите первое число ')
            b = check_number.check_float_number('Введите второе число ')
            log.log_text(
                f'\nВыбран "{ver}" режим работы. \nВ качестве первого числа введено {a}, \nв качестве второго {b}')
            return a, b
        elif ver == 2:
            x1 = check_number.check_float_number(
                '\nВведите основную часть первого числа ')
            x2 = check_number.check_float_number(
                'Введите мнимую часть первого числа ')
            y1 = check_number.check_float_number(
                '\nВведите основную часть второго числа ')
            y2 = check_number.check_float_number(
                'Введите мнимую часть второго числа ')
            log.log_text(
                f'\nВыбран "{ver}" режим работы. '
                f'\nВ качестве первого числа введено {x1} + {x2}i, '
                f'\nв качестве второго {y1} + {y2}i')
            return x1, x2, y1, y2
        elif ver == 0:
            a, b = 0, 0
            log.log_text('Выход из программы')
            return a, b
