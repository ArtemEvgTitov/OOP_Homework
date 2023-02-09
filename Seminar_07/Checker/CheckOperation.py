import Seminar_07.Logger.Logger

class CheckOperation():
    '''Проверка выбора операции'''

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