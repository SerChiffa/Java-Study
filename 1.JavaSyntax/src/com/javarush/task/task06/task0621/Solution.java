package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catMother, catFather);

        String DaughterName = reader.readLine();
        Cat catDaughter = new Cat(DaughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat parentMother, Cat parentFather) {

            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            if (parentMother == null && parentFather == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (parentMother == null)
                return "The cat's name is " + name + ", no mother, father is " + parentFather.name;
            else if (parentFather == null) {
                return "The cat's name is " + name + ", mother is " + parentMother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
            }
        }
    }

}
