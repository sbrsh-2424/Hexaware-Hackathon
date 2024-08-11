name = "keerthiihtreek"
length = len(name)
max_width = 2 * length - 1

print('\n'.join(
    (name[:i+1] + name[:i+1][::-1][1:]).center(max_width)
    for i in range(length)
))
