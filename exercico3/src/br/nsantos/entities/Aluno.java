package br.nsantos.entities;

public class Aluno {

    public String name;
    public double notaUm;
    public double notaDois;
    public double notaTres;

    public double finalGrade(){
        return notaUm + notaDois + notaTres;
    }

    public String validateStudent(){
        double noteStudent = finalGrade();
        if((noteStudent /100) > 0.6){
            return "PASS";
        }
        double variableAux = 60 - noteStudent;
        return "FAILED\n" + "MISSING " + variableAux + " POINTS" ;
    }

}
