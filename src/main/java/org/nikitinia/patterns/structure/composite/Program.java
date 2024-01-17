package org.nikitinia.patterns.structure.composite;

public class Program {

    public static void main(String[] args) {
        TeamDeveloper teamDeveloper = new TeamDeveloper();


        Developer developerJava = new JavaDeveloper();
        Developer developerPython = new PythonDeveloper();

        teamDeveloper.addDeveloper(developerJava);
        teamDeveloper.addDeveloper(developerPython);

        developerJava.writeCode();
        developerPython.writeCode();
        teamDeveloper.writeCode();

    }

}
