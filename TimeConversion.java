public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    public void showDecaseconds(int seconds){ 
    // add your code here
    double decaseconds = (double)seconds/10;
    System.out.println("Decaseconds are 10 seconds. There are " + decaseconds + " decaseconds in " + seconds + " seconds.");
    // just had to declare "decaseconds" and then print the description and conversion. I did this for the rest of the conversions as well.



    }
   


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    public void showJiffies(int seconds){
    // add your code here
    double jiffies = (double)seconds*100;
    System.out.println("Jiffies are 10 milliseconds. There are " + jiffies + " jiffies in " + seconds + " seconds.");


    }

    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    public void showNewYorkMinutes(int seconds){
    // add your code here
     double newyorkminutes = (double)seconds*20;
    System.out.println("New York Minutes are 1/20th of a second. There are " + newyorkminutes + " New York Minutes in " + seconds + " seconds.");

    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    public void showNanoCenturies(int seconds){
    // add your code here
      double nanocenturies = (double)seconds/3.156;
    System.out.println("Nanocenturies are 3.156 seconds. There are " + nanocenturies + " nanocenturies in " + seconds + " seconds.");


    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    public void showScaramuccis(int seconds){
    // add your code here
      double scaramuccis = (double)seconds/950400;
    System.out.println("A Scaramucci is eleven days. There are about " + scaramuccis + " New York Minutes in " + seconds + " seconds.");


    }


    
}//end class