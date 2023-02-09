import Seminar_07.Logger.Logger

class CheckRegime():
    '''Проверка выбора режима работы'''

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