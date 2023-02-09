import Seminar_07.Checker.CheckRegime as CheckRegime


class ViewRegime():

    def regime(self):
        check_vers = CheckRegime.CheckRegime()
        ver = check_vers.check_regime(
            '\nВведите режим работы программы:'
            '\n0 - Закрыть программу;'
            '\n1 - Рациональные числа; '
            '\n2 - Комплексные числа;\nВвод ')
        return ver
