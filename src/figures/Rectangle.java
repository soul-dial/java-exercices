package figures;

import java.util.Objects;

public class Rectangle implements Figure {

   private double longueur;

   private double largeur ;

   public Rectangle(double longueur , double largeur){

       this.longueur = longueur;

       this.largeur = largeur ;



   }


   public double getLongueur(){

       return this.longueur;
   }

   public double getLargeur(){

       return this.largeur;
   }


    @Override
    public boolean equals(Object obj) {

       if (this==obj){  return true ;}

       if(obj == null || !(obj instanceof Rectangle)){

           return false;
       }

       Rectangle r = (Rectangle) obj ;


       if (this.getLongueur() == r.getLongueur() && this.getLargeur() == r.getLargeur()){

           return  true;

       } else {

           return false;

       }

    }

    public int hashCode(){

       return Objects.hash(this.longueur, this.largeur);


    }





    @Override
    public double perimetre() {

       double p = ( this.getLargeur()+ this.getLongueur() )*2;

       return p;


    }

    @Override
    public double aire() {

       double a = this.getLongueur() * this.getLargeur();

        return a;
    }



}
