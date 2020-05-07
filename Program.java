/**
   This program takes a string and create an instance of an assignment class
   This program also store assignments into an arraylist of assignments.
*/
import java.util.ArrayList;

public class Program {

   static private ArrayList<Assignment> assignments = new ArrayList<>() ;
   /*
      Before we store a new assignment, we check if in the arrayList contains 
      the same identifier we replace this assignment by the new assignment
   */
   public void newAssignment(String str){
      Assignment newAssign = new Assignment(str);
      boolean status = false;
      for(int i=0; i< assignments.size(); i++){
         if(assignments.get(i).getIdentifier().equals(newAssign.getIdentifier())){
            status = true;
            assignments.add(i, newAssign);
            break;
         }
            
      }
      if(!status){
         assignments.add(newAssign);
      }
   }
   //given an identifier, this function return the corresponding expression if it exist in the list
   public static int getExpression(String identifier){
      int x=0;
      if(assignments.size()> 0){
         for(int i=0; i< assignments.size(); i++){
            if(assignments.get(i).getIdentifier().equals(identifier)){
               x = assignments.get(i).getExpValue();
               
               break;
            }
         }
       
         return x;
      }
      else{
         throw new RuntimeException("error");
      }
   }
   public static void display(){
      for(int i=0; i< assignments.size(); i++){
         assignments.get(i).display();
      }
   }
  
}