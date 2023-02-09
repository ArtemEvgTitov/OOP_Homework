import Seminar_07.Logger.Logger


class MultRational(Seminar_07.Logger.Logger.Logger):
    '''Умножение'''

    def result(self, a, b):
        result = a * b
        log = Seminar_07.Logger.Logger.Logger()
        log.log_to_file(a, b, '*', result)
        return result