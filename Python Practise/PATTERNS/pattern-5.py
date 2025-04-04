# This program prints a right-sided triangle pattern of stars.
#* * * * *
#  * * * * 
#    * * *
#      * *
#        *
n=5
for i in range(n):
    for j in range(i+1):
        print(" ", end=" ")
    for j in range(n-i):
        print("*", end=" ")
    print()
