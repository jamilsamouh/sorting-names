
package jojo;


public class alphabatic {
    char first,second,third,fourth,fifth;
  char y[]=new char[5];  
  
 public alphabatic (char x[]){
    y=x;
  first=y[0];
 }
/*public char Getsmallest(){
    smallest=y[0];
 for(char z: y){
 if(z <= smallest){
smallest=z;
}
}
return smallest;
}*/



public String Getalphabaticorder(){
   
    compare_alphabatic z=new compare_alphabatic();
    for(int i=1;i<y.length;++i){
        if(i==1){
            z=new compare_alphabatic(first,y[i]);
            first=z.smaller;
            second=z.bigger;
    }
    if(i==2){
            z= new compare_alphabatic(second,y[i]);
            second=z.smaller;
            third=z.bigger;
     if(second<first){
            z=  new compare_alphabatic(second,first);
            first=z.smaller;
            second=z.bigger;
     }
    }
     if(i==3){
        z= new compare_alphabatic(third,y[i]);
             third=z.smaller;
             fourth=z.bigger;
             if(third<=second && third<=first){
                     z=    new compare_alphabatic(third,first);
                    third=second;
                    first=z.smaller;
                    second=z.bigger;
                 
                        }else if (third<=second&& third>=first){
                                z=new compare_alphabatic(third,second);
                                second=z.smaller;
                                third=z.bigger;
             }
     }
     if(i==4){
         z=new compare_alphabatic(fourth,y[i]);
         fourth=z.smaller;
         fifth=z.bigger;
                if(fourth<=third&&fourth<=second&&fourth<=first){
                        z=new compare_alphabatic(fourth,first);
                        fourth=third;
                        third=second;
                        second=z.bigger;
                        first=z.smaller;
             
               }else if(fourth<=third&&fourth<=second&&fourth>=first){
                            z=new compare_alphabatic(fourth,second);
                            fourth=third;
                            third=z.bigger;
                            second=z.smaller;
            
         
                    }else if(fourth<=third&&fourth>=second&&fourth>=first){
                                z=new compare_alphabatic(fourth,third);
                                fourth=z.bigger;
                                third=z.smaller;
                                second=second;
      
         }
     
     }
    }
    
 

return ""+first+second+third+fourth+fifth;
}
}