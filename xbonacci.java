public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] results= new double[n];
      
      if(n==0){
         double[] x = {};
         return x;
       }
      
        results[0] = s[0];
      if(n==1){
        return results;
      }
        results[1] = s[1];
      if(n==2){
        return results;
      }
        results[2] = s[2];
      
      for (int i = 3; i < results.length; i++){
        results[i]= results[i-1]+ results[i-2]+ results[i-3];
      }
       
        return results;
       
    }
  }