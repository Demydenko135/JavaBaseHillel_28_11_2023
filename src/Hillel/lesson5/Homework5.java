package Hillel.lesson5;

public class Homework5 {
    public static void main(String[] args) {
//       int a = 5;
//        System.out.println(++a == 6);

        String A = "t,b,n,m,s,f,y,g,q,k,l,r,z,u,v,d,c,i,a,w,h,j,o,x,e,p,u,n,a,k,b,g,l,m,c,t,f,h,z,x,i,w,d,s,y,v,e,r,j,o,q,p,r,k,u,l,j,a,g,s,f,e,c,d,b,m,x,y,w,h,t,i,o,x,u,q,z,v,k,p,n,g,m,e,d,c,w,r,y,h,x,i,t,l,n,f,o,q,v,b,r,s,e,p,w,d,z,g,k,u,f,i,t,h,y,j,x,e,c,u,p,z,d,b,q,f,m,n,o,x,s,c,j,y,k,w,h,x,o,r,q,i,z,j,g,u,r,h,f,b,a,s,w,l,t,u,f,q,a,v,i,j,h,t,p,z,l,e,m,k,c,r,y,n,f,v,p,d,x,o,b,a,q,y,l,s,e,i,v,g,c,w,l,b,j,h,z,f,i,a,t,u,y,g,o,s,k,i,x,t,h,m,l,p,w,d,k,o,r,z,c,v,b,e,d,f,q,a,h,j,k,i,f,p,n,s,c,w,z,h,t,g,l,x,e,p,r,i,u,x,h,l,k,f,b,s,z,o,m,c,d,i,x,q,v,n,t,w,b,g,j,u,s,l,r,z,p,x,y,j,v,s,x,o,p,c,a,n,q,m,y,e,i,r,k,g";
        String C = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String[] alphabet = C.split(",");


        String[] B = A.split(",");
//        for (String element: B ){
//            System.out.println(element);
//    }

        for (int j = 0; j < alphabet.length; j++){
            int result = 0;
            for (int i = 0; i < B.length; i++){
                if (alphabet[j].equals(B[i])){
                    result++;}
            }
            System.out.println("Кількість букв  " + alphabet[j] + ": " + result);
        }
    }
}
