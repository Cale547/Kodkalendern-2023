dikt = ['i en by vid nordpolens rand', 'där nissarna bor i ett vinterland', 'snön gnistrar vit på varje tak', 'och julens magi finns i varje sak', 'tomtefar i sin röda dräkt', 'med ett skägg så vitt som nysnön täckt', 'han styr sin verkstad med varm hand', 'och leksaker skapas med julens band', 'i månens ljus nissarna lekfullt dansar', 'bland julpynt och vackra kransar', 'de sjunger och skrattar sprider glädje och ljus', 'i tomtebyn bland sagolika hus', 'renarnas slädar står redo för färd', 'för att sprida julmagi över hela vår värld', 'för i tomtebyn på nordpolens mark', 'startar tomten färden med en lätt spark', 'i tomteverkstaden där maskiner står på rad', 'finns en hjälte som gjort alla extra glad', 'klappmaker3000 med kugghjul och band', 'har skapat julklappar nästan för hand', 'med ett blinkande ljus och surrande ljud', 'har den skapat magi under nattens stjärnklara bud', 'årets julklapp jinglepods uppfunnen av nissen alberta', 'för musikens magi till varje hjärta', 'med ljud av högsta kvalitet ren och klar', 'hörs jinglepods musik från nära och fjärran så rar', 'nissarna bär dem dansar och ler', 'för i jinglepods klang finner de julens ande mer', 'och där mitt på tomtebyns jublande torg', 'hörs tindra swifts stämma en röst utan sorg', 'hennes senaste låt flyter genom luften så lätt', 'och nissarna dansar allt känns rätt', 'tacksamhet fyller varje vrå', 'för klappmaker3000 som gjorde julen så skön att förstå', 'i tomtebyn under vinterns kalla natt', 'önskar kodkalendern god jul så glatt']

första_meningen = 'ienbyvidnordpolensrand'
unika_ord = []

for rad in dikt:
    ordlista = rad.split()
    for ord in ordlista:
        if ord in unika_ord: # this if statement skips the word if we have already counted it
            continue
        tillåtet = True
        for tecken in ord:
            if tecken not in första_meningen: # if the word uses a character not present in the first line, it is not allowede
                tillåtet = False
                break
        if tillåtet:
            unika_ord.append(ord) # if all characters were OK to use, we add the word to the list of unique allowed words
print("Alla unika ord:",unika_ord)
print("Antal unika ord:",len(unika_ord))

