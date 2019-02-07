 


public class ShortCalculator {
    
    public Short add(short baseValue, short difference) {
        short total = (short)(baseValue + difference);
    
        return total;
    }
    
    public Short subtract(short baseValue, short difference) {
        short total = (short)(baseValue - difference);
    
        return total;
    }
    
    public Short divide(short dividend, short divisor) {
        short total = (short)(dividend / divisor);
    
        return total;
    }
    
    public Short multiply(short multiplicand, short multiplier) {
        short total = (short)(multiplier * multiplicand);
    
        return total;
    }
    
    public Short mod(short number, short modNum) {
        short remainder = (short)(number % modNum);
    
        return remainder;
    }
}
