import Seminar_07.Logger.Logger


class Checker(Seminar_07.Logger.Logger.Logger):
    '''Класс с проверками ввода'''

    def check_float_number(self, inputText):
        '''Проверка на Float'''
        log = Seminar_07.Logger.Logger.Logger()
        is_OK = False
        while not is_OK:
            try:
                number = float(input(f"{inputText}"))
                is_OK = True
            except ValueError:
                print("Некорректный ввод. Повторите попытку")
                log.log_text('Некорректный ввод float')
        return number

    def check_regime(self, inputText):
        '''Проверка выбора режима работы'''
        log = Seminar_07.Logger.Logger.Logger()
        is_OK = False
        while not is_OK:
            try:
                number = int(input(f"{inputText}"))
                if number in [0, 1]:
                    is_OK = True
                else:
                    print("Некорректный ввод. 0 - закрыть программу; 1 - float")
                    log.log_text(
                        'Некорректный ввод режима работы (некорректная цифра)')
            except ValueError:
                print("Некорректный ввод. Повторите попытку")
                log.log_error(
                    'Некорректный ввод режима работы (введена не цифра)')
        return number

    def check_operation(self, inputText):
        '''Проверка выбора операции'''
        log = Seminar_07.Logger.Logger.Logger()
        operation_list = ['+', '-', '*', '/']
        is_OK = False
        while not is_OK:
            operation = input(f'{inputText}')
            if operation in operation_list:
                is_OK = True
                return operation
            else:
                print('Выберите верную операцию')
                log.log_text('Некорректный ввод операции')
