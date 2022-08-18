package data;

public class RegionalHead extends Emp {

    private String regionName;
    private int regionPerformance;
    private int reviewRatings;

    public RegionalHead(String name, String dob, int age, double salary, NewAddress address, String regionName, int regionPerformance, int reviewRatings) {
        super(name, dob, age, salary, address);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRatings = reviewRatings;
    }

    @Override
    public double calculateIncrement(float hikePercentage) {
        double response = 0;
        if (getRegionPerformance() > 8 && getReviewRatings() > 7) {
            response = (getSalary() * 10.5) / 100;
        } else {
            response = (getSalary() * hikePercentage) / 100;
        }

        return response;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getRegionPerformance() {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance) {
        this.regionPerformance = regionPerformance;
    }

    public int getReviewRatings() {
        return reviewRatings;
    }

    public void setReviewRatings(int reviewRatings) {
        this.reviewRatings = reviewRatings;
    }
}
