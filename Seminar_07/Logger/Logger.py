from datetime import datetime as dt

class Logger():

    def log_to_file(self, arg1, arg2, operation, result):
        path = 'logging.csv'
        time_sign = dt.now().strftime('%D %H:%M')
        f = open(path, 'a')
        f.write(f'{time_sign}--> {arg1} {operation} {arg2} = {result}\n')
        f.close()

    def log_exit(self):
        path = 'logging.csv'
        time_sign = dt.now().strftime('%D %H:%M')
        f = open(path, 'a', encoding="utf-8")
        f.write(f'{time_sign}--> Отмена операции\n')
        f.close()

    def log_error(self, text):
        path = 'logging.csv'
        time_sign = dt.now().strftime('%D %H:%M')
        f = open(path, 'a', encoding="utf-8")
        f.write(f'{time_sign}--> {text}\n')
        f.close()