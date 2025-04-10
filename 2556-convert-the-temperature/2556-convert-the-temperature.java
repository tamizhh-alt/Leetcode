class Solution {
    public double[] convertTemperature(double celsius) {
        double f = (celsius * 9/5) +32;
        double k = celsius + 273.15;

        double[] con = new double[2];
        for(int i=0; i<2; i++) {
            con[0] = k;
            con[1] = f;
        }
        return con;
    }
}