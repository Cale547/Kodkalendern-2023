def is_even(num):
    return num % 2 == 0

def step_calculation(prev, current_len):
    new_steps = 0

    if prev == "F":
        if current_len == 1:
            new_steps = 1
        else:
            new_steps = (current_len + 1)
    else: #previous == "B"
        if is_even(current_len):
            new_steps = -2
        else:
            new_steps = -current_length
    return new_steps

instruktion = "FBBFBFFFFFFFBFFFBFFBBBFBBFFBBFBFFBBFFBBBBFBBFFFBBFFFBBFBFFFFFFBFBFFFBBFFFFFBFFBBFBBFFBBBBBBBFFFBFFFFBBFBBFFFFBFFFFBFFFBBBFFFFBBBFFBBFBFFBBFBBFFFFFFFBBBFFFBFFFFBBBBBBFFBFBFBBBBFBBFFFFBBFFFBBBFBFBBFFFBBFBFBBFFFFFFBFFBBFBBBFFBFFFBFBFFBFBFBBFBFFBFBBBBFFBBBFFBBFFBBBBBFBFBFBFBBBFFFFBFFBBBBBBFBFBBBBBFFBFBBBBBBBFFFFBBBBBFBBBBBFFBBBBBFBFFFBFFFBBBFBBBBBFFFBBBFFFBFFFBBFFFBBFBBBBFFBFBFFFFBBBFFFFBFBBFFFFBBFBFFFBFBFBBBFBFBFBFFBFBFFFFFFFBFBBFBBBFFFBBFFFBFFFFBBFBBBFFFFBBBFFFFFBBBFBBFBFFBFBFFFFFBBFBFFBFFBFBBFFBFFBBBBFFBBBBFFBFBFFFFBFFBBBFFFBBBBBBFFFFBFBBBBBFBFFFBFBBBFFBBFBBFFFBFBFFBBFFBFFBBFFBBFFFBFBBBFBFBFFBFFFFBFBFFBFBFBBFFBFBBBFBFFFFBFFBBBFBFBBFFBBBFBBFFBBFBFBBBFBBFFBFBFBBFFFFFFBBFFFFFFBFFBBBFFFFBFBFFFFBBFBBBFFBBBBFBFBFBBFBBBBBFFFBFFFFFBFFBBFFFFBFFFBFBBFFFBFFBFFFFBBBFBBBBFBBFFBFBBFFFBFBBBFBBFFFFFBBBFBFFFBFBBFFBBFFFFFBFFFFBBFFBFFFFFFBFFFBFFFBBBFBBBBFBFFBFFBFFFBBBBFBBBFBBFFBBFFFBFBBBBFFBFFFBBFBFBFFFFFBBFBFFBFBBFFBFFBBFBBFFBFFBBBBBFBFFFBFFBFFBBBBBFBBBBFBBFBFFBBBBFFFFBFFBBBFBFBFFFFBFBBBBBFFFFFBBFFBFBFBB"
# 1 F = 1 steg fram
# 1 B = 1 steg bak
# 2+ F = n+1 steg fram (alltså så många F som står i rad + 1)
# (2n) B = 2 steg bak (jämn längd på sekvensen av B ger alltid 2 steg bakåt)
# (2n+1) B = (2n+1) steg bak (udda längd på sekvensen av B ger så många steg som står)

previous = "F"
current_length = 1
total_steps = 0

for letter in instruktion[1:]:
    if letter == previous:
        current_length += 1

    if letter != previous:
        total_steps += step_calculation(previous, current_length)
        current_length = 1
        previous = letter

#Final check
total_steps += step_calculation(previous, current_length)

print("Tidsklockan finns",total_steps,"steg från tomtens altan.")
