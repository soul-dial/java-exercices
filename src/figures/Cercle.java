package figures;

import java.util.Objects;

public class Cercle implements Figure  {

    private double rayon;

    public Cercle (float rayon){

        this.rayon = rayon;

    }

    public Cercle (double diametre){

        this.rayon = diametre / 2 ;

    }

   public double getRayon (){

        return this.rayon;
    }

    public boolean equals(Object obj){

        if (this == obj){  return  true ;}

        if (obj == null || !( obj instanceof Cercle)){

            return  false;
        }

        Cercle c = (Cercle) obj ;

        if (this.getRayon() == c.getRayon()){

            return true;

        }else{

           return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.rayon);
    }

    @Override
    public double perimetre() {


      double p = Pi * 2 * this.getRayon();

      return p;

    }

    @Override
    public double aire() {

        double a = Pi * this.getRayon() * this.getRayon();

        return a;
    }
}
