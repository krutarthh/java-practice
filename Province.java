public class Province {

   String name;
   int population;
   double area;

   /**
    * Create a constructor method that has 3 parameters,
    * one to initialize the name, one to initialize the
    * population and one to initialize the area
    */
   // -----------Start below here. To do: approximate lines of code = 4
   //
   public Province(String name, int population, double area) {
      this.name = name;
      this.population = population;
      this.area = area;

   }

   // -----------------End here. Please do not remove this comment. Reminder: no
   // changes outside the todo regions.

   /**
    * Create a public method called getProvinceStats() that returns a String
    * containing the name of the province followed by " Population: " followed by
    * the population followed by " Area: " followed by the area
    */
   // -----------Start below here. To do: approximate lines of code = 2
   //
   public String getProvinceStats() {
      String str = name + " Population: " + population + " Area: " + area;
      return (str);

   }

   // -----------------End here. Please do not remove this comment. Reminder: no
   // changes outside the todo regions.

   /**
    * Create a public method getPopulationDensity() that returns a double
    * number representing the population density.
    */
   // -----------Start below here. To do: approximate lines of code = 2
   //
   public double getPopulationDensity() {
      double density = population / area;
      return density;
   }

   // -----------------End here. Please do not remove this comment. Reminder: no
   // changes outside the todo regions.

   // Create a public method int compareDensity(Province other) that returns
   // +1 if the this province density is > than the other province density
   // -1 if the this province density is < than the other province density
   // 0 if the densities are the same
   // -----------Start below here. To do: approximate lines of code = 4
   //
   public int compareDensity(Province other) {
      double Otherdensity = other.getPopulationDensity();
      if (Otherdensity == this.getPopulationDensity()) {
         return 0;
      } else if (Otherdensity < this.getPopulationDensity()) {
         return +1;
      } else {
         return -1;
      }

   }

   // -----------------End here. Please do not remove this comment. Reminder: no
   // changes outside the todo regions.
}
