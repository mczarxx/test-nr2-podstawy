package pl.kurs.task1.app;

import pl.kurs.task1.exceptions.NullElementInArray;
import pl.kurs.task1.models.Figura;

public class Runner {
    public static void main(String[] args) throws NullElementInArray {


        Figura[] figury = {Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10, 20), Figura.stworzKwadrat(15)};

        Figura.sprawdzTablice(figury);

        Figura.getNajwiekszyObwod(figury);
        Figura.getNajwiekszePole(figury);


        for (Figura f : figury) {
            System.out.println(f);
        }
        System.out.println();


        for (Figura f : figury) {
            if (f.equals(Figura.stworzProstokat(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }


    }
}
