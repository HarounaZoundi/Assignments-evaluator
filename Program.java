import java.util.ArrayList;

public class Program {

   static private ArrayList<Assignment> assignments = new ArrayList<>() ;
   
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