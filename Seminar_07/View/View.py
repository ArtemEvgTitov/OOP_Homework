import Seminar_07.View.ViewClose as Close
import Seminar_07.View.ViewOperation as Operation
import Seminar_07.View.ViewConstants as Constants
import Seminar_07.View.ViewRegime as Regime


class View():
    '''Включает в себе в классы взаимодействия с пользователем'''

    def __init__(self):
        self.close = Close.ViewClose
        self.operation = Operation.ViewOperation
        self.constants = Constants.ViewConstants
        self.regime = Regime.ViewRegime
