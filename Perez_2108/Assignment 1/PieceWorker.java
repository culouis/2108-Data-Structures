// Lab Exercise 1: PieceWorker.java
// PieceWorker class extends Employee.

public class PieceWorker extends Employee 
{
   /* declare instance variable wage */
   /* declare instance variable pieces */
   private double wage; 
   private int piecesProduced;

   // five-argument constructor
   public PieceWorker( String first, String last, String ssn, 
      double wagePerPiece, int pieces )
   {
     super( first, last, ssn );
        setWage( wagePerPiece ); // validate and store hourly wage
        setPiecesProduced( pieces ); // validate and store hours worked
   } // end five-argument HourlyEmployee constructor

   // set wage
   /* write a set method that validates and sets the PieceWorker's wage */
    public void setWage( double wagePerPiece )
     {
      if (wagePerPiece < 0.0) 
      {
         wage = 0.0;
      }
      else
      {
         wage = wagePerPiece;
      }
              
     } // end method setWage
   // return wage
   
   /* write a get method that returns the PieceWorker's wage */
   public double getWage()
   {
      return wage;
   }
   // set pieces produced
   
   /* write a set method that validates and sets the number of pieces produced */
   public void setPiecesProduced( int pieces) 
     {
      if (pieces < 0) 
      {
         piecesProduced = 0;
      }
      else
      {
         piecesProduced = pieces;
      }
              
     }
   // return pieces produced


   /* write a get method that returns the number of pieces produced */
   public int getPiecesProduced()
   {
      return piecesProduced;
   }
  
  
   // calculate earnings; override abstract method earnings in Employee
   public double earnings()
   {
      double earned = piecesProduced * wage;
      /* write code to return the earnings for a PieceWorker */
      return earned;
   } // end method earnings

   // return String representation of PieceWorker object
   public String toString()
   {
      /* write code to return a string representation of a PieceWorker */
      return super.toString()+ "\n wage per piece: $" +getWage()+ 
         "     pieces produced: " + getPiecesProduced(); 
      
   } // end method toString
} // end class PieceWorker

