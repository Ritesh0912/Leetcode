class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        double Kelvin = celsius + 273.15;
        double fahrenheit = (celsius*9/5) + 32;
        ans[0] = Kelvin;
        ans[1] = fahrenheit;
        return ans;
    }
}