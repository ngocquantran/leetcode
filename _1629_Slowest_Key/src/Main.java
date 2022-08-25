public class Main {
    public static void main(String[] args) {
        int[] releaseTimes={23,34,43,59,62,80,83,92,97};
        String keys="qgkzzihfc";
        System.out.println(slowestKey(releaseTimes,keys));


    }
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxTime=releaseTimes[0];
        char result=keysPressed.charAt(0);
        int indexMax=0;
        for(int i=1;i<keysPressed.length();i++){
            System.out.println("i: "+i+" - "+"time: "+(releaseTimes[i]-releaseTimes[i-1]));
            System.out.println(maxTime);

            if (releaseTimes[i]-releaseTimes[i-1]>maxTime || (releaseTimes[i]-releaseTimes[i-1]==maxTime && keysPressed.charAt(i)-keysPressed.charAt(indexMax)>0) ){


                maxTime=releaseTimes[i]-releaseTimes[i-1];
                result=keysPressed.charAt(i);
                indexMax=i;
            }
        }
        return result;

    }

}
