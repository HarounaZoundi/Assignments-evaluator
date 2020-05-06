class Assignment{
   private String s;
   private Identifier identifier;
   private ExpEvaluator expression; 


   public Assignment(String s){
      this.s = s;
      validAssigment();
   }
   void validAssigment(){
      //System.out.println(" in valid before if" );
      if(s.endsWith(";") && s.contains("=")){
         String[] array = s.split("=");
         
         if(array.length == 2){
            //System.out.println(array[0] + "\n" + array[1] );
            identifier = new Identifier(array[0].trim());
           
            String str = array[1].replace(";", "");
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
   String getIdentifier(){
      if(identifier.isValidIdentifier()){
         return identifier.getIdentifier();
      }
      else{
         throw new RuntimeException("error");
      }
      
      
   }
   int getExpression(){
   //problem is here
      return expression.eval();
   }
   int getExpValue(){
      return expression.getExpression();
   }
   public void display(){
      System.out.println(getIdentifier() + " = "+getExpression());
   }


}