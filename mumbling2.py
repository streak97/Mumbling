def main(args):
    print(accum(args))


def accum(input):
    if not input.isalpha():
        print("Invalid string. Can only contain letters")
        return

    input = input.lower()
    arr = list(input)

    for i, x in enumerate(arr):
        arr[i] *= (i+1)
        arr[i] = arr[i].capitalize()

    return "-".join(arr)
