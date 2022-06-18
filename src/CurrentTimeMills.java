public class CurrentTimeMills {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        long currentTime = returnCurrent(currentTimeMillis);
        System.out.println("Current time is millies - " + currentTime);
    }

    public static long returnCurrent(long currentTimeMillis) {
        long xtype = 10000;
        if ((currentTimeMillis + xtype) > currentTimeMillis)
            return (currentTimeMillis + xtype);

        return currentTimeMillis;
    }


}
