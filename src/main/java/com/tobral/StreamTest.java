package com.tobral;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class StreamTest {

    public static void main(String[] args) {
        testSort();
    }


    public static void testSort(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Virat", "Kohli"));
        personList.add(new Person("Arun", "Kumar"));
        personList.add(new Person("Rajesh", "Mohan"));
        personList.add(new Person("Rahul", "Dravid"));


        Collections.sort(personList, (p1,p2)-> p1.getSurname().compareTo(p2.getSurname()));

        personList.forEach(System.out::println);
    }

    private static class Person {
        private final String name;
        private final String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }


        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
