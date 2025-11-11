class Solution {
    public double[] convertTemperature(double celsius) {
        
        double kevin = celsius + 273.15;
        double fahrenheit = (celsius * 1.8) + 32;

        return new double[] {kevin, fahrenheit};
    }
}