julklappar = ['cykelcykelcykelcykel', 'bokbokbok', 'surfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplattasurfplatta', 'hörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurarhörlurar', 'fotbollfotbollfotbollfotbollfotbollfotboll', 'gitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarrgitarr', 'kamerakamerakamerakamerakamerakamerakamerakamerakamerakamerakamerakamerakamerakamerakamerakamerakamera', 'drönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönaredrönare', 'pysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselsetpysselset', 'brädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspelbrädspel', 'dataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspeldataspel', 'skridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskorskridskor', 'pulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulkapulka', 'ryggsäckryggsäckryggsäckryggsäckryggsäckryggsäckryggsäckryggsäckryggsäck', 'iphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphoneiphone', 'kikarekikarekikarekikarekikarekikarekikarekikarekikarekikarekikarekikarekikarekikarekikarekikarekikare', 'legolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolegolego', 'dockhus', 'pusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpusselpussel', 'skateboardskateboardskateboardskateboardskateboardskateboard', 'plånbokplånbokplånbokplånbokplånbokplånbokplånbok', 'väckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklockaväckarklocka', 'träningskläderträningskläderträningskläderträningskläder', 'snöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskorsnöskor', 'dagbokdagbokdagbokdagbokdagbokdagbokdagbokdagbokdagbokdagbok', 'musikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrumentmusikinstrument', 'tälttälttält', 'sovsäcksovsäcksovsäcksovsäck', 'hopprephopprephopprephopprephopprephopprephopprephopprephopprephopprephopprephopprephopprephopprep', 'badrockbadrockbadrockbadrockbadrockbadrockbadrockbadrockbadrock', 'handväskahandväskahandväskahandväskahandväskahandväskahandväskahandväskahandväskahandväska', 'högtalarehögtalarehögtalarehögtalare', 'rymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskoprymdteleskop', 'rollerbladesrollerbladesrollerbladesrollerbladesrollerbladesrollerbladesrollerblades', 'byggklossarbyggklossarbyggklossarbyggklossarbyggklossarbyggklossar', 'ficklampaficklampaficklampaficklampaficklampaficklampaficklampa', 'bollbollbollbollbollbollbollbollbollbollbollbollboll', 'hatt', 'tröjatröjatröjatröjatröjatröjatröjatröjatröjatröjatröjatröja']


# Dålig lösning som antar en massa grejer
total_klappar = 0
for klapp in julklappar:
    lagt_till = False
    pot_namn = "" #potentiellt namn
    förekomster = 0 #if new_förekomster = förekomster -1:
                    # total += förekomster
                    #break
    for tecken in klapp:
        pot_namn += tecken
        new_förekomster = klapp.count(pot_namn)
        #if new_förekomster == förekomster -1:
        if len(pot_namn) > 3:
            if new_förekomster < förekomster:
                total_klappar += förekomster
                print("Hittade klappen",pot_namn[:-1])
                lagt_till = True
                break
        förekomster = new_förekomster
    if not lagt_till:
        print("Ensamklapp",pot_namn)
        total_klappar += 1
    
print("Total mängd klappar:",total_klappar)

#"kikare"

# Bättre lösning:
total_klappar = 0
for klapp in julklappar:
    namn = ""
    tillagt = False
    for i in range(len(klapp)):
        tecken = klapp[i]
        namn += tecken
        if namn == klapp[i+1:(i+1)+len(namn)]: # om namn är rätt kommer nästa förekomst av namnet stämma överens
            print("Hittade klappen",namn)
            total_klappar += klapp.count(namn)
            tillagt = True
            break
    if not tillagt:
        total_klappar += 1
print("Total mängd klappar:",total_klappar)
# går att lägga till ensamklappar på samma sätt som icke ensamma men detta funkar också ok
