a=int(input())
def f(a):
     if a<=2:
             return a-1
     return f(a-1)+f(a-2)
print(f(a))
#this program finds nth fibonacci sequence number using recursion
