package metrics;

public class MinMaxMetrics {

    // Add all necessary member variables
    private volatile long minValue;
    private volatile long maxValue;


    /**
     * Initializes all member variables
     */
    public MinMaxMetrics() {
        this.minValue = Long.MAX_VALUE;
        this.maxValue = Long.MIN_VALUE;
    }

    /**
     * Adds a new sample to our metrics.
     */
    public void addSample(long newSample) {
        synchronized (this) {
            this.minValue = Math.min(this.minValue, newSample);
            this.maxValue = Math.max(this.maxValue, newSample);
        }
        // Add code here
    }

    /**
     * Returns the smallest sample we've seen so far.
     */
    public long getMinValue() {
        return minValue;
    }

    /**
     * Returns the biggest sample we've seen so far.
     */
    public long getMaxValue() {
        return maxValue;
    }
}