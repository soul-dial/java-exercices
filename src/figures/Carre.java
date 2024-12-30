package figures;

import java.util.Objects;

public class Carre implements Figure{

    private double lCote;

    public Carre (double cote) {

        this.lCote = cote;
    }


    public double getlCote(){

        return  this.lCote;
    }


    public boolean equals(Object obj){

    if(this == obj){ return true ;}

    if (obj == null || !( obj instanceof Carre)){

        return false;
    }

    Carre c = (Carre) obj ;


    if (this.getlCote() == c.getlCote()){

        return true;
    }
    else {

        return false;
    }

    }

    @Override
    public int hashCode() {

        return Objects.hash(this.lCote);
    }

    @Override
    public double perimetre() {

        double p = this.getlCote() * 4;

        return p;
    }

    @Override
    public double aire() {

        double a = this.getlCote() * this.getlCote();

        return a;
    }
}
