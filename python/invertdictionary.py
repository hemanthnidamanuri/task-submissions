#invert keys and values in a given dictionary
dct = {"ftuit":"orange","number":1, "lock":"key"}
dct = {v:k for k,v in dct.items()}
print(dct)