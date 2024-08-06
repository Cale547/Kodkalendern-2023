julklappsspel = [[2, 3, 8, 4, 7, 9, 6, 1, 5, 0], [8, 0, 3, 4, 2, 5, 7, 9, 6, 1], [5, 4, 6, 7, 3, 1, 0, 9, 8, 2], [4, 9, 0, 1, 2, 6, 3, 5, 8, 7], [5, 9, 2, 0, 7, 1, 8, 3, 4, 6], [4, 3, 8, 6, 0, 2, 9, 5, 1, 7], [3, 6, 4, 0, 5, 1, 9, 8, 2, 7], [5, 3, 8, 4, 1, 9, 2, 6, 0, 7], [6, 1, 2, 9, 8, 7, 4, 5, 0, 3], [8, 3, 6, 0, 2, 5, 9, 1, 4, 7]]
#julklappsspel = [[2,8,0,3,4,5,6,7,9,1]]
ägande_lista = [0,1,2,3,4,5,6,7,8,9]

for omgång in julklappsspel:
    print("Ny omgång!")
    for i in range(10):
        ska_ge = i
        ska_få = omgång[i]
        print("Nisse",ska_ge,"byter med nisse",ska_få)
        
        temp = ägande_lista[ska_ge]
        ägande_lista[ska_ge] = ägande_lista[ska_få]
        ägande_lista[ska_få] = temp
    print()
print("Hela listan:",ägande_lista)
print("Nisse 4 har present",ägande_lista[4])

a = 3
b = 2
a,b = b,a
print(a,b)

a=b
b=a