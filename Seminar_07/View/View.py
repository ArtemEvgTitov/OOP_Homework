import Seminar_07.View.ViewClose as Close
import Seminar_07.View.ViewOperation as Operation
import Seminar_07.View.ViewConstants as Constants

class View():

    def __init__(self):
        self.close = Close.ViewClose
        self.operation = Operation.ViewOperation
        self.constants = Constants.ViewConstants
