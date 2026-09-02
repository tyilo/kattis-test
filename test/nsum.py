n = int(input()) # Not needed since all numbers are on the same line
answer = 0
line = input()
for number in line.split():
	answer += int(number)
print(answer)