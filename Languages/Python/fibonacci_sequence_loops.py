def f1(a):
     f=[]
     f.append(0)
     f.append(1)
     for i in range(2,a):
             f.append(f[i-1]+f[i-2])
     return f[a-1]
a=input()
print(f1(a))
#this program prints nth fibonacci number using loops
