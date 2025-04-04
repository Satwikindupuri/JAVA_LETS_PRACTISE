n=5
for i in range(n):
    for j in range(i+1):
        print("*", end=" ")
    print()
# Output:
# *
# * * 
# * * *
# * * * *
# * * * * *
# The above code prints a right-angled triangle pattern of stars.