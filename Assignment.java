/*

   This class accepts a string, validated then split into two which:
   The left part is the Identifier
   The right part is the expression
*/
class Assignment{
   private String s;
   private Identifier identifier;
   private ExpEvaluator expression; 

   public Assignment(String s){
      this.s = s;
      validAssigment();
   }

   void validAssigment(){
      if(s.endsWith(";") && s.contains("=")){
         String[] array = s.split("=");
         
         if(array.length == 2){
            // Create an instance if Identifier class
            identifier = new Identifier(array[0].trim());
           
            String str = array[1].replace(";", "");
            //create an instance of ExpEvalutor class
            expression = new ExpEvaluator(str.trim());
         }
         else{
            throw new RuntimeException("Invalid Assignment");
         }
      }
      else{
         throw new RuntimeException("syntax error");
      }
    
   }
   // 
   String getIdentifier(){
      if(identifier.isValidIdentifier()){
         return identifier.getIdentifier();
      }
      else{
         throw new RuntimeException("error");
      }
      
      
   }
   int getExpression(){
      return expression.eval();
   }
   int getExpValue(){
      return expression.getExpression();
   }
   public void display(){
      System.out.println(getIdentifier() + " = "+getExpression());
   }


}