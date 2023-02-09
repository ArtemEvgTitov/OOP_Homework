import Seminar_07.Logger.Logger

class ViewClose():
    '''Вывод информации о закрытии программы'''

    def close(self):
        '''Вывод информации о закрытии программы'''
        log = Seminar_07.Logger.Logger.Logger()
        log.log_text("Программа закрыта")