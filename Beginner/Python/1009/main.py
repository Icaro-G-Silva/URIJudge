# -*- coding: utf-8 -*-
name = str(input())
fixSalary = float(input())
sales = float(input())

extra = sales * 0.15

print("TOTAL = R$ {:.2f}".format(fixSalary + extra))
