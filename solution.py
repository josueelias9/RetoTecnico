def alternate(strings):
    max_length = max(len(s) for s in strings)  # Longitud máxima de las cadenas
    result = ""

    for i in range(max_length):
        for s in strings:
            if i < len(s):
                result += s[i]
            else:
                result += " "  # Espacio si la cadena es más corta

    return result

# Ejemplos de uso
print(alternate(["abc", "123", "xyz"]))  # Salida: "a1xb2yc3z"
print(alternate(["abc", "1"]))  # Salida: "a1b c "
print(alternate(["abcd", "12", "x"]))  # Salida: "a1xb2 c d "
print(alternate(["ab", "1234"]))  # Salida: "a1b2 3 4"
