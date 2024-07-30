public class ShortestPath {
    public static float getShortestPath(String direction){
        int x=0;int y=0;
        for(int i=0;i<direction.length();i++){
            char dir=direction.charAt(i);
            if(dir=='N'){
                y++;
            }else if (dir=='S') {
                y--;
            }else if (dir=='E') {
                x++;
            }else{
                x--;
            }


        }
        
        int x2=x*x;
        int y2=y*y;
       return (float)Math.sqrt(x2+y2);
    }
    public static void  main(String []args){
        String direction="WNEENESENNN";
        System.out.println(getShortestPath(direction));

 // code to print largesgt string
        String fruits[]={"apple","mango","orange"};
         String largest=fruits[0];
         for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
         }
         System.out.println(largest);
        
    }
}
