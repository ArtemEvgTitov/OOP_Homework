from abc import ABCMeta, abstractmethod
class CalcModel():
    __metaclass__=ABCMeta

    @abstractmethod
    def result(a, b):
        """Вывод результата"""