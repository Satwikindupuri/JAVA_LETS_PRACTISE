n=5
for i in range(n):
    for j in range(n-i):
        print("*", end=" ")
    print()
# Output:
# * * * * *
# * * * *
# * * *
# * *
# *
# The above code prints an inverted right-angled triangle pattern of stars.