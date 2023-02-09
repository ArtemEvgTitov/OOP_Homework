class Complex():
    '''Конструктор комплексного числа'''

    def __init__(self, real, image):
        self.real = real
        self.image = image

    def print_complex_number(self):
        '''Метод печати комплексного числа'''
        if self.image > 0:
            print(f'{self.real} + {self.image}i')
        elif self.image < 0:
            print(f'{self.real}{self.image}i')
        else:
            print(self.real)
