import Seminar_07.Logger.Logger

class CheckFloat():
    '''Проверка на Float'''

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