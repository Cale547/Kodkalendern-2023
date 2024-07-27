import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class main {

    public static void lucka1() {
        int nr = 0;
        
        for (int i = 127; i <= 267; i++) {
            nr += i;
        }

        for (int i = 1110; i <= 1378; i++) {
            nr += i;
        }

        for (int i = 3239293; i <= 3239330; i++) {
            nr += i;
        }

        System.out.println("Tomtens telefonnummer är: " + nr + ".");
    }

    public static void lucka2() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L2grötmängd.txt")) {
        }));

        int goodbarrel = 0;
        int total = 0;
        while (read.ready()) {
            total++;
            int grams = Integer.parseInt(read.readLine())*28;
            if (grams > 2000 && grams < 3000) goodbarrel++;
        }
        read.close();
        System.out.println("Av " + total + " tunnor är " + goodbarrel + " tunnor godkända!");
    }

    public static void lucka3() throws FileNotFoundException, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L3rentaggar.txt")) {
        }));
        double sum = 0;
        double numberOfDeer = 0;
        while (read.ready()) {
            numberOfDeer++;
            sum += Integer.parseInt(read.readLine());
        }

        double avg = sum / numberOfDeer;

        read.close();
        read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L3rentaggar.txt")) {
        }));

        int goodDeer = 0;
        while (read.ready()) {
            if (Double.parseDouble(read.readLine()) == avg) goodDeer++;
        }
        read.close();
        System.out.println("Av " + (int)numberOfDeer + " renar har " + goodDeer + " stycken samma antal taggar som genomsnittet.");
    }

    public static void lucka4() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L4rastplats.txt")) {
        }));
        int goal = 106023;
        int ans = -1;
        int diff = Integer.MAX_VALUE;
        while (read.ready()) {
            int distance = Integer.parseInt(read.readLine());
            if (Math.abs(goal - distance) < diff) {
                diff = Math.abs(goal - distance);
                ans = distance;
            }
        }
        read.close();
        System.out.println("Den rastplats som ligger närmast 106023 km från Nordpolen har avståndet " + ans + " vilket är " + diff + " ifrån målet.");
    }

    public static void lucka5() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L5plånböcker.txt")) {
        }));
        
        int rikanissar = 0;
        int antalnissar = 0;
        while (read.ready()) {
            antalnissar++;
            String[] plånbokTXT = read.readLine().split(", ");
            int[] plånbok = new int[4];
            for (int i = 0; i < 4; i++) {
                plånbok[i] = Integer.parseInt(plånbokTXT[i]);
            }
            int penningar = plånbok[0]*192 + plånbok[1]*24 + plånbok[2]*8 + plånbok[3];
            
            if (penningar >= 1000) {
                rikanissar++;
            }
        }
        read.close();
        System.out.println(rikanissar + " nissar har lite extra klirr i kassan och ska ge extra till granen.");
    }

    public static void lucka6() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L6önskelistor.txt")) {
        }));

        int antalPaket = 0;
        for (int i = 0; i < 1930; i++) {
            String[] namnOCHnummer = read.readLine().split(" ");
            antalPaket += Integer.parseInt(namnOCHnummer[1]);
        }
        read.close();

        System.out.println("Totala antalet paket i nissarnas undersökning blev " + antalPaket + " stycken.");
    }

    public static void lucka7() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L7utomårs.txt")) {
        }));

        HashMap<Integer, Integer> map = new HashMap<>();


        while (read.ready()) {
            String[] namnOCHår = read.readLine().split(", ");
            int year = Integer.parseInt(namnOCHår[1]);
            if (map.containsKey(year)) {
                map.replace(year, map.get(year)+1);
            }

            else {
                map.put(year, 1);
            }
        }
        read.close();
        
        Set<Integer> set = map.keySet();
        int maxYear = 0;
        int maxVal = 0;
        for (Integer year : set) {
            if (map.get(year) > maxVal) {
                maxYear = year;
                maxVal = map.get(year);
            }
        }

        System.out.println("Året med flest röster var " + maxYear + " med " + maxVal + " röster.");

    }

    public static void lucka8() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L8julkulor.txt")) {
        }));

        int previousKulor = 0;
        while (read.ready()) {
            String[] kullista = read.readLine().split(", ");
            int total = 0;
            for (String kulor : kullista) {
                total += Integer.parseInt(kulor);
            }
            if (total < previousKulor) {
                System.out.println("Här är en nisse som trängt sig i kön! Han har " + previousKulor + " kulor.");
            }
            previousKulor = total;
        }
    }

    public static void lucka9() {
        String papper = "------/**-/*--*€-----*-**-*--/*-€*-**-€--€-*-**---€-€**------*--*-*--/*--/**--*--**--*------------------*/*---*-/*-----*-----*€-----*-*-*--/*---/*-*-€--**--*------**-------***U--------*/*---/*--*€---*/*-----*/**--/*---------*U---*---*---*----*-*--*---€--*---€--*--*----€-/*--------*-*---------------*-------*--*--**--/*--**-*---*-*-€-----*-€-€------€---*-------*€€*------€--*---/*----*--€*€*------*-**-*----*----/*------*-€-/*--*------*-----€-€-/*---€-*-----€--/*-/*----------*€*------*-/*-*--**---------------*€-€--*------/*----*-----€€----/*-€*U/*----*U---*----*--------/*--*---------/*----*--*---€----€*----*-*U--------**----**---€-€-*---**U-€-€--*--***-----**-*-*--€-/*-*U-----/*-/**/*-€/**-----€*/*-**-*---*/*-----€---**-€-**-*--/*--**/*----*--*---*-----€---*-*-*--**---*-€-€-/**U------***----/*------*-€/*---*--*-*-*----***-----*U*------*--------**--*----/*/*---*-*/*-*/*---/**-----*-----*-*--*--/**-€*-/*--------/*-*-----*U----/*/*-**--/*--*-*-/*-€€*-----*-**-€**-----**------€---*-*-----€-/*------*---*--€-*-*-**-----/*--*-*€-/*--/*--/*-*--*€-€-/*---*------*--/*----**/*-€--€-*/*---*€-*---------/*--€-*-/*---*--*/*-/*---*€-----**-*€/*-€-*U**----€---*---*€--*---€-------€---€*--/*€/*--*--€-*/*------------*/*--€/*----*-*-**-/*-€*----*-/*--*------*-/*---*-*-€/*-*-/*-/*-€**-*€-*--*----/**------*€---/*---*€--*--*--*€-€---*---*€-€€----*/*-€-€----------/*-**--/**----*/*/**-€-*U-€--*---€-*--*-*€€*€---/*--/*€--**/*-*€€-/**-*---**-------*-------*---/*-----*-*/**-*€**/*----/*-/***-*/*---*-*/*---€-----/*-€--€--/*-----/**-*----*--***--*-----€/*----***-----/**€--*------**-€---*€---*-*---*---------€-/*--/*-*---*-**-*-€-----------/**--*---**---------€-*------*U/*----€/*---€------*--€*-----/*---------*----*---------*----*--€----*-*-*-------/*----------€---/*--*--€€**--€-/*/*-/***-----/*--*---*-/*-€-€€-/*€------*/*-*--/*€*-€---/*/*----*-€*------*-**--/*-------*-****-*-*--------------€--*-----***------€**--------€€---€-**----/*€-**------*-***/*-€****--€*-**-*-/**----€*U-**-------€----**---*-*----**-€--*--**/*-/*---/*------€/*-*---/*---*€€-----*U---*U---*--/*----€-*----/*---*--/*--***---*U--/*---*------€*-/**---*---/**-€-*--*--€*-----**---€--*-*€-/*-----------**---/*-€--/*---*-€-/**--*-€--*-*---€----/*--*----*-*--*-----/*--*--**-*--*------€*-----*-*--*----*/***-**-*U---€/*-------*-----*-**-*€-*--*-**-**-------€--*---***---€-/*---*U*-€--€/**-------€-----*---/*/*€/*---*---€*/*-**--*---*€*€-----/*/*----€*---**----€------*---*€**-*-**-/*-*--*€--**--€---**--*--*/*----*€---€-*/*---/*---€--*--/*-*--**----*---/*---/*--**--€-/*--*€---*-/*--**-/*-*U-*-/*-*---**--**-*€-€*------/*€*-*/*-**€---**------------€-€*/*------/*-/**---/*--*--€---**-*/*----/*-/*€----€-*U-----*--*-*€/*-*--€-----€---€--*U-/*---*-*-*----€-------*-€-**---**--/*-----€-/*--**-**-/*--€€----/*--*€*-------------*----*--*-/*-€*-*-------*/****--*--**--*€-------------*----*--/*-------------€--*--€-**-€**-------/**-------*€--**/*-*-----€*U*U--***/*---*----*------**----*----/*-**--/*---------€*--**U-€€*-----*-*-------*---*-*€-----------/*---/*/*-/**U-----*-*-*-*--€*-*-€-*---/*-*-**----*--**-/*/*--*--€-/*-*-----*-------*€-*/*---*--/*-----*-*/*--*-------/**€-/**-----/*--/*-*-----/*€--**----*---*€*-----*-*-*---/*-*-***-------*€---/*-***--/*-*-*-------*-----*----*----*----/*--*-***--*-/*€--------***--*-*---*-/*-----*---*--*-----------€-€**--*-**---/*------*-----*-**-***---------*-**--*--*/*-€---*--/*----/*----€------*-----€*---*-------€-----*---/*-*-----*--/*--/*/*--€/*---*-€*--/**-------/*-**-----*------/*-*€-*-*/*-------*---*--*/*€----*---*-*---€*-€--*-**-*---*-€--*--/*------*U----------*--*-€---*----*-/*------/*---*/*----*--***-----€*-----*-----€------*---*---/*--*-/*--------€€/*--**--€/*-/*-/**--€*/*--*----/*--*------*---/***-/**----*----/*-/*--*------*----*--*-€----/*--*€---*---/****-----***--*--*/***-----€-€-*-*-**€-/**-*--€-**U--**-----€---*-€*-----*-----*-€-*--*/*---€*-*-*--€€-----*--**---*U--€---------/*-*---**----€**/*--*-€*---**-/*-*-----€*--*€--*--*-*----/*-/*---*---*---**----*------*--------*--/**--/*-*----*--*--*/*-*-/**---*---/*-**-/*----*--€--*---/*----€-*U-*--€--*-------/*----/*--*€-*--*---*-----€------/*-*-*-*--------€-----/*--**----*€---€----*--€-*--------€€-*---*-€€----€-*€-*-*-/*---€-*----*-------*---**-***--*/*€--**---/**/*-€---*-*--/*-**----€-€----€-*/*--*-*--/*----**---------€/*----€------€-*----*U----**U--------€*-*-*€--/**€*-/**€----**-*-----/*-/*-*/*-*/****€---**-*€/**€--*-€**-*-*-*---€-*---*/*---€/*/*----*€---*--€---------------*€*/*----*-€---*--€---------*--------*--*-*----------*-€--*----*-**------€€**/*-/*/*--*-€*/*-*----€-*-------*---*-*--*-*€-**-*--*-----*---*---*-**--€-*-**€-*-/*-*--/*-€**--/*---/*---------€€---*----€-*€--/****----*-*-/*---/*--*/*---*---*-*---€-*-***€€/***---€*/*/*-*---€*---*------€----**/*---*---*---------*-*--€€----*----*U--**-*--/*/*--*--€--**-----*---------€-*--**--*-----------*--*-€-*--**/*€---/*----------**---/*------**--------€----*--/*/*/*€-*-*-*€-*-*-*------*----------*--*-/*---------€----------*-*--*--*-/*---------€------€-€****-*---€-/***---*/*--------*---------**--*-€*-*/*---/*--------/*----€€€-*-*-€--/*€-------*€-----*-*--*€-------*--**--/*--*--****/**-*--*-*--*-**--/*-*--**-*€-*-€--€*U-/*-----€---------/**-*----*------/**--*-*---/*-*----*-/*-*--*-/**---*----*----*---*/*-€*-€**U--**/*-€--€--*---*-€---€--*-€-------*--*-----*/*/**---------**--€*--------*-*--€---*€-**--*----*-*/*--*-*-****-*-/*---/*----€--€-*--/*---------------*-*-€---*-*---/*-***-----*---*-*---*--*-€------*---€**-/*--€-/*-*-*-------€----/*----*------------*/**-*/*€-*--€------€-/*-*-----*-*----€€---*-*/*-*-----*---*€--/**------/*--*€-**----/*----**-------*-*€€----/*/*---**-/*€-----**-*---*U*--*/*/*-----*-/*--€*--€-/*€*--€***/*€---*-€---*-/*-/*-**--**------**---*€**-----**U--/*€------€--****----€-----€--€€---*-/*/*-------*--------€€-----*/**-*-------/*--/*-**--/*-----€--**€-*---**---€/*---*€----€--/*-----/*---------*---**-€---*-/*--------*U----*-*€-*-*--**--/*--€-----/*--*-*-----€---*----/*-**--€--*---/**-*€--**-€-----*----*-----*--------**-/*€***--*-*----€€---€--------/*---------/*--*/*----*------/**---€*U€€-*€-/**-*-€-*----*-----*---*€€--**--*/*----*--*/*-***--------€-**-*---€-**------*---*--*-/*---------/*--****--/*/*---€-------***---*€€-/*-*-*---*---*--------€--/*----*/*-----/**/*€-*-€-***-*------*€*----€-*------*€--------/*-*-*--/*---/*--/*€---*/**-/**€-----€**€*-*-€*--*-*----*-*--*/*------*---------/*/****--/***---*-/****€-/*--*------*-*-€--€------*---*-*--/**-------/*--€--/**-/*----*-/*-*------*€*-€*-----*-*--*-€*€/**-*----/*-------*----**-----*/*--/**-*--*--*€------*/*-*-/***------------€---*/*€*-**-------/*----/*---€-----/**/*--€-*-*--*----€*---€-/*/*/*€-*--*---**---*-€*-**--*/*/*-----*--------€*---/*€----*-*U--/*-*--*---*-€***-/*€--*-----*----*€----*-*-*-*€*-*-€-*--/*/*-----**-----**------***--*-*-€-**---*/*€*---/*-*-------€*-/*---*-/*-€*----€--/*-*-**-----€---*---€/*--*-€--*-/*--/*-*-*U-*/*--/*----------*--€*€--*---€-/*-------€--*-------*/*---*-****-----*-/*--**-**-*€--------*-/*-----*---/*-€*-*---*----*----*/*-€/***-*-***--*€*----*--*--/*------*-**--*-*---*-*€**----*-€*--/*/*--*€-€€----*--/*---**---€**-*/*--*---/*--€-€----*-/**-€---/*---*-€*---*----/*--€----€----*-*/**--/*---**---*€-----€*-*-***--€--/*-*--€----*-*/*---*--**-/**----*------*-------/*--/*----/*---------€----/*€**--------€----*---*-€------*---**U-**-----/**€----------/*-------*-/***-€-*-*--*---*------*-----€-/*--*-€----/*€€--*--€--€*€-----*------*--€-----**-/*€--*--*U-**---€----**-€/*---/*--**--€/*------------€--/*--€€-*--*--/*----*--*-*------€--/*---------/*-/*-*--*€€**/*----*€/**-*-****-/*---*------*----------------*/*-*-*---*--------*---*--/*€€---*-€**€-*-*---------/*--/*----/*-----/*--------*--*-*---**--€€-*-*------/*-----€-€--€-€--€€€--/*--*-/**-**-*----/**€*€----*-/*--*/*-/****----*-/***-----/*-**--***--*-*--------*----*-/*-**-/*--**€€*---*--**---*---/*€------***--/*-----€--€/*---*-**--€--/*-€----*--------*€-/*--*-€---*U--------**-*-**/*-*-/**-*-*-€-------€--*------*-*-/*----€-*€/*---*----*-------*-*-€*----*----**-------€--*€€--/*-/**-/*€-/*--*---/**-€€------*-*-€-*--/*-/*--**€€€---*--*/*/*-*-/*-----*-**--/*-€-----*U----*-*---**---€-----*/*-€---/**-*--*---/**-/***----*---/*-€-----€/***----/*--------€-/*--€-/*€*-*----***--*-----/*---*---**----/*/*€€**-**U*----*-*--€--***--------*-/*/***-*-**---------€*------*--*-***/*-*/*------€----€------€*--*/**----*--/*-*-***/*---*-*--*/*-€----€------***--------€-*----*----€*----/*-*--*-€-/*---*-/**/***--/**-*---****-**-----€----€*--/*-------*-------/*-*--*-**--*-*--*----€€****/*--€/**-*----€/*----*U----/*/**---****---*-/*--/*-------€-**--------*--***-----/***-€-*---";
        char[] papperArr = papper.toCharArray();
       
        int antalStjärnor = 0;
        
        for (int i = 0; i < papperArr.length; i++) {
            char current = papperArr[i];
            if (current == '-' || current == '€') continue;
            if (current == '/') {
                i++;
                continue;
            }

            if (current == '*' && papperArr[i+1] != 'U') {
                antalStjärnor++;
            }
        }

        System.out.println("Emilias maskin hade hittat " + antalStjärnor + " stjärnor!");
    }

    public static void lucka10() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L10snörecept.txt")) {
        }));
        int korrektaaddresser = 0;

        String letters = "qwertyuiopåasdfghjklöäzxcvbnm";
        
        while (read.ready()) {
            String next = read.readLine();
            next = next.substring(0, next.length()-1);

            char[] nextC = next.toCharArray();
            int addressLen = 0;
            for (int i = 0; i < nextC.length; i++) {
                if (letters.indexOf(nextC[i]) != -1) addressLen++;
            }
            if (addressLen == 8) {
                korrektaaddresser++;
                System.out.println(next);
            }
        }
        read.close();
        //System.out.println(korrektaaddresser);


    }
    
    public static void lucka11() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L11krypterat.txt")) {
        }));

        int önskningar = 0;
        int cyklar = 0;
        String[] keyboardArr = {"q","w","e","r","t","y","u","i","o","p","å,","a","s","d","f","g","h","j","k","l","ö","ä","z","x","c","v","b","n","m"};
        String keyboardStr = "qwertyuiopåasdfghjklöäzxcvbnm";
        while (read.ready()) {
            önskningar++;
            String[] str = read.readLine().split(", ");

            int key = Integer.parseInt(str[2]);
            String decrypted = "";
            char[] encrypted = str[1].toCharArray();
            for (int i = 0; i < encrypted.length; i++) {
                int index = keyboardStr.indexOf(encrypted[i]) - key;
                if (index < 0) index += 29;
                decrypted += keyboardArr[index];
            }
            //System.out.println(decrypted);

            
            if (decrypted.equals("cykel")) cyklar++;
            
        }
        read.close();
        System.out.println("Av " + önskningar + " önskningar var " + cyklar + " stycken cyklar.");
    }
    
    
    public static void main (String[] args) throws Exception {
            lucka11();
        
        
    }

}