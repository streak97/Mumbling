def accum(input):
    if not input.isalpha():
        print("Invalid string. Can only contain letters");
        return

    result = ""
    
    lInput = input.lower()

    for i, x in enumerate(lInput):
        add = "-{}"
        result += add.format(((i+1)*x).capitalize())

    print(result[1:])
        
