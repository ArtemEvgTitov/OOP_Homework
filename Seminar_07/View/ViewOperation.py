import  Seminar_07.Checker.CheckOperation as CheckOperation
import Seminar_07.Logger.Logger

class ViewOperation():
    '''Выбор операции'''
    def oper(self):
        '''Выбор операции'''
        check_operation = CheckOperation.CheckOperation()
        log = Seminar_07.Logger.Logger.Logger()
        operation = check_operation.check_operation('\nВыберите операцию на числами из списка: "*", "/", "+", "-"\nВвод  ')
        log.log_text(f'Выбрана операция "{operation}"')
        return operation